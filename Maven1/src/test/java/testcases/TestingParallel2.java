package testcases;

import org.testng.annotations.Test;

public class TestingParallel2 {
    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("TestNG_Parallel2 -> testMethod2");
   //     Thread.sleep(6000);
        System.out.println("TestNG_Parallel2 -> testMethod2 -> More Steps");
    }

    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_Parallel2 -> testMethod2");
    //    Thread.sleep(6000);
        System.out.println("TestNG_Parallel2 -> testMethod2 -> More Steps");
    }
}

