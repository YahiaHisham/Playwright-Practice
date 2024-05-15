import com.microsoft.playwright.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.nio.file.Paths;

public class TestBase {
    public Playwright playwright = Playwright.create();
    public Browser browser;
    public BrowserContext context;
    public Page page;

    @BeforeTest
    public void startBrowser() {
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();

        // Start tracing before creating / navigating a page.
        context.tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)
                .setSnapshots(true)
                .setSources(true));
        page = context.newPage();
        page.navigate("https://automationexercise.com/");
    }

    @AfterTest
    public void tearDown() {
// Stop tracing and export it into a zip archive.
        context.tracing().stop(new Tracing.StopOptions()
                .setPath(Paths.get("trace.zip")));
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
    }
}
