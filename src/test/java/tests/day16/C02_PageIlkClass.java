package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {

    //POM' de farklı class'lara farklı şekilde ulaşılması benimsenmiştir
    //Driver class'ı için static yöntemi kullanıyoruz
    //Page Class'ları ise obje üzerinden kullanılması tercih edilmiştir
    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna nutella yazıp aratalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuçlarının nutella içerdiğini test edelim
        String actualSonuçStr=amazonPage.sonuçYazısıElementi.getText();

        Assert.assertTrue(actualSonuçStr.contains("Nutella"));
        Driver.closeDriver();
    }

    @Test
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
       //java için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java",Keys.ENTER);
      //sonucun java içerdiğini tets edelim
        String actualSonuçStr=amazonPage.sonuçYazısıElementi.getText();
        Assert.assertTrue(actualSonuçStr.contains("Java"));
        Driver.closeDriver();
}

}
