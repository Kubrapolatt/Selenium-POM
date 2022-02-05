package tests.day17;

import org.testng.annotations.Test;

public class C04_SingletonPattern {
    @Test
    public void test01(){

        // singelton pattern : bir class'dan birden fazla obje üretilmesine
        // izin vermeyen bir pattern olarak kabul görmüştür

        // biz Driver class'ını driver üretmek üzere kullanıyoruz
        // ancak Driver class'ında driver isminde bir instance variable da var
        // ve biz obje üreterek bu insatance driver'a ulaşabiliriz

        // Driver driver1=new Driver();
        // Driver driver2=new Driver();
        // Driver driver3=new Driver();

        //singleton pattern kabul görmüş bir patterndir
        //amaç bir class'dan obje üretilmemesini sağlamaktır
        //bunun için 'singleton pattern' de koruyacağımız class'da
        //parametresiz bir constructor oluşturur ve bu const'ı private yaparız.

    }
}
