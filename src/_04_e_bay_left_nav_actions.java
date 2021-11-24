import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_e_bay_left_nav_actions extends Parent_selenium {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "resourcces/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");
        driver.manage().window().maximize();

        WebElement akzeptieren = driver.findElement(By.xpath("//span[contains(@class,'jsx-4131758822')]"));
        akzeptieren.click();

        WebElement esc_click=driver.findElement(By.xpath("//a[@title='Close (Esc)']"));
        Parent_selenium.options_click(esc_click,driver);


        List<WebElement>left_nav_List=driver.findElements(By.xpath("//ul[@id='home-ul-ctgrs']/li"));
        Parent_selenium.options_actions(left_nav_List,driver);


      driver.quit();
    }




}
