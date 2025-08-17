package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFrameWindowsPage extends Pages {
	public By lbBrowserWindow = By.xpath("//span[text()='Browser Windows']");
	public By lbAlert = By.xpath("//span[text()='Alerts']");
	public By lbframes = By.xpath("//span[text()='Frames']");
	public AlertsFrameWindowsPage(WebDriver dr) {
		super(dr);
	}

	public BrowserWindowsPage clickOnBrowserWindowsPage() {
		testBase.scrollToElement(lbBrowserWindow);
		testBase.clickOnElement(lbBrowserWindow);
		return new BrowserWindowsPage(webDriver);
	}
	public AlertsPage clickOnAlertsPage() {
		testBase.scrollToElement(lbAlert);
		testBase.clickOnElement(lbAlert);
		return new AlertsPage(webDriver);
	}
	public FramesPage clickOnFramesPage() {
		testBase.scrollToElement(lbframes);
		testBase.clickOnElement(lbframes);
		return new FramesPage(webDriver);
	}
}
