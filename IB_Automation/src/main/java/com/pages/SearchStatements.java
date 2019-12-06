package com.pages;

import com.utilities.TestBase;
import gherkin.lexer.Pa;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

public class SearchStatements extends TestBase {

    @FindBy(xpath = "//a[text()='Search']")
    WebElement searchButton;

    @FindBy(xpath = "//div[@class='search-statements-search-component']")
    WebElement searchComponent;

    @FindBy(xpath = "//input[@type='search']")
    WebElement descriptionAmountInputField;

    @FindBy(xpath = "//select[@class='search-statements-type-dropdown']")
    WebElement transactionTypesDropDown;

    @FindBy(xpath = "//a[@class='action-button-undefined search-statements-search-button']")
    WebElement searchButtonInComponent;

    @FindBy(xpath = "//a[@class='search-statements-edit-date-link']")
    WebElement editDateRage;

    //xpath to be revised
    @FindBy(xpath = "//span[@class='search-statements-date-range']/span[2]")
    WebElement threeMonthsDateRange;

    @FindBy(xpath = "//input[@class='sn-dd ']")
    WebElement day_FromDate;

    @FindBy(xpath = "//input[@name='mm']//preceding-sibling::input[@class='sn-dd ']")
    WebElement month_FromDate;

    @FindBy(xpath = "//input[@name='yy']//preceding-sibling::input[@class='sn-dd ']")
    WebElement year_FromDate;

    @FindBy(xpath = "//input[@class='sn-dd sn-focus']")
    WebElement day_ToDate;

    @FindBy(xpath = "//input[@name='mm']//preceding-sibling::input[@class='sn-dd sn-focus']")
    WebElement month_ToDate;

    @FindBy(xpath = "//input[@name='yy']//preceding-sibling::input[@class='sn-dd sn-focus']")
    WebElement year_ToDate;

    //date picker
    //div[@id='datepicker-to-date-container']/table/tbody/tr[1]/td[1]

    @FindBy(xpath = "//a[@class='date-picker-prev']")
    WebElement previousDatePicker;

    @FindBy(xpath = "//a[@class='date-picker-next']")
    WebElement nextDatePicker;

    @FindBy(xpath = "//a[@class='action-button-Continue search-statements-continue-button']")
    WebElement continueButtonInSearchStatements;

    public SearchStatements(){
        PageFactory.initElements(webDriver, this);
    }
}
