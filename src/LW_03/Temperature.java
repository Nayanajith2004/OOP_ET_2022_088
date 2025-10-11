package LW_03;

public class Temperature {
    private double celsius,fahrenheit;

    public Temperature() {
    }
//getters
    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
    //setters


    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public void tofahrenheit(){
        fahrenheit=celsius * 9 / 5 + 32;
    }
    public void tocelsius(){
        celsius= (fahrenheit - 32) * 5 / 9;
    }
}
