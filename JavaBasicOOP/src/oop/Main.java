package oop;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("audi");
        System.out.println("Model is" + "  " + porsche.getModel());


        BankAccound bankaccound = new BankAccound();
        bankaccound.withrowal(100.0);

        bankaccound.deposit(50.0);
        bankaccound.withrowal(100.00);

        bankaccound.deposit(51.0);
        bankaccound.withrowal(100.00);

    }
}