package com.autoExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageAuto {
    public MainPageAuto(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//a[@href='/login']")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[@href='/contact_us']")
    WebElement contactUsLink;

    public void setSignUpBtn(){
        signUpBtn.click();
    }

    public void setContactUsLink(){
        contactUsLink.click();
    }
}
