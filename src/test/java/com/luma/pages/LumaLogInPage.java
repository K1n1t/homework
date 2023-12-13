package com.luma.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LumaLogInPage {
    public LumaLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#firstname")
    WebElement firstName;

    @FindBy(css = "#lastname")
    WebElement lastName;

    @FindBy(css = "#email_address")
    WebElement email;

    @FindBy(xpath = "//div[@class='control']//input[@type='password']")
    List<WebElement> password;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button//span[.='Create an Account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement successMsg;


    public void setFirstNameAndLastName(String name, String lastName){
        this.firstName.sendKeys(name);
        this.lastName.sendKeys(lastName);
    }

    public void setPasswordAndConfirmPassword(String email, String password,String confirmPassword){
        this.email.sendKeys(email);
        for (int i = 0; i < 1; i++) {
            this.password.get(i).sendKeys(password);
        }
        this.confirmPassword.sendKeys(confirmPassword);

    }

    public void setCreateAccountBtn(){
        createAccountBtn.click();
    }

    public void validateSuccessMsg(String successMsg){
        Assert.assertEquals(this.successMsg.getText(), successMsg);
    }



}
