package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablePage extends Page {
	public By btAdd = By.id("addNewRecordButton");
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public By txtAge = By.id("age");
	public By txtSalary = By.id("salary");
	public By txtDepartment = By.id("department");
	public By btSubmit = By.id("submit");
	public WebTablePage(WebDriver dr) {
		super(dr);
	}
	
	public void inputData(String firstName, String lastName, String email, String age, String salary, String department ) {
		testBase.zoomOut("80%");
		testBase.scrollToElement(btAdd);
		testBase.clickOnElement(btAdd);
		testBase.input(txtFirstName, firstName);
		testBase.input(txtLastName, lastName);
		testBase.input(txtEmail, email);
		testBase.input(txtAge, age);
		testBase.input(txtSalary, salary);
		testBase.input(txtDepartment, department);
		testBase.clickOnElement(btSubmit);
	}

}
