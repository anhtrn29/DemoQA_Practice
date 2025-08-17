 package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import common.Utils;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import tests.model.StudyForms;

public class PracticeFormTest extends TestCase {
	@Test
	public void testSubmitSusscessfully() {
		Utils utils = new Utils();
		String fileName = "RegistrationData.xls";
		String sheetName = "Sheet1";
		String projectFolder = System.getProperty("user.dir");
		String excelFile = projectFolder + "\\testcase\\testData\\" + fileName;
		String[][] registrationData = utils.getTableObject(excelFile, sheetName);

		StudyForms studyForms = new StudyForms();
		studyForms.firstName = registrationData[2][0];
		studyForms.lastName = registrationData[2][1];
		studyForms.email = registrationData[2][2];
		studyForms.gender = registrationData[2][3];
		studyForms.mobile = registrationData[2][4];
		studyForms.dateOfBirth = registrationData[2][5];
		studyForms.subjects = registrationData[2][6];
		studyForms.hobbies = registrationData[2][7];
		studyForms.picture = projectFolder + "\\testcase\\testData\\" + registrationData[2][8];
		studyForms.currentAddress = registrationData[2][9];
		studyForms.state = registrationData[2][10];
		studyForms.city = registrationData[2][11];

		HomePage homePage = new HomePage(testBase.driver);
		FormsPage formsPage = homePage.clickOnFormsPage();
		PracticeFormPage practiceFormPage = formsPage.clickOnPracticeFormPage();
		practiceFormPage.inputData(studyForms);

		String expectedStudentName = studyForms.firstName + " " + studyForms.lastName;
		String actualStudentName = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Student Name");
		assertEquals(actualStudentName, expectedStudentName);
		String actualStudentEmail = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Student Email");
		assertEquals(actualStudentEmail, studyForms.email);
		String actualGender = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Gender");
		assertEquals(actualGender, studyForms.gender);
		String actualMobile = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Mobile");
		assertEquals(actualMobile, studyForms.mobile);
		String actualDateOfBirth = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Date of Birth");
		assertEquals(actualDateOfBirth, studyForms.dateOfBirth);
		String actualSubjects = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Subjects");
		assertEquals(actualSubjects, studyForms.subjects);
		String actualHobbies = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Hobbies");
		assertEquals(actualHobbies, studyForms.hobbies);
		int DoubleSlashIndex = studyForms.picture.lastIndexOf("\\");
		String expectedPicture = studyForms.picture.substring(DoubleSlashIndex + 1, studyForms.picture.length());
		String actualPicture = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Picture");
		assertEquals(actualPicture, expectedPicture);
		String actualAddress = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "Address");
		assertEquals(actualAddress, studyForms.currentAddress);
		String expectedStateAndCity = studyForms.state + " " + studyForms.city;
		String actualStateAndCity = practiceFormPage.getValueByFieldName(practiceFormPage.valueStr, "State and City");
		assertEquals(actualStateAndCity, expectedStateAndCity);
	}

}
