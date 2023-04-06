package stepDefinition;

import flows.LoginFlow;
import flows.NotificationFlow;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class NotificationCases {

    public NotificationFlow nf;
    public LoginFlow lf;
    public DriverFactory df;
    public WebDriver driver;


//    public NotificationCases()
//    {
//        df = new DriverFactory();
//        driver = df.get_driver();
//        nf = new NotificationFlow(driver);
//        lf = new LoginFlow(driver);
//
//        df.launchPage();
//        System.out.println(driver.getTitle());
//
//        lf.enterUserName("anirudho@auberginesolutions.com");
//        lf.enterPassword("Gmail@2022");
//        lf.tapLogin_withCorrectEmailFormat();
//    }

    @Before(order=0)
    public void setUp()
    {
        df = new DriverFactory();
        driver = df.get_driver();
        nf = new NotificationFlow(driver);
        lf = new LoginFlow(driver);

        df.launchPage();
        System.out.println(driver.getTitle());

        lf.enterUserName("anirudho@auberginesolutions.com");
        lf.enterPassword("Gmail@2022");
        lf.tapLogin_withCorrectEmailFormat();
    }

    @Given("User is at Notifications Page")
    public void user_is_at_notifications_page() {
        nf.moveToNotifications();
    }

    @Given("counter values are set to default")
    public void counter_values_are_set_to_default() {
        System.out.println(nf.getBodyCount());
        System.out.println(nf.getTitleCount());
    }

    @When("User enters title as {string}")
    public void user_enters_title_as(String string) {
        nf.enterTitle(string);
    }

    @Then("title count is accurate")
    public void title_count_is_accurate() {
        System.out.println(nf.getTitleCount());
    }

    @When("User enters body as {string}")
    public void user_enters_body_as(String string) {
      nf.enterBody(string);
    }

    @Then("Body count is accurate")
    public void body_count_is_accurate() {
        System.out.println(nf.getBodyCount());
    }

    @When("Title is blank")
    public void title_is_blank() {
        nf.enterTitle("");
    }

    @When("Body Is blank")
    public void body_is_blank() {
        nf.enterBody("");
    }

    @Then("Send Button is disabled")
    public void send_button_is_disabled() {
        Assert.assertTrue(nf.isSendDisabled());
    }

    @When("Body Is not blank")
    public void body_is_not_blank() {
        nf.enterBody("QA Test Notification");
    }

    @When("Title is not blank")
    public void title_is_not_blank() {
        nf.enterTitle("QA Test Notification");
    }

    @When("Confirmation field is updated")
    public void confirmation_field_is_updated() {
        nf.enterValidationText("notify fanamp users");
    }

    @Then("Send Button is enabled")
    public void send_button_is_enabled() {
        Assert.assertFalse(nf.isSendDisabled());
    }

    @When("Send Button is clicked")
    public void send_button_is_clicked() {
       nf.clickSend();
    }

    @Then("Toast Message appears")
    public void toast_message_appears() {
        Assert.assertTrue(nf.isToastVisible());
    }

    @After(order=0)
    public void tearDown()
    {
        driver.close();
    }
}
