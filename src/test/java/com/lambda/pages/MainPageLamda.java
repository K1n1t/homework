package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageLamda {
    public MainPageLamda(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[.='Table Sort & Search']")
    WebElement sortAndSearchBtn;

    public void clickSortAndSearch(){
        sortAndSearchBtn.click();
    }
}
