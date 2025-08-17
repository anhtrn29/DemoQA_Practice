package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Pages {
	public By lbTextBox = By.xpath("//span[text()='Text Box']");
	public By lbCheckBox = By.xpath("//span[text()='Check Box']");
	public By lbRadioButton = By.xpath("//span[text()='Radio Button']");
	public By lbWebTables = By.xpath("//span[text()='Web Tables']");
	public By lbButtons = By.xpath("//span[text()='Buttons']");
	public By lbLinks = By.xpath("//span[text()='Links']");
	public By lbUpAndDown = By.xpath("//span[text()='Upload and Download']");
	public By lbDynamicProperties = By.xpath("//span[text()='Dynamic Properties']");
	public ElementsPage(WebDriver dr) {
		super(dr);
	}

	public TextBoxPage clickOnTextBoxPage() {
		testBase.clickOnElement(lbTextBox);
		return new TextBoxPage(webDriver);
	}
	public CheckBoxPage clickOnCheckBoxPage() {
		testBase.clickOnElement(lbCheckBox);
		return new CheckBoxPage(webDriver);
	}
	
	public RadioButtonPage clickOnRadioButtonPage() {
		testBase.clickOnElement(lbRadioButton);
		return new RadioButtonPage(webDriver);
	}
	
	public WebTablesPage clickOnWebTablesPage() {
		testBase.clickOnElement(lbWebTables);
		testBase.scrollToElement(lbWebTables);
		return new WebTablesPage(webDriver);
	}
	
	public ButtonsPage clickOnButtonsPage() {
		testBase.scrollToElement(lbButtons);
		testBase.clickOnElement(lbButtons);
		return new ButtonsPage(webDriver);
	}
	
	public LinksPage clickOnLinksPage() {
		testBase.scrollToElement(lbLinks);
		testBase.clickOnElement(lbLinks);
		return new LinksPage(webDriver);
	}
	public UploadAndDownloadPage clickOnUploadAndDownloadPage() {
		testBase.scrollToElement(lbUpAndDown);
		testBase.clickOnElement(lbUpAndDown);
		return new UploadAndDownloadPage(webDriver);
	}
	public DynamicPropertiesPage clickOnDynamicPropertiesPage() {
		testBase.scrollToElement(lbDynamicProperties);
		testBase.clickOnElement(lbDynamicProperties);
		return new DynamicPropertiesPage(webDriver);
	}
}
