package tests;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePages;
import pages.LinksPage;

public class LinksTest extends TestCase {

	@Test
	public void testOpenNewTab() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		LinksPage linksPage = elementsPage.clickOnLinksPage();
		linksPage.openNewTabHome();
		linksPage.selectLinksWillSend();
	}
}
