package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends Pages {
	public By rdYes = By.xpath("//label[@for='yesRadio']");
	public By rdImpressive = By.xpath("//label[@for='impressiveRadio']");
	public By resultText = By.xpath("//span[@class='text-success']");
	public RadioButtonPage(WebDriver dr) {
		super(dr);
	}
	
	public void clickYesOnRadioButton() {
		testBase.zoomOut("80%");
		testBase.scrollToElement(rdYes);
		testBase.driver.findElement(rdYes).click();
	}
	public void clickImpressiveOnRadioButton() {
		testBase.zoomOut("80%");
		testBase.scrollToElement(rdImpressive);
		testBase.clickOnElement(rdImpressive);
	}
	public String getActualResult(By resultText) {
		String result = webDriver.findElement(resultText).getText().trim();
		return result;
	}

}
