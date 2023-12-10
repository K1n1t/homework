package com.smart_bear.steps;

import com.smart_bear.pages.SmartBearLogin;
import com.smart_bear.pages.SmartBearOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

import java.util.Iterator;
import java.util.Map;

public class SmartBearStepsDefinition {

    WebDriver driver = DriverHelper.getDriver();
    SmartBearLogin login = new SmartBearLogin(driver);
    SmartBearOrderPage order = new SmartBearOrderPage(driver);


    @When("user is on login page user provides {string} for username and {string} for password and cliks on loginBtn")
    public void user_is_on_login_page_user_provides_for_username_and_for_password_and_cliks_on_login_btn(String userName, String password) {
        login.login(userName,password);
    }

    @Then("user chooses {string} from the dropdown and provde quantity as {string}")
    public void user_chooses_from_the_dropdown_and_provde_quantity_as(String screen, String quantity) {
        order.screenAndQuantity(screen,quantity);
    }

    @Then("user provides price as {int} and discount as {int}")
    public void user_provides_price_as_and_discount_as(Integer price, Integer discount) {
        order.priceAndDiscount(price,discount);
    }

    @Then("user provides total number as {string}")
    public void user_provides_total_number_as(String total) {
        order.setTotal(total);
    }

    @Then("user enters their name es {string} and street address as {string}")
    public void user_enters_their_name_es_and_street_address_as(String name, String address) {
        order.nameAndAddress(name, address);
    }

    @Then("user enter city as {string} and state as {string} and zip as {string}")
    public void user_enter_city_as_and_state_as_and_zip_as(String city, String state, String zipCode) {
        order.cityStateAndZipCode(city,state,zipCode);
    }

    @Then("user clicks on visa and provides card number as {string} and expiration {string}")
    public void user_clicks_on_visa_and_provides_card_number_as_and_expiration(String cc, String expiration) {
        order.ccAndExpiration(cc,expiration);
    }

    @Then("user finally clicks on process button")
    public void user_finally_clicks_on_process_button() {
        order.clickOnProcessBtn();
    }


    @When("user is on login page and enters username and password as clicks on login")
    public void user_is_on_login_page_and_enters_username_and_password_as_clicks_on_login(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> userNamePassword = dataTable.asMap();
        login.login(userNamePassword.get("username"), userNamePassword.get("password"));
    }
    @Then("user chooses product and specifies quantity")
    public void user_chooses_product_and_specifies_quantity(io.cucumber.datatable.DataTable dataTable) {
       Map<String, String> productQuantity = dataTable.asMap();
       order.screenAndQuantity(productQuantity.get("product"),productQuantity.get("quantity"));
    }
    @Then("user enters price as five and discount as twenty")
    public void user_enters_price_as_five_and_discount_as_twenty(io.cucumber.datatable.DataTable dataTable) {
       Map<String, String> priceDicount = dataTable.asMap();
       order.priceAndDiscount(Integer.parseInt(priceDicount.get("price")), Integer.parseInt(priceDicount.get("discount")));
    }
    @Then("user enters total as")
    public void user_enters_total_as(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> total = dataTable.asMap();
        order.setTotal(total.get("total"));
    }
    @Then("user enters name and address as")
    public void user_enters_name_and_address_as(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> nameAddres = dataTable.asMap();
        order.nameAndAddress(nameAddres.get("name"), nameAddres.get("address"));
    }
    @Then("user enters state city zipcode as follows")
    public void user_enters_state_city_zipcode_as_follows(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> stateCityZipCode = dataTable.asMap();
        order.cityStateAndZipCode(stateCityZipCode.get("state"),stateCityZipCode.get("city"), stateCityZipCode.get("zipCode") );
    }
    @Then("user clicks on visa radio enters cc followed by its expiration date as")
    public void user_clicks_on_visa_radio_enters_cc_followed_by_its_expiration_date_as(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> ccAndExpiration = dataTable.asMap();
        order.ccAndExpiration(ccAndExpiration.get("cc"), ccAndExpiration.get("expiration"));
    }
    @Then("user clicks on process button")
    public void user_clicks_on_process_button() {
        order.clickOnProcessBtn();
    }

}



