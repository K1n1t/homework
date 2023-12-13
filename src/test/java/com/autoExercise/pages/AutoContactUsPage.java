package com.autoExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutoContactUsPage {
    public AutoContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2")
    List<WebElement> header;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement subject;

    @FindBy(xpath = "//textarea[@placeholder='Your Message Here']")
    WebElement message;

    @FindBy(xpath = "//input[@type='file']")
    WebElement sendFile;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//div[@class='contact-form']//div[.='Success! Your details have been submitted successfully.']")
    WebElement successMsg;

    public void validate(){

    }






}
