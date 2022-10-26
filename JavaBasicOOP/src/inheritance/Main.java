package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(0, 1, 2, 3);

        Dog dog = new Dog(0, 1, 2, 3, 4, 5, 6, 15, "Caki");

        dog.eat();
        dog.run();

        //dog.walk();

    }


}
