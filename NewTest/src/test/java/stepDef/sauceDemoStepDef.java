package stepDef;

import PageObjects.sauceDemopageObj;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sauceDemoStepDef {

    public WebDriver driver;
    public sauceDemopageObj sauceObj;




    @Given("^User opens the browser$")
    public void user_opens_the_browser() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");

        driver= new ChromeDriver();
        sauceObj= new sauceDemopageObj(driver);

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();



    }

    @When("^User logs into the application with correct (.+) and (.+)$")
    public void user_logs_into_the_application_with_correct_and(String username, String password) {

        sauceObj.loginNameField(username);
        sauceObj.PasswordField(password);
        sauceObj.loginbutton();


    }

    @Then("^User Selects a product and adds the product to the cart$")
    public void user_selects_a_product_and_adds_the_product_to_the_cart() {

        sauceObj.selectProduct();



    }

    @Then("^User verifies if the correct product is added to the cart$")
    public void user_verifies_if_the_correct_product_is_added_to_the_cart() {

        sauceObj.addtoCart();

        String Product=   driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();

        Assert.assertEquals("Sauce Labs Backpack",Product);

        System.out.println(Product+" added to the cart successfully.");



    }

}
