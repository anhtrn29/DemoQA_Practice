package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicPropertiesPage extends Pages {
	public By btEnable = By.xpath("//button[@id='enableAfter']");
	public By btColor = By.xpath("//button[@id='colorChange']");
	public By btVisible = By.xpath("//button[@id='visibleAfter']");
	public DynamicPropertiesPage(WebDriver dr) {
		super(dr);
	}
	public void isButtonWillEnable5s() {
		testBase.scrollToElement(btEnable);
		testBase.driver.findElement(btEnable).isEnabled();
		testBase.waitForElement(btEnable, 5);
	}
	public void clickOnButtonColorChange() {
		testBase.scrollToElement(btColor);
		testBase.driver.findElement(btColor).getCssValue("color");
	}
	public boolean isVisibleAfterDislayed() {
		testBase.scrollToElement(btVisible);
		boolean value = testBase.driver.findElement(btVisible).isDisplayed();
		testBase.waitForElement(btVisible, 5);
		return value;
	}
		
}
