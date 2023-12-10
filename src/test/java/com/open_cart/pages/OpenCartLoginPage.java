package com.open_cart.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCartLoginPage {
    public OpenCartLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#input-username")
    WebElement userName;

    @FindBy(css = "#input-password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;

    public void login(String username, String password){

        this.userName.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickOnLogin(){
        submitBtn.click();
    }
}
