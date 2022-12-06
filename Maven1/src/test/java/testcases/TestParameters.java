package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
    @BeforeClass
    @Parameters({"browser", "platform"})
    public void setUp(String browser, String platform) {
        System.out.println("Before class");
        System.out.println(" 1. Parametar value from xml file" + browser);
        System.out.println(" 1.Parametar value from xml file" + platform);

    }

    @Test
    @Parameters({"response"})
    public void testMethod1(String response) throws InterruptedException {
        String[] stringArray = response.split(",");
        System.out.println("Test method 1");
        System.out.println("Response form xml file  " + response);
        System.out.println("Response form xml file  " + stringArray[0]);
        //System.out.println("Response form xml file  " + stringArray[1]);

    }
}
