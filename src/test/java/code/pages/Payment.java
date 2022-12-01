package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment  extends BrowserUtils {
    public Payment(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement CardNumber;

    @FindBy(id="month")
    private WebElement ExpirationMonth;

    @FindBy( id="year")
    private WebElement ExpirationYear;

    @FindBy(id="cvv_code")
    private WebElement cvvCode;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement PayButton;


    public void setCardNumber(String cardnumber){
        staticWait(1);
        CardNumber.sendKeys(cardnumber);

    }

}
