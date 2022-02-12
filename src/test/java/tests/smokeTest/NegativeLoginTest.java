package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    //1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //- yanlisSifre
    //- yanlisKulllanici
    //- yanlisSifreKullanici

    @Test
    public void yanlışŞifre(){
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://qa-environment.concorthotel.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButonu.click();
        //4) Verilen senaryolar ile giris yapilamadigini test et
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıYazıElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlışKullanıcı(){
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://qa-environment.concorthotel.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButonu.click();
        //4) Verilen senaryolar ile giris yapilamadigini test et
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıYazıElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlışŞifreKullanıcı(){
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://qa-environment.concorthotel.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        //3) Login butonuna bas
        hotelMyCampPage.loginButonu.click();
        //4) Verilen senaryolar ile giris yapilamadigini test et
        Assert.assertTrue(hotelMyCampPage.girişYapılamadıYazıElementi.isDisplayed());
        Driver.closeDriver();
    }


}
