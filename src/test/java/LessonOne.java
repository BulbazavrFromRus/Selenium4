import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonOne {

    @Test
    public void lessonOne(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://grinfer.com/");

        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals(getUrl, "https://grinfer.com/");

        String getTitle = driver.getTitle();
        Assert.assertEquals("Top Online Courses | Grinfer", getTitle);


        String getPage = driver.getPageSource();

        System.out.println("Page "+getPage);

        driver.close();
        driver.quit();

    }
}
