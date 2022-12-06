package testcases;


import appcode.SomeClassToTest;
import org.testng.annotations.Test;

public class TestAnotation {
    SomeClassToTest obj = new SomeClassToTest();
    int result = obj.someNumbers(1, 2);

    @Test
    public void testMethod1() {
        System.out.println("Test NG");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test NG");
    }

    @Test
    public void testMethod3() {
        System.out.println("Test NG");
    }
}
