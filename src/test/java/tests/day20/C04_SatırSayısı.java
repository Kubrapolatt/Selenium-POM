package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatırSayısı {

    @Test
    public void test01() throws IOException {
        //ülkeler excelindeki Sayfa1 ve Sayfa2'deki satır sayılarını
        //ve kullanılan satır sayılarını bulun

        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatırSayısı=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanılanSatırSayısı=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();

        System.out.println("1. Sayfa satır sayısı : "+sayfa1SatırSayısı);  //190
        System.out.println("1. Sayfa fiziki kullanılan satır sayısı : "+sayfa1FizikiKullanılanSatırSayısı);  //191

        System.out.println("--------------------------------------------------------------");
        //fiziki kullanılan satır sayısı index ile değil sayma sayıları ile çalışır

        int sayfa2SatırSayısı=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanılanSatırSayısı=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();

        System.out.println("2. Sayfa satır sayısı : "+sayfa2SatırSayısı);
        System.out.println("2. Sayfa fiziki kullanılan satır sayısı : "+sayfa2FizikiKullanılanSatırSayısı);


    }
}
