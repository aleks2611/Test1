package inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(5, 1, 2, 3);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;


    }


    private void rest() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(50);
    }

    private void moveBackFin() {
    }

    private void moveMuscles() {
    }
}
