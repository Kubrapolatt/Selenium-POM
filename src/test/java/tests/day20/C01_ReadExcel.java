package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {
        String path = "src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(path);

        //Bz FIS ile okuduğumuz excel dosyasını projemiz içerisinde kullanabilmek için
        //Apachi POI depenceny ile bir WoekBook oluşturduk

        //Bu workbook bizim projemizin içerisinde ülkeler excelin bir kopyasını kullanmamızı sağlıyor

        //Excel'in yapısı gereği bir hücreye(Cell)ulaşabilmek için workbook'dan başlayarak
        //sırasıyla sheet,row ve cell objeleri oluşturmak gerekiyor


        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row= sheet.getRow(4);
        Cell cell=row.getCell(2);

        System.out.println(cell);//Andorra

        //index'i 4 olan satırdaki,indexi 2 olan hücrenin Andorra olduğunu test ediniz
        String expectedData="Andorra";
        Assert.assertEquals(cell.toString(),expectedData);

        //5. indexteki satırın,3.indexteki hücre bilgisini yazdıralım
         row= sheet.getRow(5);
         cell= row.getCell(3);

        System.out.println(cell);//Luanda




    }


}
