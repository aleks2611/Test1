package inheritance;

public class Animal {

    public Animal(int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int brain;
    private int body;
    private int size;
    private int weight;

    //methos
    public void eat() {
        System.out.println("Animal eat");
    }

    public void move(int speed) {
        System.out.println("Animal move" + speed);
    }


}
