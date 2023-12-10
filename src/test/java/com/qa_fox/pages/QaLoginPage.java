package com.qa_fox.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class QaLoginPage {
    public QaLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#input-email")
    WebElement email;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement errorMessage;

    public void setLogin(String email, String password, String errorMessage, WebDriver driver){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        BrowserUtil2.clickOnElement(driver, this.submitBtn);
        Assert.assertEquals(errorMessage, BrowserUtil2.getText(this.errorMessage));
    }
}
