package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowsPage extends Pages {
 public By btNewTab = By.xpath("//button[@id='tabButton']");
 public By btNewWindow = By.xpath("//button[@id='windowButton']");
 public By btNewWindowMessage = By.xpath("//button[@id='messageWindowButton']");
 public By resultText = By.xpath("//h1[@id='sampleHeading']");
 
	public BrowserWindowsPage(WebDriver dr) {
		super(dr);
	}
	public void isOpenNewTab() {
		testBase.scrollToElement(btNewTab);
		testBase.clickOnElement(btNewTab);
		testBase.switchToNewWindow();
		testBase.switchToMainWindow();

	}
	public void isOpenNewWindow() {
		testBase.scrollToElement(btNewWindow);
		testBase.clickOnElement(btNewWindow);
		testBase.switchToNewWindow();
		testBase.switchToMainWindow();
	}
	public void isNewWindowMessage() {
		testBase.scrollToElement(btNewWindowMessage);
		testBase.clickOnElement(btNewWindowMessage);
		testBase.switchToNewWindow();
	}
	public String getActualResultBrowserWindows() {
		String result = webDriver.findElement(resultText).getText();
		return result;
		
	}
}
