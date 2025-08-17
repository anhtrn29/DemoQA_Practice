package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends Pages {
	public By btClickSeeAlert = By.xpath("//button[@id='alertButton']");
	public By btTimeAlert = By.xpath("//button[@id='timerAlertButton']");
	public By btComfirmAlert = By.xpath("//button[@id='confirmButton']");
	public By btPromptAlert = By.xpath("//button[@id='promtButton']");
	public By resultConfirmAlert = By.xpath("//span[@id='confirmResult']");
	public By resultPromptAlert = By.xpath("//span[@id='promptResult']");
	public AlertsPage(WebDriver dr) {
		super(dr);
	}
	public void isClickButtonSeeAlert() {
		testBase.scrollToElement(btClickSeeAlert);
		testBase.clickOnElement(btClickSeeAlert);
	}
	public void acceptClickAlert() {
		Alert alert = testBase.driver.switchTo().alert();
		alert.accept();
	}
	public void isTimeAlert() {
		testBase.scrollToElement(btTimeAlert);
		testBase.clickOnElement(btTimeAlert);
	}
	public void acceptTimeAlert(int timeInSeconds) {
		new WebDriverWait(webDriver, Duration.ofSeconds(timeInSeconds))
		.until(ExpectedConditions.alertIsPresent());
		Alert alert = testBase.driver.switchTo().alert();
		alert.accept();
	}
	public void isComfirmAlert() {
		testBase.scrollToElement(btComfirmAlert);
		testBase.clickOnElement(btComfirmAlert);
	}
	public String getActualResultConFirmAlert() {
		String result = testBase.driver.findElement(resultConfirmAlert).getText();
		return result;
	}
	public void acceptConfirmAlert() {
		Alert alert = testBase.driver.switchTo().alert();
		alert.accept();
	}
	public void cancelConfirmAlert() {
		Alert alert = testBase.driver.switchTo().alert();
		alert.dismiss();
	}
	public void isPromptAlert() {
		testBase.scrollToElement(btPromptAlert);
		testBase.clickOnElement(btPromptAlert);
	}
	public void acceptPromptAlert() {
		Alert alert = testBase.driver.switchTo().alert();
		alert.sendKeys("Hương");
		alert.accept();
	}
	public String getActualResultPromptAlert() {
		String result = testBase.driver.findElement(resultPromptAlert).getText();
		return result;
	}
}
