package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {
        //ülkeler exceline 5.sütun olarak nüfus sütunu ekleyelim

        //1-dosyaya ulaşalım
        String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        //2-class'da çalışmak için dosyanın bir kopyası olan bir eornook oluşturalım
        Workbook workbook= WorkbookFactory.create(fis);

        //3-dosyada yapmak istediğimiz değişiklikleri kopya workbook'da yapalım

        // ilk satırın 5.hücresine NÜFUS başlığını yazdıralım
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NÜFUS");

        //3. satırdaki ülkenin nüfusunu 1000000 yapalım
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

        //4-kopyada yaptığımız değişiklikleri ana dosyaya kaydedelim
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);

    }

}
