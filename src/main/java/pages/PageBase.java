package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class PageBase {
    Page page;

    public PageBase(Page page) {
        this.page = page;
    }

    public void clickOnElement(Locator elementLocator) {
        elementLocator.click();
    }

    public void setElementText(Locator elementLocator, String text) {
        elementLocator.fill(text);
    }
}
