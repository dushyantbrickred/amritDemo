package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sauceDemopageObj {

    public WebDriver ldriver;

    public sauceDemopageObj (WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement usrName;

    @FindBy(xpath= "//*[@id=\"password\"]")
    WebElement pwd;

    @FindBy(xpath ="//*[@id=\"login-button\"]")
    WebElement lgn;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement product;

    @FindBy(xpath= "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement add2cart;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement cart;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement cartProd;


    public void loginNameField(String userName){
        usrName.sendKeys(userName);
    }


    public void PasswordField(String Password) {
        pwd.sendKeys(Password);
    }


    public void loginbutton() {
        lgn.click();
    }

    public void selectProduct() {
        product.click();
    }

    public void addtoCart() {
        add2cart.click();
    }


    public void Cart() {
        cart.click();
    }



    public void productInCart() {
        cartProd.getText();
    }

    }

