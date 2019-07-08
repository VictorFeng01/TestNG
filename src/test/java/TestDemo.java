import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
    @Test(priority = 0)
    //@Parameters("Java")
    public void search() throws InterruptedException {
        //输入搜索字符串
        driver.findElement(By.id("kw")).sendKeys("Java");
        Thread.sleep(5000);
        //点击[百度一下]按钮
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    //@Parameters("ditu")
    public void diTu() throws InterruptedException{
        driver.findElement(By.id("kw")).clear();
        Thread.sleep(5000);
        driver.findElement(By.id("kw")).sendKeys("Python");
        Thread.sleep(3000);
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
}

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
