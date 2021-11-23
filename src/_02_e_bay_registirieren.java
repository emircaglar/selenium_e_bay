import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_e_bay_registirieren {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();


        WebElement akzeptieren = driver.findElement(By.xpath("//span[contains(@class,'jsx-4131758822')]"));
        akzeptieren.click();

        WebElement registrieren = driver.findElement(By.xpath("//a[text()='Registrieren']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", registrieren);
        registrieren.click();


        Thread.sleep(3000);
        driver.quit();
        // wir benutzen eine test Progrm , deswegen können wir niht registirieren

       /*WebElement e_mail_login = driver.findElement(By.cssSelector("input[id='registration-email']"));
        e_mail_login.sendKeys("blabla@gmail.com");
        WebElement password_login = driver.findElement(By.cssSelector("input[id='registration-password']"));
        password_login.sendKeys("blabla@gmail.com");
        WebElement ich_bin_keine_roboter = driver.findElement(By.cssSelector("input[id='recaptcha-anchor]"));
        ich_bin_keine_roboter.click();

        WebElement datenschutz_click = driver.findElement(By.cssSelector("input[id='marketing-optin']"));
        datenschutz_click.click();

        WebElement kostenlos_registirieren = driver.findElement(By.cssSelector("button[id='registration-submit']"));
        kostenlos_registirieren.click();
*/
    }

}
