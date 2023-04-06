package flows;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.NotificationsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NotificationFlow extends NotificationsPage{

    public  WebDriver driver;

    public NotificationFlow(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void moveToNotifications()
    {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        notifications.click();
    }

    public void enterTitle(String s)
    {
        title.sendKeys(s);
        title.sendKeys(Keys.TAB);
    }

    public void enterBody(String s)
    {
        body.sendKeys(s);
        body.sendKeys(Keys.TAB);
    }

    public void enterValidationText(String s)
    {
        validationField.sendKeys(s);
        validationField.sendKeys(Keys.TAB);
    }

    public void clickSend()
    {
        sendButton.click();
    }

    public boolean isSendDisabled()
    {
        return(!sendButton.isEnabled());
    }

    public String getTitleCount()
    {
        return(titleLength.getText());
    }

    public String getBodyCount()
    {
        return(bodyLength.getText());
    }

    public boolean isToastVisible()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
        wait.until(ExpectedConditions.visibilityOf(toast));
        return(toast.isDisplayed());
    }


}
