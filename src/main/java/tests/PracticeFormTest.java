package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTest extends TestCase {
@Test
	public void submitSucessfully() {
	String firstName = "anh";
	String lastName = "tran";
	String email = "anhtran@gmail.com";
	String gender = "Female";
	String mobile = "0234567832";
	String dateOfBirth = "3 June 1999";
	String subjects = "English, Computer Science, Biology";
	String hobbies = "Sports, Reading, Music";
	String picture ="C:\\01AutomationTest\\03Practices\\03Git\\DemoQA_Practice\\testcase\\testData\\LOGO TRƯỜNG.png";
	String currentAddress = "duong so 15";
	String state = "NCR";
	String city = "Delhi";
	
	HomePage homePage = new HomePage(testBase.driver);
	FormsPage formsPage = homePage.clickOnFormsPage();
	PracticeFormPage practiceFormPage = formsPage.clickOnPracticeFormPage();
	practiceFormPage.inputData(firstName, lastName, email, gender, mobile, dateOfBirth, subjects, hobbies, picture, currentAddress, state, city);
	String expectedStudentName = firstName + " " + lastName;
	String actualStudentName = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Student Name");
	assertEquals(actualStudentName, expectedStudentName);
	String actualStudentEmail = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Student Email");
	assertEquals(actualStudentEmail, email);
	String actualGender = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr,"Gender");
	assertEquals(actualGender, gender);
	String actualMobile = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Mobile");
	assertEquals(actualMobile, mobile);
	String expectedDateOfBirth = practiceFormPage.formatDate(dateOfBirth);
	String actualDateOfBirth = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Date of Birth");
	assertEquals(actualDateOfBirth, expectedDateOfBirth);
	String actualSubject = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Subjects");
	assertEquals(actualSubject, subjects);
	String actualHobbies = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Hobbies");
	assertEquals(actualHobbies, hobbies);
	int doubleSlashIndex = picture.lastIndexOf("\\");
	String expectedPicture = picture.substring(doubleSlashIndex +1 , picture.length());
	String actualPicture = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Picture");
	assertEquals(actualPicture, expectedPicture);
	String actualAddress = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Address");
	assertEquals(actualAddress, currentAddress);
	String expectedStateAndCity = state + " " + city;
	String actualStateAndCity = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "State and City");
	assertEquals(actualStateAndCity, expectedStateAndCity);
	}	

}
