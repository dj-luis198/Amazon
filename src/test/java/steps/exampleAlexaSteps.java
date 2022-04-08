package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;


public class exampleAlexaSteps {
    HomePage HP=new HomePage();

@Given("^the user navigates to www.amazon.com$")
public void goToAmazon(){
    HP.goToHomePage();
}
@And("^searches for (.+)$")
public void searchesCriteria(String criteria){
HP.search("Alexa");
}
@And("^navigates to the (.+)$")
public void goToPage(String page){
    HP.goToPageX(page);
}
@And("^select the (.+)$")
public void selectItem(String item) throws InterruptedException {
    Thread.sleep(5000);
    HP.selectItemX(item);

}
@Then("^assert what the item would be available for purchase$")
public void assertAddToCart(){
  Assert.assertTrue("Can't add to cart",HP.addToCart());
}

}
