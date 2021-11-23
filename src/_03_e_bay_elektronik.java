import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_e_bay_elektronik {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();

        WebElement akzeptieren = driver.findElement(By.xpath("//span[contains(@class,'jsx-4131758822')]"));
        akzeptieren.click();

        WebElement elektronik_options=driver.findElement(By.xpath(" //ul[@id='home-ul-ctgrs']/li[10]/a"));
        elektronik_options.click();

        WebElement zuerst_options=driver.findElement(By.id("sortingField-selector-inpt"));
        zuerst_options.click();

        WebElement zuerst_günstige=driver.findElement(By.xpath("  //li[contains(@data-value,'PRICE_AMOUNT')] "));
        zuerst_günstige.click();
    }



}
