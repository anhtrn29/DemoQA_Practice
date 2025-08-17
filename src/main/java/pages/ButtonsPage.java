package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends Pages {
	public By btDoubleClick = By.xpath("//button[@id='doubleClickBtn']");
	public By btRightClick = By.xpath("//button[@id='rightClickBtn']");
	public By btClick = By.xpath("//button[text()='Click Me']");
	public String resultTextStr = "//p[@id='{@param}']";
	public ButtonsPage(WebDriver dr) {
		super(dr);
	}

	public void selectDoubleClick() {
		testBase.scrollToElement(btDoubleClick);
		testBase.selectButtonsClick(btDoubleClick);
	}
	
	public void selectRightClick() {
		testBase.scrollToElement(btRightClick);
		testBase.selectButtonsClick(btRightClick);
	}
	public void selectToDynamicCLick() {
		testBase.scrollToElement(btClick);
		testBase.clickOnElement(btClick);
	}
	public String getActualResult(String xpath, String text) {
		By btResultLocator = testBase.getXpathByParam(xpath, text);
		String result = testBase.driver.findElement(btResultLocator).getText();
		return result;
	}
}
