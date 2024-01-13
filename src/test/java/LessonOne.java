import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonOne {
WebDriver driver = new ChromeDriver();
    @Test
    public void lessonOne(){
        /*WebDriver driver = new ChromeDriver();
        driver.get("https://grinfer.com/");

        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals(getUrl, "https://grinfer.com/");

        String getTitle = driver.getTitle();
        Assert.assertEquals("Top Online Courses | Grinfer", getTitle);


        String getPage = driver.getPageSource();

        System.out.println("Page "+getPage);

        driver.close();
        driver.quit();*/

        driver.get("https://github.com/BulbazavrFromRus");
        Cookie getCookie = new Cookie("user_session", "9rwnt_Poklm1pgIHXGdTg3RkRm-SBdNp9lA8qkv1VSRFSyiY");
        driver.manage().addCookie(getCookie);
        driver.navigate().refresh();


    }
}
