package com.autoExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAuto {
    public LoginPageAuto(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//form[@action='/signup']//input[@placeholder='Email Address']" )
    WebElement email;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signUpBtn;

    public void setSignUpBtn(String name, String email){

        this.name.sendKeys(name);
        this.email.sendKeys(email);
        signUpBtn.click();

    }

}
