package flows;

import org.openqa.selenium.Keys;
import page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginFlow extends LoginPage{

    public  WebDriver driver;

    public LoginFlow (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String s)
    {
        userName.sendKeys(s);
        userName.sendKeys(Keys.TAB);
    }

    public void enterPassword(String s)
    {
        passWord.sendKeys(s);
        userName.sendKeys(Keys.TAB);
    }

    public void tapLogin()
    {
        login.click();
    }

    public void tapLogin_withCorrectEmailFormat()
    {
        login_withCorrectEmailFormat.click();
    }

    public boolean isEmailFormatMsgPresent()
    {
        return(wrongEmailFormatPrompt.isDisplayed());
    }

    public boolean isBlankPasswordMsgPresent()
    {
        return(blankPasswordPrompt.isDisplayed());
    }

    public boolean isToastPresent()
    {
        return(toast.isDisplayed());
    }
}
