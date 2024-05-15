import org.testng.annotations.Test;
import pages.HomePage;

public class TestClass extends TestBase {


    @Test
    public void firstTestCase() {
        new HomePage(page).clickOnSignupButton();
    }

}


