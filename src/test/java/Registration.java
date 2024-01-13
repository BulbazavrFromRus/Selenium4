import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Registration{

    private By inputFirstName = By.xpath("//div[@class='form-group']//input[@id='user_first_name']");
    private By inputLastName = By.xpath("//div[@class='form-group']//input[@id='user_last_name']");
    private By inputEmail = By.xpath("//div[@class='form-group']//input[@id='user_email']");
    private By inputUsername = By.xpath("//div[@class='form-group']//input[@id='user_username']");
    private By inputPassword = By.xpath("//div[@class='form-group']//input[@id='user_password']");

    private By buttonJoin  =By.xpath("//div[@class='form-group']//input[@class='btn btn-default btn-block-level']");

    private By buttonCopy = By.id("pre_copy");
    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://unsplash.com/join");

        driver.findElement(inputFirstName).sendKeys("New");
        driver.findElement(inputLastName).sendKeys("Test");

        driver.switchTo().newWindow(WindowType.TAB).get("https://tempmail.plus/en/#!");

        driver.findElement(buttonCopy).click();

        sleep(3000);

        ArrayList<String> newTab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(0));

        driver.findElement(inputEmail).sendKeys(Keys.LEFT_CONTROL + "v");
        driver.findElement(inputUsername).sendKeys("enemy");
        driver.findElement(inputPassword).sendKeys("12345678");
        driver.findElement(buttonJoin).click();

    }
}

