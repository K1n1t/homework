package com.luma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LumaMainPage {
    public LumaMainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ul[@class='header links']//li//a[.='Create an Account' and @href='https://magento.softwaretestingboard.com/customer/account/create/']")
    List<WebElement> createAccountLink;

    public void setCreateAccountLink(){
        for (int i = 0; i < 1; i++) {
            createAccountLink.get(i).click();
        }
    }
}
