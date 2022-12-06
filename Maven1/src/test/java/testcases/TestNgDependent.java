package testcases;

import appcode.SomeClassToTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgDependent {
    SomeClassToTest obj;


    public void setUp() {
        System.out.println("Before class");

    }


    public void cleanUp() {
        System.out.println("After class");
    }

    @Test(dependsOnMethods = {"testMethod2"})
    public void testMethod1() {
        System.out.println("Test method 1");

    }

    @Test
    public void testMethod2() {
        System.out.println("Second Test");
        int result = obj.someNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3() {
        System.out.println("Third Test");
    }

    @Test(dependsOnMethods = {"testMethod3"})
    public void testMethod4() {
        System.out.println("Test method 4");

    }
}
