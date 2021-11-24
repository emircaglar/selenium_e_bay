import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Parent_selenium {
    public static  WebElement element;


 public static void wait_element_visibil(WebElement element, WebDriver driver){

     WebDriverWait wait=new WebDriverWait(driver,10 );
     wait.until(ExpectedConditions.visibilityOf(element));

 };
 public static void wait_element_click(WebElement element,WebDriver driver){

     WebDriverWait wait=new WebDriverWait(driver,10 );
     wait.until(ExpectedConditions.elementToBeClickable(element));

 };
    public static void wait_element_list(List<WebElement> actionsList,WebDriver driver){

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElements(actionsList));

    };public static void wait_element_list_bestimte(List<WebElement> actionsList,WebDriver driver,int zahl){

        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(actionsList.get(zahl)));

    };

    public static   void von_get_von( WebDriver driver, String value) {

        element = driver.findElement(By.id("srchrslt-brwse-price-min"));
        wait_element_visibil(element,driver);
        element.sendKeys(value);
    };

    public static   void von_get_bis( WebDriver driver, String value) {
        element = driver.findElement(By.id("srchrslt-brwse-price-max"));
        wait_element_visibil(element,driver);
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
        wait_element_visibil(element1,driver);
        element1.sendKeys(value);
    };


    public static   void options_actions( List<WebElement> actionsList ,WebDriver driver){
        Actions actions= new Actions(driver);
        wait_element_list(actionsList,driver);
        for (WebElement element:actionsList
             ) {
            actions.moveToElement(element).perform();

            // wenn wir wollen,wie der Code aussieht, konnen wir thread benutzen

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };


    public static void options_select(WebElement element,WebDriver driver){

        Select select=new Select(element);
        select.selectByIndex(2);

    }

    public static void options_von_list_select(List<WebElement> generalList,WebDriver driver,int zahl){

        wait_element_list_bestimte(generalList,driver,zahl);
        for (int i = 0; i <generalList.size() ; i++) {
            generalList.get(zahl).click();
        }

    }
}
