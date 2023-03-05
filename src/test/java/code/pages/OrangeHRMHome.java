package code.pages;

import code.utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;



public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){
        PageFactory.initElements(driver, this);
    }

    private static final Logger logger=Logger.getLogger(String.valueOf(OrangeHRMHome.class));
    //String of is not necessary but it was givin me error that's why i put this


    @FindBy(xpath="//h1[.='Dashboard']") private WebElement VeriyingText;
    @FindBy(xpath = "//a[@id='menu_pim_viewPimModule']") private WebElement PIM;
    @FindBy(id = "btnAdd") private WebElement AddButton;
    @FindBy(id = "firstName") private WebElement firstName;
    @FindBy(xpath = "//h1[.='Personal Details']") private WebElement Verify_Header;
    @FindBy(id="lastName") private WebElement lastName;

    @FindBy(id="btnSave") private WebElement saveButton;

    @FindBy(id="chkLogin") private WebElement click_Radiobox;

    @FindBy(id="user_name") private WebElement userName;

    @FindBy(id="user_password") private WebElement userPassword;

    @FindBy(id="re_password") private WebElement confirmPassword;

    @FindBy(id="status") private WebElement statusDropdown;





    public void VeriyingText(){
        Assert.assertEquals("Dashboard", VeriyingText.getText());

    }
    public void VeriyingText(String str ) {
        Assert.assertEquals(str, VeriyingText.getText());
    }

    public void click_pim(){
        PIM.click();
    }
    public void EmployeeButton(){
        AddButton.click();
    }

    public void setFirstName(String string){

        firstName.sendKeys(string);
        logger.info(string + "it is succesfully entered");
        System.out.println("first name is successfully enterd");
    }

    public void setLastName(String str){

        lastName.sendKeys(str);
        logger.info(str +"It is perfectly entered");
        System.out.println("Last name is successfully entered");
    }

    public void Save_Button()
    {
        saveButton.click();
    }

    public void setClick_Radiobox() {
        click_Radiobox.click();
    }

    public void setUserName(String username) {
        userName.sendKeys(username);

    }

    public void setUserPassword(String userpassword) {
        userPassword.sendKeys(userpassword);

    }

    public void setConfirmPassword(String confirmpassword) {
        confirmPassword.sendKeys(confirmpassword);

    }

    public void setStatusDropdown(String statusdropdown) {
        Select select= new Select(statusDropdown);
        select.selectByValue("Disabled");
        logger.info(statusdropdown +"This is gets executed");//this is my check point it will check and give me inforamtion here
                                                  //this will give me detailed explanation like line nuber etc year m..
        System.out.println("disabled is successfully passed");
    }
    public void setVerify_Header(String string) {

        Assert.assertEquals(string, Verify_Header.getText());
    }

}


