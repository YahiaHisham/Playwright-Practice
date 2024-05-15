package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class HomePage extends PageBase {
    Locator signupLoginButton = page.locator(".fa-lock");


    public HomePage(Page page) {
        super(page);
    }

    public void clickOnSignupButton() {
        clickOnElement(signupLoginButton);
    }
}
