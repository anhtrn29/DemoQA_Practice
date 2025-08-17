package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AlertsFrameWindowsPage;
import pages.BrowserWindowsPage;
import pages.HomePages;

public class BrowserWindowsTest extends TestCase{
	@Test
	public void testBrowserWindows() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		BrowserWindowsPage browserWindowsPage = alertsFrameWindowsPage.clickOnBrowserWindowsPage();
		browserWindowsPage.isOpenNewTab();
		browserWindowsPage.isOpenNewWindow(); 
		browserWindowsPage.isNewWindowMessage();
		String actualResultBrowserWindow = browserWindowsPage.getActualResultBrowserWindows();
		String expectedResultBrowserWindow = "This is a sample page";
		assertEquals(actualResultBrowserWindow, expectedResultBrowserWindow);
		
	}
}
