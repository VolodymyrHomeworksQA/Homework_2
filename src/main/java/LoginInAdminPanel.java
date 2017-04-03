import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Admin on 31.03.2017.
 */
public class LoginInAdminPanel {
    public static void main (String[] args) {

        System.getProperty("driver.chrome");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get(" http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement login = chromeDriver.findElement(By.name("email"));
        WebElement password = chromeDriver.findElement(By.id("passwd"));
        WebElement entranceButton = chromeDriver.findElement(By.name("submitLogin"));
        login.sendKeys("webinar.test@gmail.com");
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        entranceButton.click();

        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img [@width = '32' ]")));
        WebElement Pictograph = chromeDriver.findElement(By.xpath("//img [@width = '32' ]"));
        Pictograph.click();
        WebElement entranceTab = chromeDriver.findElement(By.id("header_logout"));
        entranceTab.click();
        chromeDriver.quit();
    }
}