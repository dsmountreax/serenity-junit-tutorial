package serenityswag.inventory;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jetbrains.annotations.NotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.User;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.cart.AddToCartActions;
import serenityswag.cart.ShoppingCartBadge;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;

// class created for Lab_39
@RunWith(SerenityRunner.class)
public class WhenAddingAnItemCountShouldBeShown {

    @Managed(driver="chrome")
    WebDriver driver;

    @Steps
    LoginActions login;

    // Page component
    ShoppingCartBadge shoppingCartBadge;
    ProductList productList;

    @Steps
    AddToCartActions addToCart;

    @Before
    public void login()
    {
        login.as(STANDARD_USER); // remember static import


    }

    @Test
    public void theCorrectItemCountShouldBeShown() {

        // Check that the shopping cart badge is empty.
        Serenity.reportThat("Check that the shopping cart badge is empty.",
                ()->assertThat(shoppingCartBadge.count()).isEmpty());

        // assert is from Assertions.assertThat (or.assertj.core.api)

        // Add 1 item to the cart
        addToCart.item("Sauce Labs Backpack");

        // The shopping cart badge should be "1"
        Serenity.reportThat("The shopping cart badge should be '1'",
                ()->assertThat(shoppingCartBadge.count()).isEqualTo("1"));
    }

    @Test
    public void allTheItemsShouldAppearInTheCart()
    {
        //Add several items to the cart

        List<String> productTitles= firstThreeProductTitlesDisplayed();

        //Open the cart page
        addToCart.items(productTitles);

        String cartBadgeCount=Integer.toString(productTitles.size());

        Serenity.reportThat("The shopping cart badge should be" + cartBadgeCount,
                ()->assertThat(shoppingCartBadge.count()).isEqualTo(cartBadgeCount)
        );

        //Should see all of the items listed

    }

    @NotNull
    private List<String> firstThreeProductTitlesDisplayed() {
        return productList.titles().subList(0,2);
    }
}
