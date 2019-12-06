package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchStatements {

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

    @FindBy(xpath = "//span[@class='search-statements-date-range']/span[2]")
    WebElement threeMonthsDateRange;

}
