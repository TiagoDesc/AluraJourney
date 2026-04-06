package OOP_Java.Temperature;

public class Temperature {

    private String local;
    private double value;

    public Temperature() {
    }

    public Temperature(String local, double value) {
        this.local = local;
        this.value = value;
    }

    public String getLocal() {
        return local;
    }

    public double getValue() {
        return value;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void limitTemperature() {
        if (value > 37.5) {
            System.out.println("The temperature is above the limit!");
        } else {
            System.out.println("The temperature is within the limit.");
        }
    }

    @Override
    public String toString() {
        return "The temperature in " + local + " is " + value + "°C";
    }
}
