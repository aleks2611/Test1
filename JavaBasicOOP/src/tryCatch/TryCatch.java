package tryCatch;

public class TryCatch {

    public static void main(String[] args) {
        try {

            int[] array = {4, 5, 6};
            System.out.println(array[4]);

        } catch (Exception e) {
            System.out.println("An exceptions happend");


        }

    }


}
