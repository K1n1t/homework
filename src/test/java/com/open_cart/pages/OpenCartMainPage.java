package com.open_cart.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import utils.BrowserUtil2;

import java.util.List;

public class OpenCartMainPage {

    public OpenCartMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn-close")
    WebElement xBtn;

    @FindBy(xpath = "//tr//td[3]")
    List<WebElement> statusColumn;

     @FindBy(xpath = "//tr//td[4]")
    List<WebElement> datesColumn;

     @FindBy(xpath = "//tr[3]//i[@class='fas fa-eye']")
     WebElement viewBtn;

//     @FindBy(xpath = "//a[@class='btn btn-info']")
//     WebElement allRecords;

     public void validateStatusColumn(WebDriver driver){
         BrowserUtil2.scrollWithJS(driver, statusColumn.get(0));
         for (int i = 0; i < statusColumn.size(); i++) {

             Assert.assertTrue(statusColumn.get(i).isDisplayed());
         }
     }

     public void validateDatesColumn(){

         for (int i = 0; i < datesColumn.size(); i++) {
             Assert.assertTrue(datesColumn.get(i).isDisplayed());
         }
     }

//     public void clickOnRecord(){
//         for (int i = 0; i < allRecords; i++) {
//            if (allRecords.get())
//         }
//     }

    public void clickOnRecord(WebDriver driver){

    }


    public void clickXBtn(){
        xBtn.click();
    }

    public void clickViewBtn(){
         viewBtn.click();
    }







}
