package code.stepDefinitons;


import code.pages.OrangeHRMHome;
import code.pages.OrangeHRMLogin;
import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrangeHRMSteps extends BrowserUtils {

    OrangeHRMLogin orangeHRMLogin= new OrangeHRMLogin();//for less codes i create the object here


    @Given("The user wants to go to Orange HRM website")
    public void the_user_wants_to_go_to_orange_hrm_website() {

        Driver.getDriver().get(ConfigurationReader.getProperties("urlHRMTest"));
        BrowserUtils.staticWait(1);

    }

    @When("The user wants to enter correct username")
    public void the_user_wants_to_enter_correct_username() {
        orangeHRMLogin.setUsername(ConfigurationReader.getProperties("username"));


    }

    @When("The user wants to enter correct password")
    public void the_user_wants_to_enter_correct_password() {
        orangeHRMLogin.setPassword(ConfigurationReader.getProperties("password"));

    }

    @Then("The user wants to click on login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRMLogin.setLoginButton();


    }

    @Then("The user wants to verify that the browser launched on Dashboard")
    public void the_user_wants_to_verify_that_the_browser_launched_on_dashboard() {

        OrangeHRMHome orangeHRMHome= new OrangeHRMHome();
        orangeHRMHome.VeriyingText();



    }
    @Then("The user wants to verify that the browser launched on {string}")
    public void the_user_wants_to_verify_that_the_browser_launched_on(String ExpectedMsg) {
      OrangeHRMHome orangeHRMHome= new OrangeHRMHome();
        orangeHRMHome.VeriyingText(ExpectedMsg);
    }
}
