package com.qa_fox.steps_deffinitions;

import com.qa_fox.pages.QaFoxMainPage;
import com.qa_fox.pages.QaLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class QaFoxSteps {
        WebDriver driver = DriverHelper.getDriver();
        QaFoxMainPage mainPage = new QaFoxMainPage(driver);
        QaLoginPage loginPage = new QaLoginPage(driver);

    @Given("user is on main page of qa fox user click on my account and clicks login")
    public void user_is_on_main_page_of_qa_fox_user_click_on_my_account_and_clicks_login() {
        mainPage.clickOnAccountAndLogin(driver);
    }
    @Then("user is on  login page and validates title {string}")
    public void user_is_on_login_page_and_validates_title(String title) {
        Assert.assertEquals(title, BrowserUtil2.getTitleWithJS(driver));
    }

    @Then("user enters {string} and then {string} and click on ligin button and validate {string}")
    public void user_enters_and_then_and_click_on_ligin_button_and_validate(String email, String password, String errorMsg) {
        loginPage.setLogin(email,password,errorMsg,driver);
    }
}
