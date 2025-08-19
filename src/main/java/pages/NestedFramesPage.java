package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage extends Pages {
	public By parentFrames = By.xpath("//iframe[@id='frame1']");
	public By childFrames = By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']");
	public By txtParentFrames = By.xpath("//body[text()='Parent frame']");
	public By txtChildFrames = By.xpath("//p[text()='Child Iframe']");

	public NestedFramesPage(WebDriver dr) {
		super(dr);
	}

	public void getNestedFrames() {
		WebElement parentElement = testBase.driver.findElement(parentFrames);
		testBase.driver.switchTo().frame(parentElement);
		testBase.driver.switchTo().parentFrame();
		WebElement childElement = testBase.driver.findElement(childFrames);
		testBase.driver.switchTo().frame(childElement);
		testBase.driver.switchTo().defaultContent();
	}
}
