package com.autoExercise.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class SignUpAuto {
    public SignUpAuto(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#id_gender1")
    WebElement mrRadio;

    @FindBy(css = "#name")
    WebElement name;

    @FindBy(css = "#email")
    WebElement email;

    @FindBy(css = "#password")
    WebElement password;

    @FindBy(css = "#days")
        WebElement days;

    @FindBy(css = "#months")
        WebElement months;

    @FindBy(css = "#years")
        WebElement years;

    @FindBy(css = "#first_name")
        WebElement first_name;

    @FindBy(css = "#last_name")
        WebElement last_name;

    @FindBy(css = "#company")
        WebElement company;

    @FindBy(css = "#address1")
        WebElement address1;

    @FindBy(css = "#country")
        WebElement country;

    @FindBy(css = "#state")
        WebElement state;

    @FindBy(css = "#city")
        WebElement city;

    @FindBy(css = "#mobile_number")
        WebElement mobile_number;

    @FindBy(css = "#zipcode")
        WebElement zipcode;

    @FindBy(xpath = "//button[.='Create Account']")
        WebElement createAccount;

    @FindBy(xpath = "//b")
        WebElement createAccountMsg;

    public void setMrRadioAndName(String name){
        this.mrRadio.click();
        this.name.sendKeys(name);
    }

    public void validateEmailProvidePassword(String email, String password){

        Assert.assertEquals(this.email.getAttribute("value"), email);
        this.password.sendKeys(password);
    }

    public void chooseBirthDate(String days, String months, String year){
        BrowserUtil2.selectBy(this.days, days, "visibleText");
        BrowserUtil2.selectBy(this.months,months,"visibleText");
        BrowserUtil2.selectBy(this.years, year,"visibleText");
    }

    public void firstNameLastName(String firstName, String lastName){
        this.first_name.sendKeys(firstName);
        this.last_name.sendKeys(lastName);
    }

    public void setAddress1AndCountry(String address, String country){
        this.address1.sendKeys(address);
        BrowserUtil2.selectBy(this.country, country, "visibleText");
    }

    public void setStateAndCity(String state, String city){
        this.state.sendKeys(state);
        this.city.sendKeys(city);
    }

    public void zipCodePhone(String zip, String phone){
        this.zipcode.sendKeys(zip);
        this.mobile_number.sendKeys(phone);
    }

    public void createAccountBtn(){
        this.createAccount.click();
    }

    public String setCreateAccountMsg(){
        return BrowserUtil2.getText(createAccountMsg);
    }


}
