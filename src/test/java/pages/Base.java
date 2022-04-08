package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Base {
    protected static WebDriver driver;
    private static WebDriverWait ewait;

    static{
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win3299//chromedriver.exe");
        ChromeOptions ChromeOptions = new ChromeOptions();
        driver = new ChromeDriver(ChromeOptions);
        driver.manage().window().maximize();
        WebDriverWait ewait= new WebDriverWait(driver,10);
    }

    public Base(WebDriver driver){

        Base.driver=driver;
        ewait= new WebDriverWait(driver,10);
    }

    protected static void goTo(String url){
        driver.get(url);
    }

    private static WebElement findElement(String locator){
        return ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    protected static void sendKeys(String locator, String text){
       findElement(locator).sendKeys(text);
    }

    protected static void submit(String locator){
        findElement(locator).submit();
    }

    protected static void clickLinkText(String page){
        driver.findElement(By.linkText(page)).click();
    }

    protected static List<WebElement> listWebElements(String locator) {

        return ewait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(locator)));
    }

    protected static void click(String locator, String item){
            listWebElements(locator).get(Integer.parseInt(item)-1).click();
        }

    protected static Boolean isDisplayed(String locator){
       return findElement(locator).isDisplayed();
    }








    public static void quit(){
        driver.quit();
    }

}
