package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccordianPage extends Pages {
 public By txtHeading1 = By.xpath("//div[@id='section1Heading']");
 public By txtContent1 = By.xpath("//div[@id='section1Content']");
 public By txtHeading2 = By.xpath("//div[@id='section2Heading']");
 public By txtContent2 = By.xpath("//div[@id='section2Content']");
 public By txtHeading3 = By.xpath("//div[@id='section3Heading']");
 public By txtContent3 = By.xpath("//div[@id='section3Content']");
	public AccordianPage(WebDriver dr) {
		super(dr);
	}
	public void selectSection1() {
		testBase.scrollToElement(txtHeading1);
		testBase.clickOnElement(txtHeading1);
	}
	public void selectSection2() {
		testBase.scrollToElement(txtHeading2);
		testBase.clickOnElement(txtHeading2);
	}
	public void selectSection3() {
		testBase.scrollToElement(txtHeading3);
		testBase.clickOnElement(txtHeading3);
	}
	public String getActualResultContent1() {
		String content1 = testBase.driver.findElement(txtContent1).getText();
		return content1;
	}
	public String getActualResultContent2() {
		String content2 = testBase.driver.findElement(txtContent2).getText();
		return content2;
	}
	public String getActualResultContent3() {
		String content3 = testBase.driver.findElement(txtContent3).getText();
		return content3;
	}


	
}
