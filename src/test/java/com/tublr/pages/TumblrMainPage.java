package com.tublr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

import java.util.List;

public class TumblrMainPage {
    public TumblrMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Sign me up']")
    WebElement signMeUpBtn;

    @FindBy(xpath = "//button[@aria-label='Continue with email']")
    WebElement continueWithEmailBtn;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//button[@class='TRX6J CxLjL qjTo7 CguuB qNKBC']")
    List<WebElement> emailNextBtn;

    @FindBy(xpath = "//input[@placeholder='Set a password']")
    WebElement password1;

    @FindBy(xpath = "//input[@placeholder='Repeat password']")
    WebElement password2;

    @FindBy(xpath = "//button[@aria-label='Next']//span[@class='EvhBA']")
    WebElement nextBtn;

    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement errorMsg;

    public void setSignMeUpBtn(WebDriver driver){
        BrowserUtil2.clickOnElement(driver, signMeUpBtn);
    }

    public void setContinueWithEmailBtn(){
        continueWithEmailBtn.click();
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public void setEmailNextBtn(WebDriver driver){
        for (int i = 0; i < 1; i++) {
            BrowserUtil2.clickOnElement(driver, emailNextBtn.get(i));
        }
    }

    public void setPassword1(String password1){
        this.password1.sendKeys(password1);
    }

 public void setPassword2(String password2){
        this.password2.sendKeys(password2);
    }

    public void setNextBtn(){
        nextBtn.click();
    }

    public void setErrorMsg(String errorMsg){
        Assert.assertEquals(this.errorMsg.getText(), errorMsg);
    }



}
