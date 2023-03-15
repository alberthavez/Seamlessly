package net.Seamlessly.pages;

import net.Seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[@id=\"expand\"]/div")
    public WebElement profilePictureBtn;

    @FindBy (xpath = "//*[@id='expanddiv']/ul/li[5]/a")
    public WebElement logOutBtn;


}
