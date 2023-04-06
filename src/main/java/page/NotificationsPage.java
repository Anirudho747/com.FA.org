package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NotificationsPage {

    @FindBy(id="Notifications")
    @CacheLookup
    protected WebElement notifications;

    @FindBy(xpath="//p[text()='Capped at 113 characters.']/preceding::input[@name='Title']")
    @CacheLookup
    protected WebElement title;

    @FindBy(xpath="//p[text()='Capped at 113 characters.']/following::textarea[@id='exampleFormControlTextarea1']")
    @CacheLookup
    protected WebElement body;

    @FindBy(xpath="//p[text()='Capped at 113 characters.']/following::input[@name='Title']")
    @CacheLookup
    protected WebElement validationField;

    @FindBy(xpath="//button[contains(@class,'Submit_Button')]")
    @CacheLookup
    protected WebElement sendButton;

    @FindBy(xpath="//div[@class='Toastify__progress-bar Toastify__progress-bar--animated Toastify__progress-bar-theme--light Toastify__progress-bar--default']")
    @CacheLookup
    protected WebElement toast;

    @FindBy(xpath="//label[text()='Body']/preceding::div[@class='align-self-end ps-2']")
    @CacheLookup
    protected WebElement titleLength;

    @FindBy(xpath="//label[text()='Body']/following::div[@class='align-self-end ps-2']")
    @CacheLookup
    protected WebElement bodyLength;
}
