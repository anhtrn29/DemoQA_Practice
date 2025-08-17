package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends Pages {
	public By expandAll = By.xpath("//button[@title='Expand all']/*[name()='svg']");
	public By lbCheckBox = By.xpath("//label[@for='tree-node-home']");
	public By resultText = By.id("result");

	public CheckBoxPage(WebDriver dr) {
		super(dr);
	}

	public void expandAllCheckBox() {
		testBase.scrollToElement(expandAll);
		testBase.clickOnElement(expandAll);

	}

	public void selectAllCheckBox() {
		testBase.clickOnElement(lbCheckBox);
	}

	public String getActualResults(By resultText) {
		String results = webDriver.findElement(resultText).getText();
		return results;
	}

}
