package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends Page {
	public By lblPracticeForm = By.xpath("//span[text()='Practice Form']");

	public FormsPage(WebDriver dr) {
		super(dr);
	}

	public PracticeFormPage clickOnPracticeFormPage() {
		testBase.clickOnElement(lblPracticeForm);
		return new PracticeFormPage(webDriver);
	}
}
