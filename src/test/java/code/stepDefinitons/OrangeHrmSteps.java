package code.stepDefinitons;

import code.pages.OrangeHrmLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmSteps {
    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("Browser is launched");

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {

        OrangeHrmLogin orangeHrmHome= new OrangeHrmLogin();
        orangeHrmHome.setUsername();
        orangeHrmHome.setPassWord();

    }
    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        OrangeHrmLogin orangeHrmLogin = new OrangeHrmLogin();
        orangeHrmLogin.setLoginButton();

    }
    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {

    }
}
