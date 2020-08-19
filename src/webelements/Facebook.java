package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);


        driver.get("https://www.facebook.com/");

        WebElement signInBox=driver.findElement(By.name("email"));
        signInBox.sendKeys("kurtmahir48@gmail.com");

        WebElement passwordBox=driver.findElement(By.name("pass"));
        passwordBox.sendKeys("258456e.!");//tabikide yanlis sifer :))

        WebElement loginBox=driver.findElement(By.name("login"));
        loginBox.click();


        driver.quit();
    }
}
