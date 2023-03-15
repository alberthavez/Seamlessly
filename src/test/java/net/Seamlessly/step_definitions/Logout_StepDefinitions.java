package net.Seamlessly.step_definitions;

import net.Seamlessly.pages.DashboardPage;
import net.Seamlessly.pages.LoginPage;
import net.Seamlessly.utilities.ConfigurationReader;
import net.Seamlessly.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Logout_StepDefinitions {


    net.Seamlessly.pages.DashboardPage DashboardPage= new DashboardPage();
    net.Seamlessly.pages.LoginPage LoginPage = new LoginPage();

    @Given("user is on loginpage")
    public void user_is_on_loginpage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }


    @When("user enters valid email {string} and password {string}")
    public void user_enters_valid_email_and_password(String string, String string2) {
        LoginPage.emailInputBox.sendKeys(string);
        LoginPage.passwordInputBox.sendKeys(string2);
    }

    @Then("user clicks to login button")
    public void user_clicks_to_login_button() {
        LoginPage.loginBtn.click();
    }

    @When("click to the profilePicture button on the right corner of the dashboard")
    public void click_to_the_profile_picture_button_on_the_right_corner_of_the_dashboard() {
        DashboardPage.profilePictureBtn.click();
    }

    @When("click to logout button")
    public void click_to_logout_button() {
        DashboardPage.logOutBtn.click();

    }



    @When("click to step back btn")
    public void click_to_step_back_btn() {
        Driver.getDriver().navigate().back();
    }

    @Then("verify that user is on the login-page")
    public void verify_that_user_is_on_the_login_page() {
        Assert.assertTrue(LoginPage.loginBtn.isDisplayed());
    }


}
