package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgGrouping {
    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.out.println("Before class");
    }

    @Test(groups = {"cars", "suv"})
    public void testBMW6() {
        System.out.println("Runing test BMW X6");
    }

    @Test(groups = {"cars", "sedan"})
    public void Audi() {
        System.out.println("Runing test Audi A6");
    }

    @Test(groups = {"bikes"})
    public void testNinja() {
        System.out.println("Runing test for bikes");
    }

    @Test(groups = {"bikes"})
    public void testHondaCBR() {
        System.out.println("Runing test  testHondaCBR");

    }

    @AfterTest(alwaysRun = true)
    public void afterClass() {
        System.out.println("After class");
    }
}
