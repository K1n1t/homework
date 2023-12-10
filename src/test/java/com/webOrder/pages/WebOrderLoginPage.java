package com.webOrder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderLoginPage {
    public WebOrderLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[.='Sign In']")
    WebElement signInBtn;

    @FindBy(css = ".custom-control-label")
    WebElement groupOrderBtn;

    @FindBy(css = "#getAddressNextButton")
    WebElement nextBtn;

public void setSignIn(String email, String password){

    this.email.clear();
    this.email.sendKeys(email);
    this.password.clear();
    this.password.sendKeys(password);
    signInBtn.click();
}



public void clickOnGroupOrderAndNextBtn(){
    groupOrderBtn.click();
    nextBtn.click();
}





}
