package code.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    //we are using encapsulation logic in here by making driver private
    //we will need to  create getter and setter method for driver

    public static WebDriver driver;


   private static String browser= ConfigurationReader.getProperties("browser");
    public static WebDriver getDriver(){
        if (driver== null){

            switch(browser){
                case"Chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;

                case"Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    break;

                case"chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case"firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
                // this is extra for branch push

            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
}}
