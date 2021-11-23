import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parent_selenium {
    public static  WebElement element;

    public static   void von_get_von(String von_bis_Von, WebDriver driver, String value) {
        element = driver.findElement(By.id(von_bis_Von));
        element.sendKeys(value);
    };

    public static   void von_get_bis(String von_bis_Bis, WebDriver driver, String value) {
        element = driver.findElement(By.id(von_bis_Bis));
        element.sendKeys(value);
    };
}
