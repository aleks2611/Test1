package testcases;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "inputs")
    public Object[][] getData() {
        return new Object[][]{{"bmw", "m3"}, {"audi", "a3"}, {"benz", "c300"}};
    }
}
