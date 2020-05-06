package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Form {
    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        //.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","C:\\Tools\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        // Get the WebElement corresponding to the Email Address(TextField)
        WebElement email = driver.findElement(By.id("email"));

        // Get the WebElement corresponding to the Password Field
        WebElement password = driver.findElement(By.name("passwd"));

        email.sendKeys("abc2020@gmail.com");
                password.sendKeys("abcdefghlkjl");
        System.out.println("Text Field Set");

        // Deleting values in the text box
        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");

        // Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        // Using click method to submit form
        email.sendKeys("abc2020@gmail.com");
        password.sendKeys("abcdefghlkjl");
        login.click();
        System.out.println("Login Done with Click");

        //using submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abc2020@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
        driver.findElement(By.id("SubmitLogin")).submit();
        System.out.println("Login Done with Submit");

        //driver.close();

    }
}
