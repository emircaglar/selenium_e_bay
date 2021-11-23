import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent_selenium {
    public static  WebElement element;


 public static void wait_element(WebElement element,WebDriver driver){

     WebDriverWait wait=new WebDriverWait(driver,10 );
     wait.until(ExpectedConditions.visibilityOf(element));

 };
 public static void wait_element_click(WebElement element,WebDriver driver){

     WebDriverWait wait=new WebDriverWait(driver,10 );
     wait.until(ExpectedConditions.elementToBeClickable(element));

 };

    public static   void von_get_von( WebDriver driver, String value) {

        element = driver.findElement(By.id("srchrslt-brwse-price-min"));
        wait_element(element,driver);
        element.sendKeys(value);
    };

    public static   void von_get_bis( WebDriver driver, String value) {
        element = driver.findElement(By.id("srchrslt-brwse-price-max"));
        wait_element(element,driver);
        element.sendKeys(value);
    };
    public static   void weiter_click( WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='browsebox-section-body']/div/button/i"));
        wait_element_click(element,driver);
        element.click();
    };

    public static   void options_click(WebElement element1 ,WebDriver driver) {
        wait_element_click(element1,driver);
        element1.click();
    };


    public static   void options_sendkeys(WebElement element1 ,WebDriver driver,String value) {
        wait_element(element1,driver);
        element1.sendKeys(value);
    };
}
