import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_e_bay_von_bis extends Parent_selenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay-kleinanzeigen.de/");

        WebElement akzeptieren = driver.findElement(By.xpath("//div[@class='jsx-709184318 ActionArea']/button/span/span"));
        akzeptieren.click();

        Thread.sleep(2000);
        WebElement Auto_Rad_Boot = driver.findElement(By.xpath("//ul[@id='home-ul-ctgrs']/li[1]/a"));
        Auto_Rad_Boot.click();

        // ich  habe eine andere Class hergestellt , weil der Code immer wiederholen wird
        Parent_selenium.von_get_von(driver, "3000");
        Parent_selenium.von_get_bis( driver, "6000");

        Thread.sleep(2000);
       /*WebElement von_bis_Bis = driver.findElement(By.id("srchrslt-brwse-price-max"));
        von_bis_Bis.sendKeys("6000");*/


        Parent_selenium.weiter_click(driver);
        /*
        WebElement weiter_suchen = driver.findElement(By.xpath("//div[@class='browsebox-section-body']/div/button/i"));
        weiter_suchen.click();*/


        driver.quit();

    }

}
