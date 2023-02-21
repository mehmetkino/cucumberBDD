package code.stepDefinitons;

import code.pages.Home;
import code.pages.Payment;
import code.pages.Verification;
import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class steps extends BrowserUtils {

    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
       Driver.getDriver();
        BrowserUtils.setWaitTime();
       driver.get(ConfigurationReader.getProperties("url"));
       driver.manage().window().maximize();
        System.out.println("The website is launched");


    }
    @When("The user wants to buy a elephant toy")
    public void the_user_wants_to_buy_a_elephant_toy() {
        Home home= new Home();
        home.setBuyNow();



    }
    @Then("The user wants to enter payments information")
    public void the_user_wants_to_enter_payments_information(Map<String, String> dataTable) {

        Payment payment= new Payment();
        payment.setCardNumber(dataTable.get("Cnumber"));
        payment.setExpirationMonth(dataTable.get("Emonth"));
        payment.setExpirationYear(dataTable.get("Eyear"));
        payment.setCvvCode(dataTable.get("CVV"));


    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
        Payment payment= new Payment();
        payment.setPayButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
        Verification verification= new Verification();
        verification.setVerificationText(expected);



    }
}
