package com.webOrder.steps;

import com.webOrder.pages.WebOrderLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class AuthenticationWebOrder {
    WebDriver driver = DriverHelper.getDriver();
    WebOrderLoginPage loginPage = new WebOrderLoginPage(driver);

    @Given("user enters email as {string} and password as {string} and click signIn")
    public void user_enters_email_as_and_password_as_and_click_sign_in(String email, String password) {
        loginPage.setSignIn(email,password);
    }
    @When("user validates title of login page as {string}")
    public void user_validates_title_of_login_page_as(String title) {
        Assert.assertEquals(title, BrowserUtil2.getTitleWithJS(driver));
    }
    @When("user clicks on group order radio button and click on next button")
    public void user_clicks_on_group_order_radio_button_and_click_on_next_button() {
        loginPage.clickOnGroupOrderAndNextBtn();
    }

}
