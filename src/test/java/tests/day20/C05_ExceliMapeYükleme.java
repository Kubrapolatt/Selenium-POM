package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYükleme {

    @Test
    public void test01(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden
        //reusable bir method oluşturalım

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdı="Sayfa1";

        System.out.println(ReusableMethods.mapOluştur(path, sayfaAdı));

        Map<String,String> ülkelerMap=ReusableMethods.mapOluştur(path,sayfaAdı);
        //oluşturduğmuz map2i kullanarak Turkey'in bilgilerini yazdırın

        System.out.println(ülkelerMap.get("Turkey"));

        //Listede Netherlands olduğunu test edin

        Assert.assertTrue(ülkelerMap.containsKey("Netherlands"));

    }
}
