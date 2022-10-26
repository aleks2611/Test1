package inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(0, 1, 2, 3);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("This is chew");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walk is called");
        move(5);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog move legs");
    }

    //@Override
    //public void move(int speed) {
    //      System.out.println("Dove called over1ide");
    //    super.move(speed);
//}

    public void run() {
        System.out.println("Dog.run called");
        move(10);
    }


}

