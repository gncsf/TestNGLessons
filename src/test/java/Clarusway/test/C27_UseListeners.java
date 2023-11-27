package Clarusway.test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Clarusway.utilities.Listeners.class)
public class C27_UseListeners {
    //1.yöntemle Listeners classımızı Test Classımıxa bağladık
    // Classımızı run ettiğimizde raporlara ulaşırız.

    @Test
    public void successfulTest(){
        Assert.assertEquals(1,1);


    }

    @Test
    public void failedTest(){
        Assert.assertEquals(1,2);

    }

    @Test
    public void successTest(ITestContext context){
        System.out.println(context.getFailedTests().size());//1
        Assert.assertEquals(1,1);
        context.setAttribute("data",10);
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }
}
