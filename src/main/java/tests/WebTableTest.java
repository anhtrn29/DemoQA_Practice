package tests;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablePage;

public class WebTableTest extends TestCase {
	@Test
	
	public void submitRegistrationForm() {
		String firstName = "anh";
		String lastName = "tran";
		String email = "anh123@gmail.com";
		String age = "25";
		String salary = "1000";
		String department = "abc";
		
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElements();
		WebTablePage webTablePage = elementsPage.clickOnWebTablePage();
		webTablePage.inputData(firstName, lastName, email, age, salary, department);
	}
}
