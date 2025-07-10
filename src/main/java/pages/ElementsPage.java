package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page {
	public By lbTextBox = By.xpath("//span[text()='Text Box']");
	public By lbRadioButton = By.xpath("//span[text()='Radio Button']");	
	public ElementsPage(WebDriver dr) {
		super(dr);
	}
	
	public TextBoxPage clickOnTextBoxPage () {
		testBase.clickOnElement(lbTextBox);
		return new TextBoxPage(webDriver);
	}
	
	public RadioButtonPage clickOnRadioButtonPage() {
		testBase.clickOnElement(lbRadioButton);
		return new RadioButtonPage(webDriver);
	}
}
