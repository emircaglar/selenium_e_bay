import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_e_bay_select_katagorien extends Parent_selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay-kleinanzeigen.de/");

       WebElement akzeptieren = driver.findElement(By.xpath("//span[contains(@class,'jsx-4131758822')]"));
       Parent_selenium.options_click(akzeptieren, driver);

        WebElement esc_click = driver.findElement(By.xpath("//a[@title='Close (Esc)']"));
        Parent_selenium.options_click(esc_click, driver);

        WebElement mehr_click = driver.findElement(By.xpath("//section[@id='home-ctgrs']/div[1]/ul/li[1]/ul/li[11]/a"));
        Parent_selenium.options_click(mehr_click, driver);

        WebElement katagorien = driver.findElement(By.xpath("//ul[@id='home-ul-ctgrs']/li[1]"));
        Parent_selenium.options_click(katagorien, driver);

        List<WebElement> auto_rad_boot_List = driver.findElements(By.xpath("//ul[@class='browsebox-itemlist treelist']/li"));
        Parent_selenium.options_actions(auto_rad_boot_List, driver);


        driver.quit();
    }


}
