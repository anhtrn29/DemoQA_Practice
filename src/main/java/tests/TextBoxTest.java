package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import common.Utils;
import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;
import tests.model.TextBoxForms;

public class TextBoxTest extends TestCase {

	@Test
	public void testSubmit() {
		Utils utils = new Utils();
		String fileName = "RegistrationData.xls";
		String sheetName = "Sheet4";
		String projectFolder = System.getProperty("user.dir");
		String excelFile = projectFolder + "\\testcase\\testdata\\" + fileName;
		String[][] informationData = utils.getTableObject(excelFile, sheetName);

		TextBoxForms textBoxForms = new TextBoxForms();
		textBoxForms.fullName = informationData[0][0];
		textBoxForms.email = informationData[0][1];
		textBoxForms.currentAddress = informationData[0][2];
		textBoxForms.permanentAddress = informationData[0][3];

		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElements();
		TextBoxPage textBoxPage = elementsPage.clickOnTextBoxPage();
		textBoxPage.inputData(textBoxForms);
		String actualFullName = textBoxPage.getActualResult(textBoxPage.lbName);
		assertEquals(actualFullName, textBoxForms.fullName);
		String actualEmail  = textBoxPage.getActualResult(textBoxPage.lbEmail);
		assertEquals(actualEmail, textBoxForms.email);
		String actualCurrentAddress = textBoxPage.getActualResult(textBoxPage.lbCurrentAddress);
		assertEquals(actualCurrentAddress, textBoxForms.currentAddress);
		String actualPermanentAddress = textBoxPage.getActualResult(textBoxPage.lbPermanentAddress);
		assertEquals(actualPermanentAddress, textBoxForms.permanentAddress);
	}
}
