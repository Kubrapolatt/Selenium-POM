package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebtableDemoqa {

    //Bir Class olusturun D19_WebtablesHomework


    @Test(groups = {"smoke","regression"})
    public void demoqaTest(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        DemoqaPage demoqaPage=new DemoqaPage();
        //  2. Headers da bulunan department isimlerini yazdirin
        //  normlde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis
        System.out.println("baslik satiri elementi : "+demoqaPage.başlıkSatırıElementi.getText());

        // ikinci yontem olarak basliklari bir listeye koyabilirim
        // basliklarWebelementiListesi

        //  3. 3.sutunun basligini yazdirin

        System.out.println("3.sutun basligi : "+demoqaPage.başlıklarWebelementiListesi.get(2).getText());

        //  4. Tablodaki tum datalari yazdirin
        System.out.println("===========Tum body==========");
        System.out.println(demoqaPage.bodyTekWebelement.getText());
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        System.out.println("Tablodaki data sayisi : "+demoqaPage.tümDataWebelementList.size());
        //  6. Tablodaki satir sayisini yazdirin
        System.out.println("Tum satir sayisi : "+demoqaPage.tümSatırlarWebelementList.size());
        //  7. Tablodaki sutun sayisini yazdirin
        //     farkli yollardan hesaplanabilir ama biz hucre sayisi / satir sayisi yapalim
        System.out.println("tablodaki sutun sayisi : " + demoqaPage.tümDataWebelementList.size()/demoqaPage.tümSatırlarWebelementList.size());
        //  8. Tablodaki 3.kolonu yazdirin
        demoqaPage.sütunYazdır(2);


        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        demoqaPage.ismeGöreMaaşYazdir("Alden");
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        demoqaPage.hücreyazdır(3,2);

        Driver.closeDriver();
    }



}