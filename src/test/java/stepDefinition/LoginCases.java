package stepDefinition;

import flows.LoginFlow;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;
import io.cucumber.java.After;


public class LoginCases {

    public LoginFlow lf;
    public DriverFactory df;
    public WebDriver driver;

    @Before(order = 0)
    public void setUp()
    {
        df = new DriverFactory();
        driver = df.get_driver();
        lf = new LoginFlow(driver);
    }

    @Given("User is at Login Page")
    public void user_is_at_login_page() {
        df.launchPage();
        System.out.println(driver.getTitle());
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String string) {
        lf.enterUserName(string);
    }

    @Then("User gets a Validation Message for username")
    public void user_gets_a_validation_message_for_username() {
        lf.isEmailFormatMsgPresent();
    }

    @When("User enters blank password")
    public void user_enters_blank_password() {
       lf.enterPassword("");
    }
    @Then("User gets a Validation Message for password")
    public void user_gets_a_validation_message_for_password() {
      lf.isBlankPasswordMsgPresent();
    }

    @When("User enters password as {string}")
    public void user_enters_password_as(String string) {
        lf.enterPassword(string);
    }
    @Then("User should get a Toast notification")
    public void user_should_get_a_toast_notification() {
        lf.tapLogin_withCorrectEmailFormat();
        lf.isToastPresent();
    }

    @Then("User should be redirected to page with title {string}")
    public void user_should_be_redirected_to_page_with_title(String string) {
        lf.tapLogin_withCorrectEmailFormat();
        System.out.println(driver.getTitle());
    }

    @After(order=0)
    public void tearDown()
    {
        driver.close();
    }

    }
