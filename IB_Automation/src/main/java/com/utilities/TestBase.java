package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase extends TestUtil {
    public static WebDriver webDriver;
    public static Properties properties;

/*    public static void main(String[] args){
    }*/

    public TestBase() {
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("/Users/preethykrishnamoorthy/IdeaProjects/LloydsIB_Automation/src/main/java/com/config/Config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        public void initializeWebDriver () {
            //Get browser name from properties file
            String browserName = properties.getProperty("browser");
            //The common path where the driver files are stored
            String driverFilePath = "/Users/preethykrishnamoorthy/Documents/Selenium/";
            //Initialize webdriver based on the browser name
            switch (browserName) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", driverFilePath + "chromedriver");
                    webDriver = new ChromeDriver();
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", driverFilePath + "geckodriver");
                    webDriver = new FirefoxDriver();
                    break;
                case "safari":
                    webDriver = new SafariDriver();
                    break;
                case "IE":
                    System.setProperty("webdriver.ie.driver", driverFilePath + "iedriver");
                    webDriver = new SafariDriver();
                    break;
                default:
                    System.setProperty("webdriver.chrome.driver", driverFilePath + "chromedriver");
                    webDriver = new ChromeDriver();
            }
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            webDriver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            webDriver.get(properties.getProperty("loginURL"));
        }
    }
