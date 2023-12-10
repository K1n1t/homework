package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLogin {
    public SmartBearLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='text']")
    WebElement userName;

    @FindBy(css = "#ctl00_MainContent_password" )
    WebElement password;

    @FindBy(css = "#ctl00_MainContent_login_button" )
    WebElement loginBtn;

    public void login(String userName, String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        loginBtn.click();
    }
}
