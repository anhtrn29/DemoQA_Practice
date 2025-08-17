package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage extends Pages {
	public By frame1 = By.id("frame1");
	public By frame2 = By.id("frame2");
	public By txtFramesText = By.id("sampleHeading");

	public FramesPage(WebDriver dr) {
		super(dr);
	}

	public String getTextInsideFrame(By locator, By txtFramesLocator) {
		testBase.switchToFrames(locator);
		WebDriverWait wait = new WebDriverWait(testBase.driver, Duration.ofSeconds(5));
		WebElement waitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(txtFramesLocator));
		String fullText = waitElement.getText();
		testBase.switchToDefault();
		return fullText;
		
		
	}
}
