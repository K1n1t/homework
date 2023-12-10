package com.amazon.steps;

import com.amazon.pages.AmazonMain;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

public class AmazonSteps {

    WebDriver driver = DriverHelper.getDriver();
    AmazonMain amazonMain = new AmazonMain(driver);



    @When("user on amazon main page user searches for {string}")
    public void user_on_amazon_main_page_user_searches_for(String item) throws InterruptedException {
        Thread.sleep(200);
        amazonMain.searchForItem(item, driver);
    }
    @Then("user validates that title is {string}")
    public void user_validates_that_title_is(String title) throws InterruptedException {
        Thread.sleep(200);
        Assert.assertEquals(title, BrowserUtil2.getTitle(driver));
    }
}
