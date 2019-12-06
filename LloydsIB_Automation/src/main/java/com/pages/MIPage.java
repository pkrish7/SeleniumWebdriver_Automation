package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MIPage {

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo1']")
    WebElement miDropDown1;

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo2']")
    WebElement miDropDown2;

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo3']")
    WebElement miDropDown3;

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo1']//parent::div//child::label")
    WebElement miCharacter_1;

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo2']//parent::div//child::label")
    WebElement miCharacter_2;

    @FindBy(xpath = "//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo3']//parent::div//child::label")
    WebElement miCharacter_3;

    @FindBy(xpath = "//a[text()='Forgotten your memorable information?']")
    WebElement forgottenYourMI;

    @FindBy(xpath = "//input[@id = 'frmentermemorableinformation1:btnContinue']")
    WebElement continueButtonMIPage;
}
