package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviders {
    @DataProvider(name = "inputs")
    public Object[][] getData() {
        return new Object[][]{{"bmw","m3"}, {"audi", "a3"}, {"benz", "c300"}};
    }

    @Test
    public void testMethod1(String input1, String input2) {
        System.out.println("Input 1" + input1);
        System.out.println("Input 1" + input2);
    }
}
