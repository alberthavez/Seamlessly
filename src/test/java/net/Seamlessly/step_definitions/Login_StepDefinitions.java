package net.Seamlessly.step_definitions;

import net.Seamlessly.pages.LoginPage;
import net.Seamlessly.utilities.ConfigurationReader;
import net.Seamlessly.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {


    net.Seamlessly.pages.LoginPage LoginPage = new LoginPage();

    @Given("user is on the login-page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //   Driver.getDriver().get("https://qa.seamlessly.net/");
    }

    @When("user clicks to email input box and enter email {string}")
    public void user_clicks_to_email_input_box_and_enter_email(String string) {
        LoginPage.emailInputBox.sendKeys(string);
    }

    @When("user clicks to password input box and enter password {string}")
    public void user_clicks_to_password_input_box_and_enter_password(String string) {
        LoginPage.passwordInputBox.sendKeys(string);
    }

    @When("Click Login button")
    public void click_login_button() {
        LoginPage.loginBtn.click();
    }

    @Then("verify that user is on the dashboard")
    public void verify_that_user_is_on_the_dashboard() {
        Assert.assertEquals("Pano - Seamlessly", Driver.getDriver().getTitle());
    }

    @When("user clicks to password input box and enter password {string} and user hits enter from the keyboard")
    public void user_clicks_to_password_input_box_and_enter_password_and_user_hits_enter_from_the_keyboard(String string) {
        LoginPage.passwordInputBox.sendKeys(string, Keys.ENTER);

    }


    @When("Invalid username should be entered {string}")
    public void invalid_username_should_be_entered(String string) {
        LoginPage.emailInputBox.sendKeys(string);
    }

    @When("Invalid password should be entered {string}")
    public void invalid_password_should_be_entered(String string) {
        LoginPage.passwordInputBox.sendKeys(string, Keys.ENTER);
    }

    @Then("verify that -Wrong username or password.- message is displayed")
    public void verify_that_wrong_username_or_password_message_is_displayed() {
        Assert.assertTrue(LoginPage.wrongPasswordMSG.isDisplayed());
    }

    @Then("verify that user is not on the dashboard")
    public void verify_that_user_is_not_on_the_dashboard() {
        Assert.assertNotEquals("Pano - Seamlessly", Driver.getDriver().getTitle());

    }

    @Then("Click Login button or hit enter key again without passing any username or password")
    public void click_login_button_or_hit_enter_key_again_without_passing_any_username_or_password(io.cucumber.datatable.DataTable dataTable) {
        LoginPage.passwordInputBox.sendKeys(Keys.ENTER);
    }

    @Then("verify that -please fill out this field- message is displayed")
    public void verify_that_please_fill_out_this_field_message_is_displayed() {
        String validationMessage = LoginPage.passwordInputBox.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.",validationMessage);
    }
    @Then("verify that -please fill out this field- message is displayed on usernamebox")
    public void verify_that_please_fill_out_this_field_message_is_displayed_on_usernamebox() {
        String validationMessage = LoginPage.emailInputBox.getAttribute("validationMessage");
        Assert.assertEquals("Please fill out this field.",validationMessage);
    }
    @Then("password must be seen as dots")
    public void password_must_be_seen_as_dots() {
        Assert.assertEquals("password", LoginPage.passwordInputBox.getAttribute("type"));

    }

    @When("user enters email {string} and password {string}")
    public void user_enters_email_and_password(String string, String string2) {
        LoginPage.emailInputBox.sendKeys(string);
        LoginPage.passwordInputBox.sendKeys(string);
    }

    @When("click to the eye button")
    public void click_to_the_eye_button() {
        LoginPage.eyeBtn.click();
    }

    @Then("user should see the password explicitly")
    public void user_should_see_the_password_explicitly() {
        Assert.assertTrue(LoginPage.passwordAsText.isDisplayed());
    }


    @When("user click to forgot password link")
    public void user_click_to_forgot_password_link() {
        LoginPage.forgotPasswordLink.click();
    }

    @Then("user must see Reset password button")
    public void user_must_see_reset_password_button() {
        //     WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
     //   Assert.assertTrue(LoginPage.resetPasswordBtn.isDisplayed());
        Assert.assertEquals("Reset Password",LoginPage.resetPasswordBtn.getAttribute("value"));
    }


    @When("user must see valid place holders on Username")
    public void user_must_see_valid_place_holders_on_username() {
        Assert.assertTrue(LoginPage.emailPlaceHolder.isDisplayed());
    }

    @Then("user must see valid place holders on Password")
    public void user_must_see_valid_place_holders_on_password() {
        Assert.assertTrue(LoginPage.passwordPlaceHolder.isDisplayed());

    }
}
