package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends Pages {
	public By linkTab = By.xpath("//a[@id='simpleLink']");
	public By linkSend = By.xpath("//a[@id='created']");
	public LinksPage(WebDriver dr) {
		super(dr);
	}
	public void openNewTabHome() {
		testBase.scrollToElement(linkTab);
		testBase.clickOnElement(linkTab);
	}
	public void selectLinksWillSend() {
		testBase.scrollToElement(linkSend);
		testBase.clickOnElement(linkSend);
	}
	
}
