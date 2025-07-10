package tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends TestCase  {
	@Test
	
	public void submitSuccessfully() {
		String fullName = "kieuanh";
		String email ="anh123@gmail.com";
		String currentAddress = "duong1";
		String permanentAddress = "duong1";
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElements();
		TextBoxPage textBoxPage = elementsPage.clickOnTextBoxPage();
		textBoxPage.inputData(fullName, email, currentAddress, permanentAddress);
		String actualName = textBoxPage.getActualResults(textBoxPage.lblName);
		assertEquals(actualName, fullName);
		String actualEmail = textBoxPage.getActualResults(textBoxPage.lblEmail);
		assertEquals(actualEmail, email);
		String actualCurrentAddress = textBoxPage.getActualResults(textBoxPage.lblCurrentAddress);
		assertEquals(actualCurrentAddress, currentAddress);
		String actualPermanentAddress = textBoxPage.getActualResults(textBoxPage.lblPermanentAddress);
		assertEquals(actualPermanentAddress, permanentAddress);
		
		
		
		
	}
 	
}
