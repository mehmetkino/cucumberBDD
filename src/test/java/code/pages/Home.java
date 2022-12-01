package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BrowserUtils {
    public Home(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath="//input[@type='submit']")
    private WebElement buyNow;

    public void setBuyNow() {
        staticWait(2);
        buyNow.click();
    }
}
