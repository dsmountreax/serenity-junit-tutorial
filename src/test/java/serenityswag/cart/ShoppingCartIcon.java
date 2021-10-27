package serenityswag.cart;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShoppingCartIcon extends PageObject {
    public String badgeCount() {

        return $(".shopping_cart_link").getText();
        // Web element is only displayed after added some item
    }

    public By link()
    {
        return By.cssSelector(".shopping_cart_link");
    }
}
