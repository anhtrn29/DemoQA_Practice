package tests;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ButtonsPage;
import pages.ElementsPage;
import pages.HomePages;

public class ButtonsTest extends TestCase {

	@Test
	public void testDoubleClick() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		ButtonsPage buttonsPage = elementsPage.clickOnButtonsPage();
		buttonsPage.selectDoubleClick();
		buttonsPage.selectRightClick();
		buttonsPage.selectToDynamicCLick();
		String actualResultDoubleClick = buttonsPage.getActualResult(buttonsPage.resultTextStr, "doubleClickMessage");
		assertTrue(actualResultDoubleClick.contains("You have done a double click"));
		String actualResultRightClick = buttonsPage.getActualResult(buttonsPage.resultTextStr, "rightClickMessage");
		assertTrue(actualResultRightClick.contains("You have done a right click"));
		String actualResultDynamicClick = buttonsPage.getActualResult(buttonsPage.resultTextStr, "dynamicClickMessage");
		assertTrue(actualResultDynamicClick.contains("You have done a dynamic click"));
	}
//	@Test
	public void testRightClick() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		ButtonsPage buttonsPage = elementsPage.clickOnButtonsPage();
		buttonsPage.selectRightClick();
		String actualResultRightClick = buttonsPage.getActualResult(buttonsPage.resultTextStr, "rightClickMessage");
		assertTrue(actualResultRightClick.contains("You have done a right click"));
	}
//	@Test
	public void testDynamicClick() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		ButtonsPage buttonsPage = elementsPage.clickOnButtonsPage();
		buttonsPage.selectToDynamicCLick();
		String actualResultDynamicClick = buttonsPage.getActualResult(buttonsPage.resultTextStr, "dynamicClickMessage");
		assertTrue(actualResultDynamicClick.contains("You have done a dynamic click"));
	}
}
