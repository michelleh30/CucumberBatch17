package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="txtUsername")//simple way to write the locator
    public WebElement usernameTextField;//name  of the webelement

    @FindBy(id="txtPassword")//simple way to write the locator
    public WebElement passwordTextField;//name  of the webelement

    @FindBy(id="btnLogin")//simple way to write the locator
    public WebElement loginBtn;//name  of the webelement

    public LoginPage(){
        //our this code initialize all the elements of the page
        //bc when the obj creates, constructor will be called which will
        //initialize all these elements
        PageFactory.initElements(driver,this);//to intialize weblement
    }
}
