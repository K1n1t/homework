package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class AmazonMain {
    public AmazonMain(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#twotabsearchtextbox")
    WebElement searchBar;

    public void searchForItem(String item, WebDriver driver){
        searchBar.sendKeys(item, Keys.ENTER);
        BrowserUtil2.scrollWithAmount(driver, 250, 250);
    }

}
