package serenityswag.inventory;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;

public class ProductListPageObject extends PageObject {
    public List<String> titles() {
        //return findAll(By.className("inventory_item_name")).textContents(); Usual convention
        return findAll(".inventory_item_name").textContents();
        // findAll cosa nueva textContents cosa nueva
    }

    public void openProductDetailFor(String itemName) {
        find(By.linkText(itemName)).click();
    }

    public String imageTextForProduct(String productName) {
        return //find(By.xpath("//div[@class='inventory_item'][contains(.,'"+ productName +"')]//img")).getAttribute("alt");
        $("//div[@class='inventory_item'][contains(.,'"+ productName +"')]//img").getAttribute("alt");
    }
}
