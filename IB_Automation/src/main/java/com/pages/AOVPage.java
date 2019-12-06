package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AOVPage {

    @FindBy(xpath = "//a[@id='lnkAccName_des-m-sat-xx-1']")
    WebElement accountName1;

    @FindBy(xpath = "//div[@id='des-m-sat-xx-1']/div/div/div/dl/dd[2]")
    WebElement sortCode1;

    @FindBy(xpath = "//div[@id='des-m-sat-xx-1']/div/div/div/dl/dd[3]")
    WebElement accountNumber1;

    @FindBy(xpath = "//ancestor::div[@id='des-m-sat-xx-1']/div/div/div/p/span")
    WebElement balance1;

    @FindBy(xpath = "//a[@id='lnkAccFuncs_viewStatement_des-m-sat-xx-1']")
    WebElement viewStatement1;

}
