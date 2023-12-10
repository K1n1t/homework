package com.autoExercise.steps;

import com.autoExercise.pages.LoginPageAuto;
import com.autoExercise.pages.MainPageAuto;
import com.autoExercise.pages.SignUpAuto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class AutoStepsDef {

    WebDriver driver = DriverHelper.getDriver();
    MainPageAuto mainPageAuto = new MainPageAuto(driver);
    LoginPageAuto loginPageAuto = new LoginPageAuto(driver);
    SignUpAuto signUpAuto= new SignUpAuto(driver);


    @Given("user is on main page and provides username and email and clicks signUp")
    public void user_is_on_main_page_and_provides_username_and_email_and_clicks_sign_up() {
      mainPageAuto.setSignUpBtn();
      loginPageAuto.setSignUpBtn("TEST", "uwedwefu@test.io");
    }

    @When("user in on signUp page user verifies that user is on signUp page")
    public void user_in_on_sign_up_page_user_verifies_that_user_is_on_sign_up_page() {
        Assert.assertEquals("https://www.automationexercise.com/signup", driver.getCurrentUrl());
    }

    @Then("user checks mr radio and provides full name")
    public void user_checks_mr_radio_and_provides_full_name() {
        signUpAuto.setMrRadioAndName("Kanat");
    }

    @Then("use verifies entered email and provides password")
    public void use_verifies_entered_email_and_provides_password() {
        signUpAuto.validateEmailProvidePassword("uwedwefu@test.io", "1234");
    }

    @Then("user provides their birthdate")
    public void user_provides_their_birthdate() {
        signUpAuto.chooseBirthDate("12","May", "1995");
    }

    @Then("user enters first and last name")
    public void user_enters_first_and_last_name() {
        signUpAuto.firstNameLastName("Kanat","Berdi");
    }

    @Then("user enters adress and chooses their country")
    public void user_enters_adress_and_chooses_their_country() {
        signUpAuto.setAddress1AndCountry("2312wfwfwef","United States");
    }

    @Then("user rpovides state and city")
    public void user_rpovides_state_and_city() {
        signUpAuto.setStateAndCity("IL", "Chicago");
    }

    @Then("user enters zipcode and phone number")
    public void user_enters_zipcode_and_phone_number() {
        signUpAuto.zipCodePhone("2124234","3423542354");
    }

    @Then("user click on create button")
    public void user_click_on_create_button() {
            signUpAuto.createAccountBtn();
    }

    @Then("finally verifies account created message")
    public void finally_verifies_account_created_message() {
        Assert.assertEquals("ACCOUNT CREATED!", signUpAuto.setCreateAccountMsg());
    }

}
