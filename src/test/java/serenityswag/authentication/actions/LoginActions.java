package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {
    @Step("First Login as a Standard User")
    public void asAStandardUser()
    {
        openUrl("https://www.saucedemo.com/"); // se agrega en clase 12
        //Login as a standard user
        $("//input[@placeholder='Username']").sendKeys("standard_user");
        $("//input[@data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }
    //Lab_13 inicio

    @Step("Log in as a Locked Out User")
    public void asALockedOutUser()
    {
        openUrl("https://www.saucedemo.com/"); // se agrega en clase 12
        //Login as a standard user
        $("//input[@placeholder='Username']").sendKeys("locked_out_user");
        $("//input[@data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }

    @Step("Log in as a {0}")
    public void as(User user)
    {
        openUrl("https://www.saucedemo.com/"); // se agrega en clase 12
        //Login as a standard user
        $("//input[@placeholder='Username']").sendKeys(user.getUsername());
        $("//input[@data-test='password']").sendKeys(user.getPassword());
        $("[data-test='login-button']").click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }

    //Lab_13 final

    //Lab_17 inicio
    @Step("Log in as a {0} with ID")
    public void asID(User user)
    {
        openUrl("https://www.saucedemo.com/"); // se agrega en clase 12
        //Login as a standard user
        $("[id='user-name']").sendKeys(user.getUsername());
        find(By.id("password")).sendKeys(user.getPassword());
        find("#login-button").click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }

    //Lab_17 final

    //Lab_18 inicio
    public void asName(User user) {
        openUrl("https://www.saucedemo.com/");
        //Login as a standard user
        $("[name='user-name']").sendKeys(user.getUsername());
        find(By.name("password")).sendKeys(user.getPassword());
        find(By.name("login-button")).click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }
    //Lab_18 final

    //Lab_19 inicio
    public void asClass(User user) {
        openUrl("https://www.saucedemo.com/");
        //Login as a standard user
        $("[class='input_error form_input']").sendKeys(user.getUsername());
        find(By.name("password")).sendKeys(user.getPassword());
        $(By.name("login-button")).click();
        //$ is equivalent to find
        // WebDriver y UIInteractionSteps no son compatibles
    }
    //Lab_19 final

}
