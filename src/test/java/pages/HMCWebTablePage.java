package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatırDatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tümBodyWebElementi;


    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tümBodyDatalarıList;


    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satırlarListesi;


    public WebElement satırGetir(int satırNo){


        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        String satırDinamikXpath= "//tbody//tr["+ satırNo +"]";
        WebElement satırElementi=Driver.getDriver().findElement(By.xpath(satırDinamikXpath));

        return satırElementi;
    }


    public String  hücreWebelementGetir(int satır, int sütun) {
        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        String dinamikHücreXpath="//tbody//tr["+ satır  +"]//td["+ sütun  +"]";
        WebElement istenenHücreElementi=Driver.getDriver().findElement(By.xpath(dinamikHücreXpath));
        String hücreDatası=istenenHücreElementi.getText();

        return hücreDatası;
    }

    public void sütunYazdır(int sütun) {

        // her bir satirdaki istenen sutun elementini yazdirabilmek icin
        // once satir sayisini bilmeye ihtiyacim var

        int satirsayisi=satırlarListesi.size();

        for (int i=1 ; i<=satirsayisi ; i++ ){
            System.out.println(hücreWebelementGetir(i, sütun));
        }



    }
}