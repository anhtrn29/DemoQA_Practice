package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetPage extends Pages {
 public By lbAccordian = By.xpath("//span[text()='Accordian']");
	public WidgetPage(WebDriver dr) {
		super(dr);
	}
	public AccordianPage clickOnAccordianPage() {
		testBase.scrollToElement(lbAccordian);
		testBase.clickOnElement(lbAccordian);
		return new AccordianPage(webDriver);
	}
}
