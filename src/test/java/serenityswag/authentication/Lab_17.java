package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;

@RunWith(SerenityRunner.class)
public class Lab_17 {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {

        login.asID(STANDARD_USER);
        //Should see product catalog

        Serenity.reportThat("The inventory  page should be displayed with the correct title",
                //Lambda Expresion
                ()->assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("PRODUCTS")
        );
        // correr todos los test mvn serenity:aggregate
    }
}
