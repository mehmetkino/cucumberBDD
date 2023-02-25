package code.pages;

import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin extends BrowserUtils {
    public OrangeHRMLogin(){
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//input[@id='txtUsername']")
    private WebElement Username;

    @FindBy(xpath="//input[@id='txtPassword']")
    private WebElement Password;

    @FindBy(xpath="//input[@id='btnLogin']")
    private WebElement loginButton;


    public void setUsername(String userName){
        Username.sendKeys(userName);

    }
    public void setPassword(String passWord){
        Password.sendKeys(passWord);


    }
    public void setLoginButton(){
        loginButton.click();
    }


}
