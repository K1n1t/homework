package com.qa_fox.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class QaFoxMainPage {
    public QaFoxMainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[.='My Account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[.='Login']")
    WebElement logInLink;

    public void clickOnAccountAndLogin(WebDriver driver){

        BrowserUtil2.clickOnElement(driver, myAccountLink);
        BrowserUtil2.clickOnElement(driver,logInLink);

    }
}
