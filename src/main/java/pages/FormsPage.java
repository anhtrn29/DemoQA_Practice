package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends Pages {
	public By lbPracticeForm = By.xpath("//span[text()='Practice Form']");
	public FormsPage(WebDriver dr) {
		super(dr);
	}
		public PracticeFormPage clickOnPracticeFormPage() {
			testBase.clickOnElement(lbPracticeForm);
			return new PracticeFormPage(webDriver);
		}
}
