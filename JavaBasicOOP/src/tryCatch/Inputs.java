package tryCatch;

import java.util.Scanner;

import static java.lang.System.*;

public class Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("What is your fav number");
        try {
            int n = scanner.nextInt();
            // String aleks = scanner.toString();
            System.out.println(n);
            //System.out.println(aleks);


        } catch (Exception e) {
            out.println("Sorry please enter nummber" + e);

        }
    }
}

