package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {

    @Test
    public void test(){

        //Ülkeler excel'indeki Sayfa1 de
        //11.indexteki satırın 2.indexeki hücresini Azerbaycan olduğunu test edelim

        String path="src/test/java/resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData=ReusableMethods.hücreGetir(path,"Sayfa1",11,2).toString();

        Assert.assertEquals(actualData,expectedData);



    }
}
