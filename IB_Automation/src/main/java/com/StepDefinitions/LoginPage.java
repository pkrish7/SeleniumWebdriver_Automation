package com.StepDefinitions;

import com.pages.LoginPageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginPage extends LoginPageActions {

    @Given("^I am on login page$")
    public void i_am_on_login_page(){
        initializeWebDriver();
        Assert.assertEquals(loginPageTitle, validateLoginPageTitle());
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String passwd) {
        userID.sendKeys(username);
        password.sendKeys(passwd);
    }

    @When("^click on continue button$")
    public void click_on_continue_button() {
        continueButtonLoginPage.click();
       }

    @Then("^I should be landed on MIPage$")
    public void i_should_be_landed_on_MIPage(){
        Assert.assertEquals(MIPageTitle, validateMIPageTitle());
    }

}
