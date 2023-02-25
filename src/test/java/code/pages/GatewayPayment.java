package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GatewayPayment extends BrowserUtils {
    public GatewayPayment(){
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
    public void setExpirationMonth( String exmonth){
        staticWait(1);
        ExpirationMonth.sendKeys(exmonth);
    }
    public void setExpirationYear(String exyear){
        staticWait(1);
        ExpirationYear.sendKeys(exyear);
    }
    public void setCvvCode(String code){
        staticWait(1);
        cvvCode.sendKeys(code);
    }
    public void setPayButton(){
        PayButton.click();
    }

}
