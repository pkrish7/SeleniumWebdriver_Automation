package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewStatements {

    @FindBy(xpath = "//div[@class='des-m-sat-xx-account-tile need-javascript ManageMyAccountsAnchor1']/div/div/div/dl/dd[1]")
    WebElement accountName;

    @FindBy(xpath = "//div[@class='des-m-sat-xx-account-tile need-javascript ManageMyAccountsAnchor1']/div/div/div/dl/dd[2]")
    WebElement sortCode;

    @FindBy(xpath = "//div[@class='des-m-sat-xx-account-tile need-javascript ManageMyAccountsAnchor1']/div/div/div/dl/dd[3]")
    WebElement accountNumber;

    @FindBy(xpath = "//div[@class='clearfix stmnt-navigation']")
    WebElement monthlyNavigationBar;

    @FindBy(xpath = "//button[@id='top-bar-exports']")
    WebElement statementsOptions;

    @FindBy(xpath = "//a[text()='View Pending Transactions']")
    WebElement viewPendingTransactions;

    @FindBy(xpath = "//div[@class='currentRunningBalance']")
    WebElement currentRunningBalance;

    @FindBy(xpath = "//tr[@id='headerRow']")
    WebElement headerRow;

    @FindBy(xpath = "//tr[@id='clickable-6dcc9736e4']")
    WebElement viewStatementsFirstRow;

    @FindBy(xpath = "//a[text()='Load more transactions']")
    WebElement loadMoreTransactions;
}
