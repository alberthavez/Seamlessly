package net.Seamlessly.pages;

import net.Seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement emailInputBox;

    @FindBy (id = "password")
    public WebElement passwordInputBox;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMSG;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement passwordAsText;

    @FindBy (xpath = "//a[@class='toggle-password']")
    public WebElement eyeBtn;

    @FindBy (xpath ="//a[@id='lost-password']")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//input[@id='reset-password-submit']")
    public WebElement resetPasswordBtn;

    @FindBy (linkText = "Back to login")
    public WebElement backToLoginBtn;

    @FindBy (xpath = "//input[@placeholder='Username or email']")
    public WebElement emailPlaceHolder;

    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement passwordPlaceHolder;


}
