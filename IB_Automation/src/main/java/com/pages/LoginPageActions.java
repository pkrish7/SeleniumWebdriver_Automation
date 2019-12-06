package com.pages;

import com.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions extends TestBase {

    @FindBy(id = "frmLogin:strCustomerLogin_userID")
    public WebElement userID;

    @FindBy(id = "frmLogin:strCustomerLogin_pwd")
    public WebElement password;

    @FindBy(name = "frmLogin:btnLogin1")
    public WebElement continueButtonLoginPage;

    //Register Online
    @FindBy(xpath = "//a[@title='register online']")
    public WebElement registerOnline;

    //Remember my User ID
    @FindBy(xpath = "//label[text()='Remember my User ID']")
    public WebElement rememberMyUserID;

    @FindBy(xpath = "//input[@id = 'frmLogin:loginRemember' and @type='checkbox']")
    public WebElement rememberMyUserIDCheckBox;

    //Forgotten your logon details?
    @FindBy(xpath = "//a[@id = 'frmLogin:lkFrgtLogonLinkDMC' and text() = 'Forgotten your logon details?']")
    public WebElement forgottenYourLogonDetails;

    //Lloyds Bank image
    @FindBy(xpath = "//img[@alt='Lloyds Bank']")
    public WebElement lloydsBankImage;

    //WebElement Mobile
    @FindBy(xpath = "//a[text()='Mobile']")
    public WebElement mobile;

    //Initializing the page objects
    public LoginPageActions(){
        PageFactory.initElements(webDriver, this);
    }

    //Actions
    public String validateLoginPageTitle(){
        return webDriver.getTitle();
    }

    public AOVPage Login(){
        userID.sendKeys(properties.getProperty("username"));
        password.sendKeys(properties.getProperty("password"));
        continueButtonLoginPage.click();
        return new AOVPage();
    }

    public String validateMIPageTitle(){
        return webDriver.getTitle();
    }
}
