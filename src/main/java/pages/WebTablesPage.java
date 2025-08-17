package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.model.RegistrationForm;

public class WebTablesPage extends Pages {
	public By btAdd = By.xpath("//button[@id='addNewRecordButton']");
	public By txtFirstName = By.xpath("//input[@id='firstName']");
	public By txtLastName = By.xpath("//input[@id='lastName']");
	public By txtEmail = By.xpath("//input[@id='userEmail']");
	public By txtAge = By.xpath("//input[@id='age']");
	public By txtSalary = By.xpath("//input[@id='salary']");
	public By txtDepartment = By.xpath("//input[@id='department']");
	public By btSubmit = By.xpath("//button[@id='submit']");
	public By resultText = By.xpath("//div[@class='rt-tbody']");
	public By sbSearchBox = By.xpath("//input[@id='searchBox']");
	public WebTablesPage(WebDriver dr) {
		super(dr);
	}

	public void selectAndClickRegistrationForm(RegistrationForm rf) {
		testBase.zoomOut("70%");
		testBase.clickOnElement(btAdd);
		testBase.inputData(txtFirstName, rf.firstName);
		testBase.inputData(txtLastName, rf.lastName);
		testBase.inputData(txtEmail, rf.email);
		testBase.inputData(txtAge, rf.age);
		testBase.inputData(txtSalary, rf.salary);
		testBase.inputData(txtDepartment, rf.department);
		testBase.clickOnElement(btSubmit);
	}
	public void clickOnSearchBox(RegistrationForm rf) {
		testBase.clickOnElement(sbSearchBox);
		testBase.inputData(sbSearchBox, "Giang");
	}
	
	public String getActualResult(By resultText) {
		String result = webDriver.findElement(resultText).getText().toLowerCase();
		return result;
	}
}
