package com.ebay.steps_definition;

import com.ebay.pages.EbayMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class EbaySteps {
        WebDriver driver = DriverHelper.getDriver();
        EbayMainPage mainPage = new EbayMainPage(driver);

    @Given("user is on main page and scrolls all the way down")
    public void user_is_on_main_page_and_scrolls_all_the_way_down(WebDriver driver) {

    }
    @Then("user clicks contact us and chooses start sharing")
    public void user_clicks_contact_us_and_chooses_start_sharing(WebDriver driver) {
        mainPage.setContactUs(driver);
    }

}
