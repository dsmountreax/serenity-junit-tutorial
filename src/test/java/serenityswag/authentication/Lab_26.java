package serenityswag.authentication;

import org.openqa.selenium.By;

public class Lab_26 {

    private final By searchFormID=By.cssSelector("#search_form_input_homepage");
    private final By searchFormClass=By.cssSelector(".search__input--adv");
    private final By searchFormAttribute=By.cssSelector("input[type='text']");
    private final By searchFormSibling=By.cssSelector("#search_form_homepage> input");

    private final By searchButtonID=By.cssSelector("#search_button_homepage");
    private final By searchButtonClass=By.cssSelector(".search__button");
    private final By searchButtonAttribute=By.cssSelector("input[type='submit']");
    private final By searchButtonSibling=By.cssSelector("#search_form_homepage input:nth-child(2)");

    //Solution


    /* Se busca primero por data. Se busca segundo por id. para mirar por consola $("Css Locator"). Se busca tercero por
    clase se busca cuarto por tag. Se busca quinto por attributo. Se busca sexto por child. Si se necesita traverse DOM
    se usa Xpath. Si se necesita un texto especifico se busca por Xpath.
     */
}
