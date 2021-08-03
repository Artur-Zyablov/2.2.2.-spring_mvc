package web.model;

public class Car {
    private String model;
    private String color;
    private String driver ;

    public Car(String model, String color, String driver) {
        this.model = model;
        this.color = color;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
