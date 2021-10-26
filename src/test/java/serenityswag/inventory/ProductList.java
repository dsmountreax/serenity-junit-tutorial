package serenityswag.inventory;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class ProductList extends PageObject {

    public static By addToCartButtonFor(String itemName) {
        return By.xpath("//div[@class='inventory_item'][contains(.,'"+ itemName +"')]//button");
        // dynamic By remember to put ''
    }

    public List<String> titles() {
        //return findAll(By.className("inventory_item_name")).textContents(); Usual convention
        return findAll(".inventory_item_name").textContents();
        // findAll cosa nueva textContents cosa nueva
    }
    public static By productDetailsLinkFor(String itemName) {
        return By.linkText(itemName);
    }

    public String imageTextForProduct(String productName) {
        return //find(By.xpath("//div[@class='inventory_item'][contains(.,'"+ productName +"')]//img")).getAttribute("alt");
                $("//div[@class='inventory_item'][contains(.,'"+ productName +"')]//img").getAttribute("alt");
    }
}
