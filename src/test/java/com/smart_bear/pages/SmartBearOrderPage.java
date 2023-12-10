package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class SmartBearOrderPage {
    public SmartBearOrderPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderBtn;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement product;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    WebElement pricePerUnit;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtDiscount")
    WebElement discount;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtTotal")
    WebElement total;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

     @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipCode;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visaRadio;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expDate;

    @FindBy(xpath = "//a[.='Process']")
    WebElement processBtn;

    public void  screenAndQuantity(String screen, String quantity){
        orderBtn.click();
        BrowserUtil2.selectBy(product, screen, "visibleText");
        this.quantity.sendKeys(quantity);
    }

    public void  priceAndDiscount(Integer price, Integer discount){
        this.pricePerUnit.sendKeys(String.valueOf(price));
        this.discount.sendKeys(String.valueOf(discount));
    }

    public void setTotal(String total){
        this.total.sendKeys(total);
    }

    public void nameAndAddress(String customerName, String street){
        this.customerName.sendKeys(customerName);
        this.street.sendKeys(street);
    }

    public void cityStateAndZipCode(String city, String state, String zipCode){
        this.city.sendKeys(city);
        this.zipCode.sendKeys(zipCode);
        this.state.sendKeys(state);
    }

    public void ccAndExpiration(String cc, String expirationDate){
        this.visaRadio.click();
        this.cardNumber.sendKeys(cc);
        this.expDate.sendKeys(expirationDate);
    }

    public void clickOnProcessBtn(){
        this.processBtn.click();
    }









}
