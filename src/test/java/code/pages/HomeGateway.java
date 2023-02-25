package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeGateway extends BrowserUtils {
    public HomeGateway(){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath="//input[@type='submit']")
    private WebElement buyNow;

    @FindBy(xpath = "//select[@names='quantity]")
    private WebElement quantityDropdown;

    public void setBuyNow() {
        staticWait(2);
        buyNow.click();
    }

    public void selectquantityDropdown(String str){
        Select select = new Select(quantityDropdown);
        select.selectByValue(str);
    }
}
