package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ModalDialogsPage extends Pages {
	public By btSmallModal = By.xpath("//button[@id='showSmallModal']");
	public By txtSmallModal = By.xpath("//div[@class='modal-body']");
	public By btCloseSmallModal = By.xpath("//button[@id = 'closeSmallModal']");
	public By btLargeModal = By.xpath("//button[@id='showLargeModal']");
	public By txtLargeModal = By.xpath("//div[@class='modal-body']");
	public By btCloseLargeModal = By.xpath("//button[@id = 'closeLargeModal']");
	public ModalDialogsPage(WebDriver dr) {
		super(dr);
	}
	public String selectSmallModal() {
		testBase.scrollToElement(btSmallModal);
		testBase.clickOnElement(btSmallModal);
		testBase.clickOnElement(btCloseSmallModal);;
		String fullText = testBase.driver.findElement(txtSmallModal).getText();
		return fullText;
	}
	public String selectLargeModal() {
		testBase.scrollToElement(btLargeModal);
		testBase.clickOnElement(btLargeModal);
		testBase.clickOnElement(btCloseLargeModal);
		String fullText = testBase.driver.findElement(txtLargeModal).getText();
		return fullText;
	}

}
