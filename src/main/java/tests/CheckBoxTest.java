package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;

public class CheckBoxTest extends TestCase {

	@Test
	public void testExpandAllCheckBox() {
		HomePage homePage = new HomePage(testBase.driver);
		ElementsPage elementsPage = homePage.clickOnElements();
		CheckBoxPage checkBoxPage = elementsPage.clickOnCheckBoxPage();
		checkBoxPage.expandAllCheckBox();
		checkBoxPage.selectAllCheckBox();
		String actualResultCheckBox = checkBoxPage.getActualResults(checkBoxPage.resultText);
		assertTrue(actualResultCheckBox.contains("You have selected")&&
				   actualResultCheckBox.contains("home"));
	}

}
