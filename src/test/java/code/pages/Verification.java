package code.pages;

import code.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verification extends BrowserUtils {
    public Verification(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationText;

    public void setVerificationText(String expected){
        staticWait(1);
        Assert.assertEquals(verificationText.getText(), expected);
    }
}
