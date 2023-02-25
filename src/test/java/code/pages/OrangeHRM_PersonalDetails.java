package code.pages;

import code.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_PersonalDetails extends BrowserUtils {
    public OrangeHRM_PersonalDetails(){
        PageFactory.initElements(driver , this);

    }

    @FindBy(xpath = "//h1[.='Personal Details']") private WebElement Verify_Text;

    public void setVerify_Text(String string) {
        Assert.assertEquals(string, Verify_Text.getText());
    }
}
