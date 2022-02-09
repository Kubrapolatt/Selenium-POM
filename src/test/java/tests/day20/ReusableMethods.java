package tests.day20;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ReusableMethods {

    // bir method olusturalim
    // dosya yolu,sayfa ismi ve satir, hucre indexini verince hucre bilgisini dondursun
    public static Cell hücreGetir(String path, String sayfaIsmi,int satırIndex, int hücreIndex){
        Cell cell=null;
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satırIndex).getCell(hücreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cell;
    }
    public static Map<String,String> mapOluştur(String path, String sayfaAdı) {
        Map<String,String> excelMap=new TreeMap<>();
        Workbook workbook=null;
        //ilk adim excelde istenen sayfaya ulasmak ulasmak
        try {
            FileInputStream fis =new FileInputStream(path);
            workbook=WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int satırSayısı=workbook.getSheet(sayfaAdı).getLastRowNum();
        String key="";
        String value="";
        for (int i=0 ; i<=satırSayısı ;i++){
            // ikinci adim tablodaki hucreleri map'e uygun hale donusturmek
            key=workbook.getSheet(sayfaAdı).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaAdı).getRow(i).getCell(1).toString() +
                    ", " +workbook.getSheet(sayfaAdı).getRow(i).getCell(2).toString()+
                    ", " + workbook.getSheet(sayfaAdı).getRow(i).getCell(3).toString();
            // ucuncu adim key-value haline getirdigimiz satirlari map'e eklemek
            excelMap.put(key,value);
        }
        return excelMap;
    }
}