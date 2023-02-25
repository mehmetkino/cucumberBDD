package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMAddEmployee_page extends BrowserUtils {

    public OrangeHRMAddEmployee_page(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName") private WebElement firstName;

    @FindBy(id="lastName") private WebElement lastName;

    @FindBy(id="btnSave") private WebElement saveButton;


    public void setFirstName(String string){

        firstName.sendKeys(string);
    }

    public void setLastName(String str){

        lastName.sendKeys(str);
    }

    public void Save_Button(){
        saveButton.click();
    }






}
