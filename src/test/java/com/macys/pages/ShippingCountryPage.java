package com.macys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class ShippingCountryPage {
    public ShippingCountryPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#shippingCountry")
    WebElement shippingCountry;

    @FindBy(css = "#currency")
    WebElement currency;

    @FindBy(xpath = "//a[.='Save & Continue']")
    WebElement submitBtn;

    public void selectCountryAndCurrency(String country, String currency){
        BrowserUtil2.selectBy(this.shippingCountry, country, "visibleText");
        BrowserUtil2.selectBy(this.currency, currency, "visibleText");
    }

    public void setSubmitBtn(){
        submitBtn.click();
    }
}
