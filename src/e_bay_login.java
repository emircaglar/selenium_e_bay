import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_bay_login {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay-kleinanzeigen.de/");

        WebElement akzeptieren=driver.findElement(By.xpath("//div[@class='jsx-709184318 ActionArea']/button/span/span"));
        akzeptieren.click();

        WebElement Auto_Rad_Boot = driver.findElement(By.xpath("//a[@class='text-link-secondary treelist-headline']"));
        Auto_Rad_Boot.click();

        WebElement von_bis_VON = driver.findElement(By.id("srchrslt-brwse-price-min"));
        von_bis_VON.sendKeys("3000");
        WebElement von_bis_Bis = driver.findElement(By.id("srchrslt-brwse-price-max"));
        von_bis_Bis.sendKeys("6000");
        WebElement weiter_suchen = driver.findElement(By.xpath("//div[@class='browsebox-section-body']/div/button/i"));
        weiter_suchen.click();

        driver.quit();


    }

}
