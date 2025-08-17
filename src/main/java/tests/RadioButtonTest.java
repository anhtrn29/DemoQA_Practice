package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePages;
import pages.RadioButtonPage;

public class RadioButtonTest extends TestCase {

	@Test
	public void testClickYesRadioButton() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		RadioButtonPage radioButtonPage = elementsPage.clickOnRadioButtonPage();
		radioButtonPage.clickYesOnRadioButton();
		String actualResultOfClickYes = radioButtonPage.getActualResult(radioButtonPage.resultText);
		assertEquals(actualResultOfClickYes, "Yes");
	}
	public void testClickImpressive() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		RadioButtonPage radioButtonPage = elementsPage.clickOnRadioButtonPage();
		radioButtonPage.clickImpressiveOnRadioButton();
		String actualResultOfClickImpressive = radioButtonPage.getActualResult(radioButtonPage.resultText);
		assertEquals(actualResultOfClickImpressive, "Impressive");
	}
}
