package testcases;

import appcode.SomeClassToTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAsserts {
    @Test
    public void testSum() {
        System.out.println("\nRuning test --test sum");
        SoftAssert sa = new SoftAssert();
        System.out.println();
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.someNumbers(1, 2);


        sa.assertEquals(result, 2);
        System.out.println("\nLine after result 1");
        sa.assertEquals(result, 3);
        System.out.println("\nLine after result 2");
//        sa.assertAll();
    }
}
