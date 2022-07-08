package Lesson12_2;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public void city () {
            System.out.println(toString() + "I live in Dnipro");
        }

        @Override
        public String toString () {
            return name + ", me " + age + " age ";
        }
    }

