package Clarusway.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08_AssertionInfo {

    @Test
    public void hard(){
        //hard assertionlar Assert classi uzerinden cagirdigimiz ve biildigimiz methodlardir..
        //test executioni sirasinda herhangi bir assertion failed olursa trest execution o anda durur
        System.out.println("checking 1=1");
        Assert.assertEquals(1,1);//passed
        System.out.println("checking 1=2");
        Assert.assertEquals(1,2);//failed, execion burada durur
        System.out.println("hard assertion sonrasi");//hard assertion sonrasi program kirildigi icin  bu kod satiri calismaz
    }
    @Test
    public void soft(){
        //soft assertion -verification-dogrulama; testler failed olunca execution devam eder
        SoftAssert sa = new SoftAssert();
        System.out.println("checking 1=2");
        sa.assertEquals(1,2);//failed oldu ancak altini cizmedi..
        System.out.println("checking 1=1");
        sa.assertEquals(1,1);//passed
        sa.assertAll(); // kullanmazsak tum assertionlar bos yere yazilmis olur,
        // bu method butun assretleri isleme koyar
        // herhangi bir failed varsa altini sari cizer
        System.out.println("bu yazi konsolda cikacak mi ?");//bu yazi cikmaz ..
        //soft assert hata bulsa bile calismaya devam eder, bu devam etme ozelligi assertAll() 'a kadardir.
    }

}
