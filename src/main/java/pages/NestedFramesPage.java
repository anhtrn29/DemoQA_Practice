package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends Pages {
	public By childIFrame = By.xpath("//p[text()='Child Iframe']");
	public By parentIFrame = By.id("frame1");
	public NestedFramesPage(WebDriver dr) {
		super(dr);
	}
	
}
