package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {

    @BeforeClass

    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class...");

    }

    @AfterClass

    public static void setUpAfterClass() throws Exception {
        System.out.println("Executed after class...");

    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");


    }

    @After
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
