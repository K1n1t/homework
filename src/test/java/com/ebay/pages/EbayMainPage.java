package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class EbayMainPage {
    public EbayMainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[.='Contact Us']")
    WebElement contactUs;

    public void setContactUs(WebDriver driver){
        BrowserUtil2.scrollWithJS(driver, contactUs);
        contactUs.click();
    }
}
