package Lesson12_3;

public class Animal {
    protected int year;
    protected String color;

    public Animal() {
    }
    @Override
    public String toString() {
        return "Animal{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
    public Animal(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Animal(int year) {
        this.year = year;
    }
    public Animal( String color) {
        this.color = color;
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
}

