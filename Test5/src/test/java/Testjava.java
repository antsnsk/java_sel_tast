import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Testjava {
    FirefoxDriver wd;
   // ChromeOptions o;
    
    @BeforeMethod
    public void setUp() throws Exception {
        //o = new ChromeOptions();
       // o.addArguments("--window-size=1684,768");
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void Testjava() {
        wd.get("https://app.geteasyqa.com/users/sign_in");
        wd.findElement(By.id("user_email")).click();
        wd.findElement(By.id("user_email")).sendKeys("acc4easyqatest@gmail.com");
        wd.findElement(By.id("user_password")).click();
        wd.findElement(By.id("user_password")).sendKeys("acc4easyqatestQwe");
        wd.findElement(By.name("commit")).click();
        wd.findElement(By.linkText("Мои Проекты")).click();
        wd.findElement(By.linkText("test project 1")).click();
        wd.findElement(By.linkText("Баг Трекер")).click();
        wd.findElement(By.linkText("Создать карточку")).click();
        wd.findElement(By.id("issue_summary")).click();
        wd.findElement(By.id("issue_summary")).sendKeys("Тест1");
        wd.findElement(By.id("issue_description")).click();
        wd.findElement(By.id("issue_description")).sendKeys("12345");
     //   WebElement selectType = new RemoteWebElement();
     //   selectType = wd.findElement(By.id("type-view"));
       // selectType.click();
     //   selectType = wd.findElement(By.linkText("Задание"));
        //wd.findElement(By.linkText("Ошибка")).click();
        //wd.findElement(By.xpath("//div[@id='mCSB_11_container']//label[.='Ошибка']")).click();
        wd.findElement(By.name("commit")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
