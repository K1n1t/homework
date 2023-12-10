package com.tublr.steps_definitions;

import com.tublr.pages.TumblrMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class TumblrSteps {

    WebDriver driver = DriverHelper.getDriver();
    TumblrMainPage mainPage = new TumblrMainPage(driver);
//
//

    @When("user is on main page and clicks login button")
    public void user_is_on_main_page_and_clicks_login_button() {
        mainPage.setSignMeUpBtn(driver);

    }
    @Then("and then clicks on continue with email and enters {string}")
    public void and_then_clicks_on_continue_with_email_and_enters(String email) {
        mainPage.setContinueWithEmailBtn();
        mainPage.setEmail(email);
        mainPage.setEmailNextBtn(driver);
    }
    @Then("user provides {string} and user reenter the {string}")
    public void user_provides_and_user_reenter_the(String password1, String password2) {
        mainPage.setPassword1(password1);
        mainPage.setPassword2(password2);
        mainPage.setNextBtn();
    }
    @Then("user validates {string}")
    public void user_validates(String errorMsg) throws InterruptedException {
        Thread.sleep(700);
        mainPage.setErrorMsg(errorMsg);
    }
}