package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage {

    @FindBy(id="email")
    @CacheLookup
    protected WebElement userName;

    @FindBy(id="password")
    @CacheLookup
    protected WebElement passWord;

    @FindBy(xpath="//button[@class='login-button Disabled']")
    @CacheLookup
    protected WebElement login;

    @FindBy(xpath="//button[@class='login-button']")
    @CacheLookup
    protected WebElement login_withCorrectEmailFormat;

    @FindBy(xpath="//div[text()='Password is required.']")
    @CacheLookup
    protected WebElement blankPasswordPrompt;

    @FindBy(xpath="//div[text()='Invalid email address.']")
    @CacheLookup
    protected WebElement wrongEmailFormatPrompt;

    @FindBy(xpath="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--default']")
    @CacheLookup
    protected WebElement toast;
}
