package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {
    // 3 test method'u olusturalim


    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satırYazdırTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girişYap();
        // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        WebElement üçüncüsatırElementi=hmcWebTablePage.satırGetir(4);

        System.out.println(üçüncüsatırElementi.getText());

        Driver.closeDriver();
    }

    @Test
    public void hücreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girişYap();
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredki element : "+hmcWebTablePage.hücreWebelementGetir(5,3));
        Driver.closeDriver();
    }

    @Test
    public void sütunYazdırTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girişYap();
        // 3. sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.sütunYazdır(4);

        Driver.closeDriver();
    }

}
