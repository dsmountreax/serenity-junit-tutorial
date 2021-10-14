package serenityswag.authentication;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SerenityRunner.class)
public class WhenLogginOn extends UIInteractionSteps{
    // 12 se agrega el extends
    @Managed
    WebDriver driver;

    @Test
    public void usersCanLogOnViaTheHomePage()
    {
        //Login as a standard user
        //driver.get("https://www.saucedemo.com/"); // se reemplaza en clase 12 por open
        openUrl("https://www.saucedemo.com/"); // se agrega en clase 12
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[data-test='login-button']")).click();

        //data-test data is for testing purposes
        //verify selector $("[data-test='username']") in browser console

        //Should see product catalog
        assertThat(driver.findElement(By.cssSelector("span.title")).getText())
                .isEqualTo("PRODUCTS");
    }

    public static class Lab_13 {
    }
}
