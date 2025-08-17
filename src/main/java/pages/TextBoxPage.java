 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.model.TextBoxForms;
public class TextBoxPage extends Pages {
	public By txtFullName = By.id("userName");
	public By txtEmail = By.id("userEmail");
	public By txtCurrentAddress = By.id("currentAddress");
	public By txtPermanentAddress = By.id("permanentAddress");
	public By btSubmit = By.xpath("//button[@id='submit']");
	public By lbName = By.id("name");
	public By lbEmail = By.id("email");
	public By lbCurrentAddress = By.xpath("//p[@id='currentAddress']");
	public By lbPermanentAddress = By.xpath("//p[@id='permanentAddress']");
	public TextBoxPage(WebDriver dr) {
		super(dr);
	}
	public void inputData(TextBoxForms tf) {
		testBase.zoomOut("80%");
		testBase.inputData(txtFullName, tf.fullName);
		testBase.inputData(txtEmail, tf.email);
		testBase.inputData(txtCurrentAddress, tf.currentAddress);
		testBase.inputData(txtPermanentAddress, tf.permanentAddress);
		testBase.clickOnElement(btSubmit);
	}
	
	public String getActualResult(By locator) {
		String result = "";
		String fullText = webDriver.findElement(locator).getText();
		String[] value = fullText.split(":");
		result = value[1].trim();
		return result;
		
	}
}

