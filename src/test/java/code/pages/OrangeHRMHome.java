package code.pages;

import code.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//h1[.='Dashboard']")
    private WebElement VeriyingText;



    public void VeriyingText(){

        Assert.assertEquals("Dashboard", VeriyingText.getText());

    }

    public void VeriyingText(String str ){

        Assert.assertEquals(str, VeriyingText.getText());

    }






}
