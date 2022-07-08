package Lesson12_1;

public class A_21 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 30);
        Human h2 = new Human("Tom", 20);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    }
}
class Human {
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println(name + "," + age + "," + countPeople);
    }
}

