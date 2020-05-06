package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NameDemo {

    public static void main(String[] args) {
// TODO Auto-generated method stub

        //System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

// Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("no")).click();

//Click on Check Button
        driver.findElement(By.id("buttoncheck")).click();

    }

}
