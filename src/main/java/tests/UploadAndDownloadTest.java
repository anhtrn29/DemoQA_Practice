package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePages;
import pages.UploadAndDownloadPage;

public class UploadAndDownloadTest extends TestCase  {
	@Test
	public void testClickOnUploadAndDownload() {
		HomePages homePages = new HomePages(testBase.driver);
		ElementsPage elementsPage = homePages.clickOnElementsPage();
		UploadAndDownloadPage uploadAndDownloadPage = elementsPage.clickOnUploadAndDownloadPage();
		uploadAndDownloadPage.selectUploadAndClickOnDownload();
		String actualResultUpload = uploadAndDownloadPage.getActualResult(uploadAndDownloadPage.resultText);
		assertTrue(actualResultUpload.contains("C:\\fakepath\\LOGO TRƯỜNG.png"));
	}
}
