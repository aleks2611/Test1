package reggresionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNgClass1 extends BaseTestSuite {


    @BeforeClass
    public void beforeClass() {
        System.out.println("Base test suite-- test before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Base test suite-- test after class");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Base test suite-- test before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Base test suite-- test after suite");
    }

}
