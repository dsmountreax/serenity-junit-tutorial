package serenityswag.cart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.inventory.ProductList;

import java.util.List;

public class CartActions extends UIInteractionSteps {

    ShoppingCartIcon shoppingCartIcon;

    @Step("Add {0} to the cart")
    public void addItem(String itemName) {
        //$$("Locator") in console get more details about the elements
        //Enrique $$(".inventory_item [data-test*='backpack']")
        //$("//div[@class='inventory_item'] //button[contains(.,"+ itemName +")]");
        $(ProductList.addToCartButtonFor(itemName)).click();
    }

    @Step("Add {0} to the cart")
    public void addItems(List<String> items) {
       items.forEach(this::addItem);
       // code part to analyze
    }

    @Step("Open the shopping cart")
    public void openCart() {
        $(shoppingCartIcon.link()).click();
        // $(ShoppingCartIcon.link()).click(); But you need to change method to static
    }

    public List<String> displayedItems() {

        return findAll(".inventory_item_name").texts();

    }
}
