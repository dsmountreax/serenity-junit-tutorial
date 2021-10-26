package serenityswag.cart;

import net.thucydides.core.pages.PageObject;

public class ShoppingCartBadge extends PageObject {
    public String count() {

        return $(".shopping_cart_link").getText();
        // Web element is only displayed after added some item
    }
}
