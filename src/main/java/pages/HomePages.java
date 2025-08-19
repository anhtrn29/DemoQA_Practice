package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePages extends Pages {
	public By lbElements = By.xpath("//h5[text()='Elements']");
	public By lbForms = By.xpath("//h5[text()='Forms']");
	public By lbAlertFrameWindows = By.xpath("//h5[text()='Alerts, Frame & Windows']");
	public By lbWidget = By.xpath("//h5[text()='Widgets']");
	public HomePages(WebDriver dr) {
		super(dr);
	}
	public ElementsPage clickOnElementsPage() {
		testBase.zoomOut("80%");
		testBase.scrollToElement(lbElements);
		testBase.clickOnElement(lbElements);
		return new ElementsPage(webDriver);
		
	}
	public FormsPage clickOnFormsPage() {
		testBase.scrollToElement(lbForms);
		testBase.clickOnElement(lbForms);
		return new FormsPage(webDriver);
	}
	public AlertsFrameWindowsPage clickOnAlertsFrameWindowsPage() {
		testBase.scrollToElement(lbAlertFrameWindows);
		testBase.clickOnElement(lbAlertFrameWindows);
		return new AlertsFrameWindowsPage(webDriver);
	}
	public WidgetPage clickOnWidgetPage() {
		testBase.scrollToElement(lbWidget);
		testBase.clickOnElement(lbWidget);
		return new WidgetPage(webDriver);
	}
}
