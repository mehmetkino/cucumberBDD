package code.stepDefinitons;

import code.pages.GatewayPayment;
import code.pages.HomeGateway;
import code.pages.GatewayVerification;
import code.utils.BrowserUtils;
import code.utils.ConfigurationReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class Gatewaysteps extends BrowserUtils {
    HomeGateway homeGateway= new HomeGateway();

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

        homeGateway.setBuyNow();



    }
    @Then("The user wants to enter payments information")
    public void the_user_wants_to_enter_payments_information(Map<String, String> dataTable) {

        GatewayPayment gatewayPayment = new GatewayPayment();
        gatewayPayment.setCardNumber(dataTable.get("Cnumber"));
        gatewayPayment.setExpirationMonth(dataTable.get("Emonth"));
        gatewayPayment.setExpirationYear(dataTable.get("Eyear"));
        gatewayPayment.setCvvCode(dataTable.get("CVV"));


    }
    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
        GatewayPayment gatewayPayment = new GatewayPayment();
        gatewayPayment.setPayButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
        GatewayVerification gatewayVerification = new GatewayVerification();
        gatewayVerification.setVerificationText(expected);



    }
    @When("The user wants to buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {

        HomeGateway homeGateway= new HomeGateway();
        homeGateway.selectquantityDropdown(string);


    }
    @Then("The user wants to enter Credir card number as {string}")
    public void the_user_wants_to_enter_credir_card_number_as(String string) {
        GatewayPayment gatewayPayment= new GatewayPayment();
        gatewayPayment.setCardNumber(string);

    }
    @Then("The user wants to enter Expiration Month as\"{int}\"")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        GatewayPayment gatewayPayment= new GatewayPayment();
        gatewayPayment.setExpirationMonth(string);

    }
    @Then("The user wants to enter Expiration Year as\"{int}\"")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        GatewayPayment gatewayPayment= new GatewayPayment();
        gatewayPayment.setExpirationMonth(string);


    }
    @Then("The user wants to enter CVV Code as\"{int}\"")
    public void the_user_wants_to_enter_cvv_code_as(String str) {
        GatewayPayment gatewayPayment= new GatewayPayment();
        gatewayPayment.setCvvCode(str);

    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        GatewayVerification gatewayVerification= new GatewayVerification();


    }
    @Then("The user wants to verify message as\"Payment successfull!\"")
    public void the_user_wants_to_verify_message_as_payment_successfull() {

    }
}
