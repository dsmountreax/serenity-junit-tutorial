package serenityswag.cart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.inventory.ProductList;

import java.util.List;

public class AddToCartActions extends UIInteractionSteps {

    @Step("Add {0} to the cart")
    public void item(String itemName) {
        //$$("Locator") in console get more details about the elements
        //Enrique $$(".inventory_item [data-test*='backpack']")
        //$("//div[@class='inventory_item'] //button[contains(.,"+ itemName +")]");
        $(ProductList.addToCartButtonFor(itemName)).click();
    }

    @Step("Add {0} to the cart")
    public void items(List<String> items) {
       items.forEach(this::item);
       // code part to analyze
    }
}
