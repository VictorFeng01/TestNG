import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
    WebDriver driver;
    @BeforeTest
    public void init() {
        String url = "http://www.baidu.com";
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }
    @Test
    @Parameters("Java")
    public void search(String searchWord) throws InterruptedException {
        //输入搜索字符串
        driver.findElement(By.id("kw")).sendKeys(searchWord);
        //点击[百度一下]按钮
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
