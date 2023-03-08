package com.Seamlessly.pages;

import com.Seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//div[@id='expand']")
    public WebElement profilePictureBtn;

    @FindBy (linkText = "Log out")
    public WebElement logOutBtn;


}
