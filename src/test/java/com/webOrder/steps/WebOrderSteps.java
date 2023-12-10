package com.webOrder.steps;

import com.webOrder.pages.GroupOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    GroupOrderPage orderPage = new GroupOrderPage(driver);
    @When("is on group order page user verifies that {string} is selected")
    public void is_on_group_order_page_user_verifies_that_is_selected(String location) {
        orderPage.setDropDownLocation(location);
    }
    @Then("user validates address {string}")
    public void user_validates_address(String address) {
        orderPage.validateAddres(address);
    }
    @Then("user enters notes for guests as {string}")
    public void user_enters_notes_for_guests_as(String notes) {
        orderPage.notesForGuests(notes);
    }
    @Then("user enters emails for friends as {string} and {string}")
    public void user_enters_emails_for_friends_as_and(String email1, String email2) {
        orderPage.sendEmails(email1, email2);
    }
    @Then("user finally checks on create group order button")
    public void user_finally_checks_on_create_group_order_button() {
        orderPage.groupOrderBtn();
    }
    @Then("user validates header is this {string} and participant number {int}")
    public void user_validates_header_is_this_and_participant_number(String header, Integer participant) {
        orderPage.validateHeaderParticipant(header, participant);
    }

}
