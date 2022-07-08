package Lesson12_2;

import Lesson12_2.Cat;

public class Live extends Cat {
    public Live(String name, int age) {
        super(name, age);
    }

    @Override
    public void city() {
        System.out.println(toString() + "I live in Kiew");
    }
}

