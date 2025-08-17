package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import common.Utils;
import pages.ElementsPage;
import pages.HomePages;
import pages.WebTablesPage;
import tests.model.RegistrationForm;

public class WebTablesTest extends TestCase {

	@Test
	public void testAllWebTables() {
		Utils utils = new Utils();
		String fileName = "RegistrationData.xls";
		String sheetName = "Sheet5";
		String projectFolder = System.getProperty("user.dir");
		String excelFile = projectFolder + "\\testcase\\testdata\\" + fileName;
		String[][] registrationData = utils.getTableObject(excelFile, sheetName);
		
		RegistrationForm registrationForm = new RegistrationForm();
		registrationForm.firstName = registrationData[0][0];
		registrationForm.lastName = registrationData[0][1];
		registrationForm.email = registrationData[0][2];
		registrationForm.age = registrationData[0][3];
		registrationForm.salary = registrationData[0][4];
		registrationForm.department = registrationData[0][5];
		
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		WebTablesPage webTablesPage = elementsPage.clickOnWebTablesPage();
		webTablesPage.selectAndClickRegistrationForm(registrationForm);
		webTablesPage.clickOnSearchBox(registrationForm);
		String actualResultOfWebTables = webTablesPage.getActualResult(webTablesPage.resultText);
		assertTrue(actualResultOfWebTables.contains(registrationForm.firstName.toLowerCase())&&
				   actualResultOfWebTables.contains(registrationForm.lastName.toLowerCase())&&
				   actualResultOfWebTables.contains(registrationForm.email.toLowerCase())&&
				   actualResultOfWebTables.contains(registrationForm.age.toLowerCase())&&
				   actualResultOfWebTables.contains(registrationForm.salary.toLowerCase())&&
				   actualResultOfWebTables.contains(registrationForm.department.toLowerCase()));
		
	}
	
	
}
