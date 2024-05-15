package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SignupLoginPage extends PageBase{
    Locator signupName = page.locator("input[name='name']");
    Locator signupMail = page.locator("input[data-qa='signup-email']");
    Locator signupButton = page.locator("button[data-qa='signup-button']");
    public SignupLoginPage(Page page) {
        super(page);
    }
    public void setSignupName(){
        setElementText(signupName, "Yahia Hisham");
        setElementText(signupMail, "yahia@mail.com");
        clickOnElement(signupButton);
    }
}
