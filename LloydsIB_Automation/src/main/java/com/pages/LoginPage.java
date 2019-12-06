package com.pages;

import com.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(id = "frmLogin:strCustomerLogin_userID")
    WebElement userID;

    @FindBy(id = "frmLogin:strCustomerLogin_pwd")
    WebElement password;

    @FindBy(name = "frmLogin:btnLogin1")
    WebElement continueButtonLoginPage;

    //Register Online
    @FindBy(xpath = "//a[@title='register online']")
    WebElement registerOnline;

    //Remember my User ID
    @FindBy(xpath = "//label[text()='Remember my User ID']")
    WebElement rememberMyUserID;

    @FindBy(xpath = "//input[@id = 'frmLogin:loginRemember' and @type='checkbox']")
    WebElement rememberMyUserIDCheckBox;

    //Forgotten your logon details?
    @FindBy(xpath = "//a[@id = 'frmLogin:lkFrgtLogonLinkDMC' and text() = 'Forgotten your logon details?']")
    WebElement forgottenYourLogonDetails;

    //Lloyds Bank image
    @FindBy(xpath = "//img[@alt='Lloyds Bank']")
    WebElement lloydsBankImage;

    //Presence of WebElement Mobile
    @FindBy(xpath = "//a[text()='Mobile']")
    WebElement mobile;

    //Initializing the page objects
    public LoginPage(){
        PageFactory.initElements(webDriver, this);
    }

    //Actions
    public String validateLoginPageTitle(){
        String loginPageTitle = "Lloyds Bank - Welcome to Internet Banking";
        return webDriver.getTitle();
    }

    public AOVPage Login(){
        userID.sendKeys(properties.getProperty("username"));
        password.sendKeys(properties.getProperty("password"));
        continueButtonLoginPage.click();
        return new AOVPage();
    }
}
