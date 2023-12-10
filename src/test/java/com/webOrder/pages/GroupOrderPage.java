package com.webOrder.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtil2;

public class GroupOrderPage {

    public GroupOrderPage(WebDriver driver) {
        PageFactory.initElements( driver, this);
    }

    @FindBy(css = "#ConfirmAddressID")
    WebElement dropDownLocation;

    @FindBy(css = "#addressPreview")
    WebElement address;

      @FindBy(css = "#InviteNote")
    WebElement inviteNote;

    @FindBy(css = "#InviteList")
    WebElement inviteList;

     @FindBy(css = "#createGroupOrder")
    WebElement createGroupOrderBtn;

     @FindBy(xpath = "//h2")
    WebElement header;

    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div[@class='col-sm-8']")
    WebElement participant;

    public void setDropDownLocation(String location){
        Select select = new Select(dropDownLocation);
        String myHouse  = select.getFirstSelectedOption().getText();
        Assert.assertEquals(location, myHouse);

    }

    public void validateAddres(String address){
        Assert.assertTrue(this.address.getText().contains(address));
    }

    public void notesForGuests (String notes){
        this.inviteNote.sendKeys(notes);
    }

    public void sendEmails(String email1, String email2){
        this.inviteList.sendKeys(email1,email2);
    }

    public void groupOrderBtn(){
        createGroupOrderBtn.click();
    }

    public void validateHeaderParticipant(String header, Integer participant){
        Assert.assertEquals(header, this.header.getText());
        Integer number = Integer.parseInt(BrowserUtil2.getText(this.participant));
        Assert.assertEquals(participant, number);
    }








}
