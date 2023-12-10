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

public class OpenCartStep_Definition {
    WebDriver driver = DriverHelper.getDriver();
    OpenCartMainPage mainPage = new OpenCartMainPage(driver);
    OpenCartRecordPage recordPage = new OpenCartRecordPage(driver);


    @Then("user scrolls down and validates all status column values are displayed")
    public void user_scrolls_down_and_validates_all_status_column_values_are_displayed() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.validateStatusColumn(driver);
    }

    @Then("user validates dates column values are displayed")
    public void user_validates_dates_column_values_are_displayed() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.validateDatesColumn();
    }


    @Then("user scrolls down and clicks on record from the table")
    public void user_scrolls_down_and_clicks_on_record_from_the_table() throws InterruptedException {
        Thread.sleep(1000);
        mainPage.clickOnRecord(driver);
    }

    @Then("user comments in the box as {string} and clicks add to history button")
    public void user_comments_in_the_box_as_and_clicks_add_to_history_button(String comment) throws InterruptedException {
        Thread.sleep(1000);
        recordPage.commentAndSubmitBtn(comment, driver);
    }
}

//    @When("user is on login page user validates title is {string}")
//    public void user_is_on_login_page_user_validates_title_is(String title) {
//        Assert.assertEquals(title, BrowserUtil2.getTitleWithJS(driver));
//    }
//
//    @Then("user provides username as {string} and password as {string}")
//    public void user_provides_username_as_and_password_as(String userName, String password) {
//        loginPage.login(userName,password);
//    }
//
//    @Then("user clicks on login button")
//    public void user_clicks_on_login_button() {
//        loginPage.clickOnLogin();
//    }
//
//    @When("user in main page user clicks x button to close the popUps")
//    public void user_in_main_page_user_clicks_x_button_to_close_the_pop_ups() {
//        mainPage.clickXBtn();
//    }
//
//    @Then("user comments in the box as {string} and clicks and to history button")
//    public void user_comments_in_the_box_as_and_clicks_and_to_history_button(String comment) {
//        recordPage.commentAndSubmitBtn(comment,driver);
//    }
//}
