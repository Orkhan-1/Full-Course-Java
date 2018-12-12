package org.orkhan.gasanov.java8.functional.programming;

/**
 * Created by Orkhan Gasanov on December 12, 2018
 */
public class Java8Demo {

    public static void main(String args[]) {
        Animal cat = new Cat();
        cat.makeNoise();

        Animal animal = () -> System.out.println("gav gav");
        animal.makeNoise();

        Multiplication multiplication = (int a, int b) -> a * b;

        System.out.println(multiplication.add(10,10));
    }
}