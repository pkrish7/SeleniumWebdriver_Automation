package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class xpathFinder {

public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/preethykrishnamoorthy/Documents/Selenium/chromedriver");
    WebDriver webDriver = new ChromeDriver();

    webDriver.get("https://online.lloydsbank.co.uk/personal/logon/login.jsp");
    Thread.sleep(1000);

    webDriver.findElement(By.id("frmLogin:strCustomerLogin_userID")).sendKeys("pkrish777");
    Thread.sleep(1000);

    webDriver.findElement(By.id("frmLogin:strCustomerLogin_pwd")).sendKeys("wel127come");
    Thread.sleep(1000);

    webDriver.findElement(By.name("frmLogin:btnLogin1")).click();
    Thread.sleep(1000);

    String ch1 = webDriver.findElement(By.xpath("//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo1']//parent::div//child::label")).getText();
    Thread.sleep(1000);

    String ch2 = webDriver.findElement(By.xpath("//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo2']//parent::div//child::label")).getText();
    Thread.sleep(1000);

    String ch3 = webDriver.findElement(By.xpath("//select[@id='frmentermemorableinformation1:strEnterMemorableInformation_memInfo3']//parent::div//child::label")).getText();
    Thread.sleep(1000);

    System.out.println("1 ==> "+ch1.substring(10, 11));
    System.out.println("2 ==> "+ch2.substring(10, 11));
    System.out.println("3 ==> "+ch3.substring(10, 11));

    webDriver.quit();
}
}
