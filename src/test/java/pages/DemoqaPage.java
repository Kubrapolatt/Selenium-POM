package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement başlıkSatırıElementi;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> başlıklarWebelementiListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebelement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tümDataWebelementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tümSatırlarWebelementList;


    public void sütunYazdır(int sütun) {
        // ((//div[@class='rt-tr-group'])[3]//div[@class='rt-td'])[4]

        int satırSayısı = tümSatırlarWebelementList.size();
        String dinamikXpath;
        WebElement geçiciElement;
        System.out.println(başlıklarWebelementiListesi.get(sütun - 1).getText());

        for (int i = 1; i <= satırSayısı; i++) {

            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + sütun + "]";
            geçiciElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            System.out.println(geçiciElement.getText());
        }
    }

    public void ismeGöreMaaşYazdir(String isim) {
        int satırSayısı = tümSatırlarWebelementList.size();
        String dinamikXpath;
        String satırdakiİsim;
        String salary;

        for (int i = 1; i <satırSayısı; i++) {
            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + 1 + "]";
            satırdakiİsim = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + 5 + "]";
            salary = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();


            if (satırdakiİsim.equals(isim)) {
                System.out.println(salary);
            }
        }

    }

    public void hücreyazdır(int satır, int sütun) {
        String dinamikXpath = "((//div[@class='rt-tr-group'])[" + satır + "]//div[@class='rt-td'])[" + sütun + "]";
        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());

    }
}