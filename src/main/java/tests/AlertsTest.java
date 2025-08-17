package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AlertsFrameWindowsPage;
import pages.AlertsPage;
import pages.HomePages;

public class AlertsTest extends TestCase {
	@Test
	public void testClickAlerts() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		AlertsPage alertsPage = alertsFrameWindowsPage.clickOnAlertsPage();
		alertsPage.isClickButtonSeeAlert();
		alertsPage.acceptClickAlert();
	}

	@Test
	public void testTimeAlert() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		AlertsPage alertsPage = alertsFrameWindowsPage.clickOnAlertsPage();
		alertsPage.isTimeAlert();
		alertsPage.acceptTimeAlert(6);
		
	}

	@Test
	public void testConfirmAlert() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		AlertsPage alertsPage = alertsFrameWindowsPage.clickOnAlertsPage();
		alertsPage.isComfirmAlert();
		alertsPage.acceptConfirmAlert();
//		alertsPage.cancelConfirmAlert();
		String actualResultConfirmAlert = alertsPage.getActualResultConFirmAlert();
		assertTrue(actualResultConfirmAlert.contains("You selected Ok"));
	}

	@Test
	public void testPromptAlert() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		AlertsPage alertsPage = alertsFrameWindowsPage.clickOnAlertsPage();
		alertsPage.isPromptAlert();
		alertsPage.acceptPromptAlert();
		String actualResultPromptAlert = alertsPage.getActualResultPromptAlert();
		assertTrue(actualResultPromptAlert.contains("You entered Hương"));
	}
}
