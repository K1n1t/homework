package com.lambda.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

import java.util.*;

public class SortAndSearchLambda {
    public SortAndSearchLambda(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//td[1]")
    List<WebElement> allNames;

    @FindBy(xpath = "//td[2]")
    List<WebElement> allPositions;

    @FindBy(xpath = "//td[4]")
    List<WebElement> allAges;

    @FindBy(css = "#example_next")
    WebElement nextBtn;

    @FindBy(xpath = "//tr//rd[1]")
    List<WebElement> names;

    @FindBy(xpath = "//th[@class='sorting_asc']")
    WebElement columnBtn;



   public void validateAges(){
       int count = 0;
       Map<String, String> map = new Hashtable<>();
       for (int i = 0; i < allAges.size(); i++) {
           if (Integer.parseInt(BrowserUtil2.getText(allAges.get(i))) > 30){
               String nameAndPosition = allNames.get(i).getText()+ " - " +allPositions.get(i).getText();
               map.put(nameAndPosition, allAges.get(i).getText());
           }

           count++;
           if (count ==10 ){
                nextBtn.click();

           }
       }
   }

   public void clickOnNameColumn(){
        columnBtn.click();
   }

   public void chechAscendingOrder(){
        List<Character> actualLetters = new ArrayList<>();
        List<Character> expectedLetters = new ArrayList<>();
       for (int i = 0; i < names.size(); i++) {
           actualLetters.add(BrowserUtil2.getText(names.get(i)).charAt(0));
           expectedLetters.add(BrowserUtil2.getText(names.get(i)).charAt(0));

           Collections.sort(actualLetters); //
           Assert.assertEquals(expectedLetters, actualLetters);

       }
   }

   public void checkDescendingOrder(){
   clickOnNameColumn();

    List<Character> actualLetters = new ArrayList<>();
    List<Character> expectedLetters = new ArrayList<>();
       for (int i = 0; i < names.size(); i++) {
           actualLetters.add(BrowserUtil2.getText(names.get(i)).charAt(0));
           expectedLetters.add(BrowserUtil2.getText(names.get(i)).charAt(0));

           Collections.sort(actualLetters);
           Collections.reverse(actualLetters);
           Assert.assertEquals(expectedLetters, actualLetters);

       }
   }

    }
