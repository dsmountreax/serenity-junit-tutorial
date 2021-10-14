package serenityswag.inventory;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.User;
import serenityswag.authentication.actions.LoginActions;

@RunWith(SerenityRunner.class)
public class WhenViewingHighlightedProducts {
    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    @Test
    public void shouldDisplayHighlightedProductsOnTheWelcome()
    {
        login.as(User.STANDARD_USER);
    }
}
