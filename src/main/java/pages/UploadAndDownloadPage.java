package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownloadPage extends Pages {
	public By lbDownload = By.xpath("//a[@id='downloadButton']");
	public By lbUpload = By.xpath("//input[@id='uploadFile']");
	public By resultText = By.xpath("//p[@id='uploadedFilePath']");
	public UploadAndDownloadPage(WebDriver dr) {
		super(dr);
	}
	public void selectUploadAndClickOnDownload() {
		testBase.scrollToElement(lbDownload);
		testBase.clickOnElement(lbDownload);
		File upload = new File("C:\\01AutomationTest\\03Practices\\03Git\\DemoQA_Practice\\testcase\\testdata\\LOGO TRƯỜNG.png");
		WebElement fileElement = testBase.driver.findElement(lbUpload);
		fileElement.sendKeys(upload.getAbsolutePath());	
	}
	public String getActualResult(By locator) {
		String fullText = testBase.driver.findElement(resultText).getText();
		return fullText;
	}
}
