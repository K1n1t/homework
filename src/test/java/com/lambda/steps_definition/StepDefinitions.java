package com.lambda.steps_definition;

import com.lambda.pages.MainPageLamda;
import com.lambda.pages.SortAndSearchLambda;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class StepDefinitions {
    WebDriver driver = DriverHelper.getDriver();
    MainPageLamda mainPageLamda = new MainPageLamda(driver);
    SortAndSearchLambda sortAndSearchLambda = new SortAndSearchLambda(driver);

    @Given("user is on main page and clicks on table Sort and search")
    public void user_is_on_main_page_and_clicks_on_table_sort_and_search() {
        mainPageLamda.clickSortAndSearch();
    }

    @Then("user is in sorting page and validate that ages are above thirty")
    public void user_is_in_sorting_page_and_validate_that_ages_are_above_thirty() {
        sortAndSearchLambda.validateAges();
    }




    @When("user is in main page user click on sort link")
    public void user_is_in_main_page_user_click_on_sort_link() {
       mainPageLamda.clickSortAndSearch();
    }

    @Then("user validates that names are in ascending order")
    public void user_validates_that_names_are_in_ascending_order() {
       sortAndSearchLambda.chechAscendingOrder();
    }

    @Then("user validates that names are descending order")
    public void user_validates_that_names_are_descending_order() {
       sortAndSearchLambda.checkDescendingOrder();
    }


    //    @Then("user clicks on next page button and validate all pages in that way")
//    public void user_clicks_on_next_page_button_and_validate_all_pages_in_that_way() {
//
//    }
//    @Then("user stores names and positions as a key and age as a value in LinkedHashMap")
//    public void user_stores_names_and_positions_as_a_key_and_age_as_a_value_in_linked_hash_map() {
//
//    }
    @Then("user closes the window")
    public void user_closes_the_window() {
        driver.quit();
    }

}
