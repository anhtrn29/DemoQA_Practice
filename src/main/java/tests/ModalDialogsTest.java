package tests;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AlertsFrameWindowsPage;
import pages.HomePages;
import pages.ModalDialogsPage;

public class ModalDialogsTest extends TestCase {

	@Test
	public void testSmallModal() {
		HomePages homePages = new HomePages(testBase.driver);
		AlertsFrameWindowsPage alertsFrameWindowsPage = homePages.clickOnAlertsFrameWindowsPage();
		ModalDialogsPage modalDialogsPage = alertsFrameWindowsPage.clickOnDialogsPage();
		modalDialogsPage.selectSmallModal();
		modalDialogsPage.selectLargeModal();
		String actualResultSmallModal = modalDialogsPage.selectSmallModal();
		assertTrue(actualResultSmallModal.contains("This is a small modal. It has very less content"));
		String actualResultLargeModal = modalDialogsPage.selectLargeModal();
		assertTrue(actualResultLargeModal.contains("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
	}

}
