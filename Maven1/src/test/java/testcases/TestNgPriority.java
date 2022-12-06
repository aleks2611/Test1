package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgPriority {
    @BeforeClass
    public void setUp() {
        System.out.println("Before class");

    }

    @AfterClass
    public void cleanUp() {
        System.out.println("After class");
    }

    @Test(priority=2)
    public void testMethod1() {
        System.out.println("First Test");

    }

    @Test(priority=1)
    public void testMethod2() {
        System.out.println("Second Test");
    }

    @Test(priority=0)
    public void testMethod3() {
        System.out.println("Third Test");
    }
}
