package LW_05_Q2;

public abstract class Person {
    private String name;
    public abstract void displayinfo();

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
