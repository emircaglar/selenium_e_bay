import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_e_bay_elektronik extends Parent_selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();

        WebElement akzeptieren = driver.findElement(By.xpath("//span[contains(@class,'jsx-4131758822')]"));
        akzeptieren.click();

        WebElement esc_click=driver.findElement(By.xpath("//a[@title='Close (Esc)']"));
        esc_click.click();

        WebElement elektronik_options=driver.findElement(By.xpath("//ul[@id='home-ul-ctgrs']/li[10]/a"));
        elektronik_options.click();

        WebElement zuerst_options=driver.findElement(By.id("sortingField-selector-inpt"));
        Parent_selenium.options_click(zuerst_options,driver);

        WebElement zuerst_gunstige=driver.findElement(By.xpath("//li[contains(@data-value,'PRICE_AMOUNT')] "));
        zuerst_gunstige.click();

        WebElement von_get_von=driver.findElement(By.id("srchrslt-brwse-price-min"));
        Parent_selenium.options_sendkeys(von_get_von,driver,"1000");
        WebElement von_get_bis=driver.findElement(By.id("srchrslt-brwse-price-max"));
        Parent_selenium.options_sendkeys(von_get_bis,driver,"2000");

        Parent_selenium.weiter_click(driver);

        WebElement zweite_seite=driver.findElement(By.xpath("//div[@class='pagination-pages']/a[1] "));
        Parent_selenium.options_click(zweite_seite,driver);


        Thread.sleep(2000);

        driver.quit();

    }



}
