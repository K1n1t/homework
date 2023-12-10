package com.open_cart.steps;

import com.open_cart.pages.OpenCartLoginPage;
import com.open_cart.pages.OpenCartMainPage;
import com.open_cart.pages.OpenCartRecordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class Authentication {
    WebDriver driver = DriverHelper.getDriver();
    OpenCartLoginPage loginPage = new OpenCartLoginPage(driver);
    OpenCartMainPage mainPage = new OpenCartMainPage(driver);
    @When("user is on login page user validates title is {string}")
    public void user_is_on_login_page_user_validates_title_is(String title) {
        Assert.assertEquals(title, BrowserUtil2.getTitleWithJS(driver));
    }

    @Then("user provides username as {string} and password as {string}")
    public void user_provides_username_as_and_password_as(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }

    @When("user on main page user clicks on x button to close popup")
    public void user_in_main_page_user_clicks_x_button_to_close_the_popUps() {
        mainPage.clickXBtn();
//        mainPage.clickViewBtn();
    }
}

//    @Then("user scroll down and clicks on record from the table")
//    public void user_scroll_down_and_clicks_on_record_from_the_table() {
//        mainPage.clickViewBtn();
//    }
//
//    @Then("user scrolls down and validates all status column values are displayed")
//    public void user_scrolls_down_and_validates_all_status_column_values_are_displayed() {
//        mainPage.validateStatusColumn(driver);
//    }
//
//    @Then("user validates dates column values are displayed")
//    public void user_validates_dates_column_values_are_displayed() {
//        mainPage.validateDatesColumn();
//    }

