package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverİlkTest{

    //Driver class'ı sayesinde bizim eski driver öldü
    //artık driver'a ihtiyaç varsa Driver.getDriver() yazıcaz

    @Test
    public void test1(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittiğimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));
        Driver.closeDriver();

        //Driver.getDriver method'u her calistiginda
        //driver=new ChromeDriver(); komutundan dolayi yeni bir driver olusturuyor
        //Biz Driver class'dan getDriver'i calsitirdigimizda new atamasi olsun
        //sonraki calistirmalarda atama olmasin istiyoruz
        //bunun icin driver= new ChromeDriver(); satiri bir if blogu iicine alacagiz
    }

    @Test
    public void test2(){
        //bestbuy.com anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        //bestbuy'a gittiğimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("best"));
        Driver.closeDriver();
    }


}
