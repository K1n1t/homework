package com.luma.steps_definitions;

import com.luma.pages.LumaLogInPage;
import com.luma.pages.LumaMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Map;

public class LumaStepsDefinition {

    WebDriver driver = DriverHelper.getDriver();
    LumaLogInPage logInPage = new LumaLogInPage(driver);
    LumaMainPage mainPage = new LumaMainPage(driver);

    @Given("user in main page and clicks create an account page")
    public void user_in_main_page_and_clicks_create_an_account_page() {
        mainPage.setCreateAccountLink();
    }
    @Then("user in create account page and fill up name and last name")
    public void user_in_create_account_page_and_fill_up_name_and_last_name(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> firstAndLastNames = dataTable.asMap();
       logInPage.setFirstNameAndLastName(firstAndLastNames.get("name"), firstAndLastNames.get("lastName"));
    }
    @Then("use create email and password and confirms the password")
    public void use_create_email_and_password_and_confirms_the_password(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> emailPasswordAndConfirm = dataTable.asMap();
        logInPage.setPasswordAndConfirmPassword(emailPasswordAndConfirm.get("email"), emailPasswordAndConfirm.get("password"), emailPasswordAndConfirm.get("confirmPassword"));
    }
    @Then("finally user clicks createAnAccount button and validate success message")
    public void finally_user_clicks_create_an_account_button_and_validate_success_message(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> validateConfirmMsg = dataTable.asMap();
        validateConfirmMsg.get("successMsg");
        logInPage.setCreateAccountBtn();

    }


}
