package com.open_cart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class OpenCartRecordPage {
    public OpenCartRecordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='col-sm-10']//textarea[@id='input-history']")
    WebElement textArea;

    @FindBy(xpath = "//div[@class='text-end']//button[@class='btn btn-primary']//i[@class='fas fa-plus-circle']")
    WebElement submitBtn;

    public void commentAndSubmitBtn(String comment, WebDriver driver){
        BrowserUtil2.scrollWithAmount(driver, 4000, 4000);
        this.textArea.sendKeys(comment);
        this.submitBtn.click();

    }

}
