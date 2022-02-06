package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage{

  public   HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girişYapılamadıYazıElementi;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement başarılıGirişYazısı;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

   @FindBy(xpath = "//select[@class='form-control input-lg required']")
   public WebElement addHotelDropdown;

   @FindBy(xpath = "//button[@id='btnSubmit']")
   public WebElement addHotelSaveButonu;


   @FindBy(xpath = "//button[@class='btn btn-primary']")
   public WebElement addHotelKayıtBaşarılıYazısıOkButonu;

    public void girişYap(){
     Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
     ilkLoginLinki.click();
     usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
     passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
      loginButonu.click();
    }

    public void bekle(int saniye){
      try {
        Thread.sleep(saniye*1000);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
    }


}
