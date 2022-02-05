package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public  FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath="//input[@id='email']")
    public WebElement emailKutusu;



@FindBy(xpath="//input[@id='pass']")
public WebElement passwordKutusu;

@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
public WebElement girişButonu;

@FindBy(xpath = "//div[text()='Girdiğin e-posta bir hesaba bağlı değil. ']")
public WebElement girilemediYazısıElementi;

public void bekle(int saniye){
}


}