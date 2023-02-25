package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPIMModule extends BrowserUtils {

    public OrangeHRMPIMModule(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
    private WebElement PIM;

    @FindBy(id = "btnAdd") private WebElement AddButton;

    public void click_pim(){
        PIM.click();
    }
    public void EmployeeButton(){
        AddButton.click();
    }



}
