package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AlertsFrameWindowsPage;
import pages.FramesPage;
import pages.HomePages;

public class FramesTest extends TestCase {

	@Test
	public void testFrames() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		FramesPage framesPage = alertsFrameWindowsPage.clickOnFramesPage();
		String actualResulttext1 = framesPage.getTextInsideFrame(framesPage.frame1, framesPage.txtFramesText);
		assertTrue(actualResulttext1.contains("This is a sample page"));
	}
}
