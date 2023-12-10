package com.macys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class MacysMainPage {
    public MacysMainPage( WebDriver driver ) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='margin-right-xxs']")
    WebElement locationBtn;

    public void scrollAndClickLocationBtn(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        BrowserUtil2.scrollWithAmount(driver, 8000, 8000);
        //BrowserUtil2.scrollWithPoint(driver, locationBtn);
        locationBtn.click();
    }
}
