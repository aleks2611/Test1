package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Junit {

    @BeforeClass

    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class...");

    }

    @AfterClass

    public static void setUpAfterClass() throws Exception {
        System.out.println("Executed after class...");

    }

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("Before");


    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void test() {
        System.out.println("Test");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }
}
