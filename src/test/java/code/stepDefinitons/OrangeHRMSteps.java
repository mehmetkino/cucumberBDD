package code.stepDefinitons;


import code.pages.*;
import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {

    OrangeHRMLogin orangeHRMLogin= new OrangeHRMLogin();//for less codes i create the object here
    OrangeHRMHome orangeHRMHome= new OrangeHRMHome();
    OrangeHRMAddEmployee_page orangeHRMAddEmployee_page= new OrangeHRMAddEmployee_page();


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

    @Then("The user wants to click on PIM module")
    public void the_user_wants_to_click_on_pim_module() {
      OrangeHRMPIMModule orangeHRMPIMModule= new OrangeHRMPIMModule();
        orangeHRMPIMModule.click_pim();
        staticWait(2);

    }
    @Then("The user wants to go to add employee page")
    public void the_user_wants_to_go_to_add_employee_page() {

        OrangeHRMPIMModule orangeHRMPIMModule= new OrangeHRMPIMModule();
        orangeHRMPIMModule.EmployeeButton();
        staticWait(2);

    }
    @Then("The user wants to add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
        orangeHRMAddEmployee_page.setFirstName(string);
        staticWait(2);

    }
    @Then("The user wants to add last name as  {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
        orangeHRMAddEmployee_page.setLastName(string);
        staticWait(2);

    }
    @Then("The user wants to save the personeal information")
    public void the_user_wants_to_save_the_personeal_information() {
        orangeHRMAddEmployee_page.Save_Button(); //this is extra for save button
        staticWait(2);


    }
    @Then("The user wants to see {string}")
    public void the_user_wants_to_see(String string) {
        OrangeHRM_PersonalDetails orangeHRM_personalDetails= new OrangeHRM_PersonalDetails();
        orangeHRM_personalDetails.setVerify_Text("string");
        staticWait(2);

    }

    @Then("The user wants to add employye's first and last name as fallowing")
    public void the_user_wants_to_add_employye_s_first_and_last_name_as_fallowing(Map<String, String> dataTable) {

    }
    @Then("The user wants to add login details as fallowing")
    public void the_user_wants_to_add_login_details_as_fallowing(Map<String, String> dataTable) {

    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {


    }

}
