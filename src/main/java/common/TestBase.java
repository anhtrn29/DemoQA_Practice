package common;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public WebDriver driver;
	public String mainWindowHandle;

	public void openWeb(String url, String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.getProperty("webDriver.chrome.driver",
					"C:\\01AutomationTest\\03Practices\\03Git\\DemoQA_Practice\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.getProperty("webDriver.edge.driver",
					"C:\\01AutomationTest\\03Practices\\03Git\\DemoQA_Practice\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void scrollToEndPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0.document.body.scrollHeight)");
	}

	public void scrollToElement(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void zoomOut(String percentage) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom ='" + percentage + "'");
	}

	public void clickOnElement(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void selectButtonsClick(By locator) {
		WebElement buttonsClickElement = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.doubleClick(buttonsClickElement).perform();
		actions.contextClick(buttonsClickElement).perform();
		actions.click();
	}

	public void waitForElement(By locator, int seconds) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public void switchToNewWindow() {
		this.mainWindowHandle = driver.getWindowHandle();
		for (String handles : driver.getWindowHandles()) {
			if (!handles.equals(mainWindowHandle)) {
				driver.switchTo().window(handles);
				break;
			}
		}
	}

	public void switchToMainWindow() {
		driver.switchTo().window(mainWindowHandle);
	}

	public Alert switchToAlert() {
		return driver.switchTo().alert();

	}

	public void switchToFrames(By frameLocator) {
		WebElement frameElement = driver.findElement(frameLocator);
		driver.switchTo().frame(frameElement);
	}

	public void switchToFramesIndex(int framesIndex) {
		driver.switchTo().frame(framesIndex);
	}

	public void switchToFrameString(String frames) {
		driver.switchTo().frame(frames);
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}

	public void inputData(By locator, CharSequence text) {
		WebElement inputElement = driver.findElement(locator);
		scrollToElement(locator);
		inputElement.sendKeys(text);
	}

	public By getXpathByParam(String xpath, String text) {
		String newXpath = xpath.replace("{@param}", text);
		By rdLocator = By.xpath(newXpath);
		return rdLocator;
	}

	public void selectDropDownBoxWithVisibileText(By dropDownLocator, String visibleText) {
		WebElement dropDownElement = driver.findElement(dropDownLocator);
		Select dropDownBox = new Select(dropDownElement);
		dropDownBox.selectByVisibleText(visibleText);
	}

	public void findAndSelectComboBox(By locator, String multipleValue) {
		String[] multipleValues = multipleValue.split(",");
		WebElement multipleElement = driver.findElement(locator);
		for (int i = 0; i < multipleValues.length; i++) {
			multipleElement.sendKeys(multipleValues[i].trim());
			multipleElement.sendKeys(Keys.ENTER);
		}
	}

	public void selectComboBox(String xpath, String multipleValue) {
		String[] multipleValues = multipleValue.split(",");
		for (int i = 0; i < multipleValues.length; i++) {
			By ckLocator = getXpathByParam(xpath, multipleValues[i].trim());
			clickOnElement(ckLocator);
		}
	}

	public void selectComboBoxWithSingleValue(By cbSelect, By cbInput, String text) {
		scrollToElement(cbSelect);
		clickOnElement(cbSelect);
		inputData(cbInput, text);
		inputData(cbInput, Keys.ENTER);
	}
}
