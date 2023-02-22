package code.pages;

import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLogin extends BrowserUtils {

    public OrangeHrmLogin(){
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//input[@id='txtUsername']") private WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']") private WebElement passWord;

    @FindBy(id="btnLogin") private WebElement loginButton;

    public void setUsername(){
        userName.sendKeys(ConfigurationReader.getProperties("username"));

    }
    public void setPassWord(){
        passWord.sendKeys(ConfigurationReader.getProperties("password"));
    }

    public void setLoginButton(){
        loginButton.click();
    }



}
