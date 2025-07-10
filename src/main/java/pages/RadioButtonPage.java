package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends Page {
	public By rdYes = By.xpath("//label[@for='yesRadio']");
	public By resultText = By.xpath("//span[@class='text-success']");
	public RadioButtonPage(WebDriver dr) {
		super(dr);
	}
	
	public void selectYes(String text) {
		testBase.driver.findElement(rdYes).click();;
	}
	
	public String getActualResult() {
		testBase.driver.findElement(resultText);
		return getActualResult();
	}
}
