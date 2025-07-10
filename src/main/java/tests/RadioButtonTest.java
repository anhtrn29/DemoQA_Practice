package tests;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends TestCase {
	String selectValue ="Yes";
	
	@Test
	
	public void testClickRadioButton() {
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElements();
		RadioButtonPage radioButtonPage = elementsPage.clickOnRadioButtonPage();
		radioButtonPage.selectYes(selectValue);
		String actualResultRadioButton = radioButtonPage.getActualResult();
		assertTrue(actualResultRadioButton.contains("You have selected")&& actualResultRadioButton.contains("Yes"));
	}
	
}
