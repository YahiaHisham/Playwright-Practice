import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupLoginPage;

public class TestClass extends TestBase {


    @Test
    public void firstTestCase() {
        new HomePage(page).clickOnSignupButton();
        new SignupLoginPage(page).enterSignupNameAndEmail();
    }

    @Test
    public void birstTestCase() {
        new HomePage(page).clickOnSignupButton();
        new SignupLoginPage(page).enterSignupNameAndEmail();
    }

}


