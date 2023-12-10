package com.macys.steps;

import com.macys.pages.MacysMainPage;
import com.macys.pages.ShippingCountryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class MacysStepsDefinitions {
    WebDriver driver = DriverHelper.getDriver();
    MacysMainPage mainPage = new MacysMainPage(driver);
    ShippingCountryPage countryPage = new ShippingCountryPage(driver);

    @Given("user is on main page and scrolls all the way down and clicks on current location")
    public void user_is_on_main_page_and_scrolls_all_the_way_down_and_clicks_on_current_location() throws InterruptedException {
        mainPage.scrollAndClickLocationBtn(driver);
    }

    @Then("user chooses {string} and chooses {string}")
    public void user_chooses_and_chooses(String shippingCountry, String currency) {
        countryPage.selectCountryAndCurrency(shippingCountry, currency);
    }

    @Then("user clicks on save and continue button")
    public void user_clicks_on_save_and_continue_button() {
        countryPage.setSubmitBtn();
    }
}
