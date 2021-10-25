package serenityswag.inventory;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.User;
import serenityswag.authentication.actions.LoginActions;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
//LAB_19
@RunWith(SerenityRunner.class)
public class WhenViewingHighlightedProducts {

    @Managed(driver="chrome") // para correr la prueba con chrome
    WebDriver driver;

    @Steps
    LoginActions login;
    ProductListPageObject productList;
    ProductDetails productDetails;

    @Test
    public void shouldDisplayHighlightedProductsOnTheWelcome()
    {
        login.as(User.STANDARD_USER);

        List<String> productOnDisplay=productList.titles();

        assertThat(productOnDisplay).hasSize(6)
                .contains("Sauce Labs Backpack");
    }

    //Lab_020
    @Test
    public void shouldDisplayCorrectProductDetailsPage()
    {
        login.as(User.STANDARD_USER);
        String firstItemName=productList.titles().get(0);
        productList.openProductDetailFor(firstItemName);
        assertThat(productDetails.productName()).isEqualTo(firstItemName);
        productDetails.productImageWithAltValueOf(firstItemName).shouldBeVisible(); // ".inventory_details_container img[alt='Sauce Labs Backpack']"

    }
    // Final de Lab_020

    //Lab_037 run mvn report
    // mvn serenity:aggregate
    // fin lab_37

}
