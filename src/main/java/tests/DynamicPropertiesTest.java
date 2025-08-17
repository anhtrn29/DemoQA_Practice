package tests;

import org.testng.annotations.Test;

import pages.DynamicPropertiesPage;
import pages.ElementsPage;
import pages.HomePages;

public class DynamicPropertiesTest extends TestCase {

	@Test
	public void testDynamicProperties() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		DynamicPropertiesPage dynamicPropertiesPage = elementsPage.clickOnDynamicPropertiesPage();
		dynamicPropertiesPage.isButtonWillEnable5s();
		dynamicPropertiesPage.clickOnButtonColorChange();
		dynamicPropertiesPage.isVisibleAfterDislayed();
	}
}
