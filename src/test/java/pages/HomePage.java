package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;


public class HomePage extends Base{
   private String navSearch= "//*[@id=\"twotabsearchtextbox\"]";
   private String locatorList="s-product-image-container";
   private String buttonAddToCart= "//*[@id=\"add-to-cart-button\"]";



    public HomePage() {
        super(driver);
    }

public void goToHomePage(){
        goTo("https://www.amazon.com/");
}

public void search(String criteria){
        try {
            sendKeys(navSearch,criteria);
            submit(navSearch);
        }catch (TimeoutException e){
            throw new Error("The NavSearch item was not found: "+e);
        }
}
public void goToPageX(String page){
    try {
        clickLinkText(page);
    }catch (NoSuchElementException e){
        throw new Error("The link was not found: "+e);
    }

}

public void selectItemX(String item){
    try {
        click(locatorList, item);
    }catch (IndexOutOfBoundsException | TimeoutException e){
        throw new Error("The index of the specified element is not correct: "+e);
    }

   }

public Boolean addToCart(){
    try {
        return isDisplayed(buttonAddToCart);
    }catch (TimeoutException e){
        throw new Error("The add to cart item was not found: "+e);
    }

}
}
