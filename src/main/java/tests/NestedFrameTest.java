package tests;

import org.testng.annotations.Test;

import pages.AlertsFrameWindowsPage;
import pages.HomePages;
import pages.NestedFramesPage;

public class NestedFrameTest extends TestCase {
	@Test
	public void testNestedFrames() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		NestedFramesPage nestedFramesPage = alertsFrameWindowsPage.clickOnNestedFramesPage();
		nestedFramesPage.getNestedFrames();
	}
}
