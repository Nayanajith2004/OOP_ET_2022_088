package LW_03;

public class Temperature {
    private double celsius,fahrenheit;

    public Temperature() {
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit() {
        fahrenheit = celsius * 9 / 5 + 32;
    }
}
