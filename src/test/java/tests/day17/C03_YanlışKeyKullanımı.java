package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlışKeyKullanımı {
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCurl"));
        //Eğer key olarak girdiğimiz string configuration.properties dosyasında yoksa
        //Örneğin : HMCUrl yerine HMCurl yazarsak
        //ConffigReader.getProperty() o key'i bulamaz
        //ve nullPointerException fırlatır
    }
}
