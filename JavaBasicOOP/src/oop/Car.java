package oop;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engineq;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknow";

        }


    }

    public String getModel() {

        return this.model;
    }

}
