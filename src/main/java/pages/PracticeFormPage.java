package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.model.StudyForms;

public class PracticeFormPage extends Pages {
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public String genderStr = "//label[text()='{@param}']";
	public By txtMobile = By.id("userNumber");
	public By txtDateOfBirth = By.id("dateOfBirthInput");
	public By drYear = By.xpath("//select[@class='react-datepicker__year-select']");
	public By drMonth = By.xpath("//select[@class='react-datepicker__month-select']");
	public String lbDate = "(//div[text()='{@param}'])[1]";
	public By txtSubjects = By.id("subjectsInput");
	public String rdHobbiesStr = "//label[text()='{@param}']";
	public By upLoadPics = By.xpath("//input[@id='uploadPicture']");
	public By txtcurrentAddress = By.id("currentAddress");
	public By cbState = By.id("state");
	public By cbStateInput = By.id("react-select-3-input");
	public By cbCity = By.id("city");
	public By cbCityInput = By.id("react-select-4-input");
	public By btSubmit = By.xpath("//button[@id='submit']");
	public String valueStr = "//td[text()='{@param}']/following-sibling::td";

	public PracticeFormPage(WebDriver dr) {
		super(dr);
	}
	public void inputData(StudyForms sf) {
		testBase.zoomOut("%80");
		testBase.inputData(txtFirstName, sf.firstName);
		testBase.inputData(txtLastName, sf.lastName);
		testBase.inputData(txtEmail, sf.email);
		testBase.getXpathByParam(genderStr, sf.gender);
		inputDate(sf.dateOfBirth);
		testBase.findAndSelectComboBox(txtSubjects, sf.subjects);
		testBase.selectComboBox(rdHobbiesStr, sf.hobbies);
		testBase.inputData(upLoadPics, sf.picture);
		testBase.inputData(txtcurrentAddress, sf.currentAddress);
		testBase.selectComboBoxWithSingleValue(cbState, cbStateInput, sf.state);
		testBase.selectComboBoxWithSingleValue(cbCity, cbCityInput, sf.city);
		testBase.clickOnElement(btSubmit);
	}
	
	public void inputDate(String dateOfBirth) {
		String[]dateOfBirths = dateOfBirth.split(" ");
		testBase.clickOnElement(txtDateOfBirth);
		testBase.selectDropDownBoxWithVisibileText(drYear, dateOfBirths[2].trim());
		testBase.selectDropDownBoxWithVisibileText(drMonth, dateOfBirths[1].trim());
		By lbDateLocator = testBase.getXpathByParam(lbDate, dateOfBirths[0].trim());
		testBase.clickOnElement(lbDateLocator);
	}
	public String getValueByFieldName(String originalXpath, String fieldName) {
		By studentNameLocator = testBase.getXpathByParam(originalXpath, fieldName);
		String fullText = testBase.driver.findElement(studentNameLocator).getText();
		return fullText;
	}
	
}
