import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e_bay_login {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resourcces/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay-kleinanzeigen.de/");



        driver.quit();


    }

}
