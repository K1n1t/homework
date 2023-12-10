package com.etsy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

    public ProductList(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3")
    List<WebElement> products;

    public void validateIphone(String iphone){

        for (int i = 0; i < products.size(); i++) {
            if (BrowserUtil2.getText(products.get(i)).contains(iphone)){
                System.out.println(BrowserUtil2.getText(products.get(i)));
            }
        }

    }

    public List<String> addToList(String iphone){
        List<String> iphones = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (BrowserUtil2.getText(products.get(i)).contains(iphone)){
                iphones.add(BrowserUtil2.getText(products.get(i)));
            }
        }
        return iphones;
    }

}
