package Lesson12_1;

public class Car {
    protected int year;
    protected String color;
    protected int weight;
    protected int speed;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public Car(int year, String color, int weight, int speed) {
        this.year = year;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public Car(String color, int weight, int speed) {
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public Car(int weight, int speed) {
        this.weight = weight;
        this.speed = speed;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}



