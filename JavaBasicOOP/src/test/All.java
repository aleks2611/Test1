package test;

public class All {


    public void allOne() {
        for (int i = 0; i < 5; i++) {

            if (i == 0 || i == 3) {
                continue;

            }
            System.out.println("i " + i);
            for (int j = 0; j <= 10; j++) {
                if (j >= 4 && j != 6) {
                    System.out.println("j " + j);
                }


            }
        }
    }

    void increment() {
        //scracenica je
        // a =+ 3;
        int a = 5;
        a = a + 3;


    }
}
