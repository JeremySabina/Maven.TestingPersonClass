package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private int amountOfNoseHairs;
    private int lengthOfToes;
    private String colorOfShirt;
    private String colorOfHair;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setAmountOfNoseHairs(int amountOfNoseHairs) {
        this.amountOfNoseHairs = amountOfNoseHairs;
    }

    public void setLengthOfToes(int lengthOfToes) {
        this.lengthOfToes = lengthOfToes;
    }

    public void setColorOfShirt(String colorOfShirt) {
        this.colorOfShirt = colorOfShirt;
    }

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public Person(String name, int age, String eyeColor, Integer amountOfNoseHairs, String colorOfHair,
                  String colorOfShirt, int lengthOfToes) {

        this.name = name;
        this.age = age;
        this.colorOfShirt = colorOfShirt;
        this.amountOfNoseHairs = amountOfNoseHairs;
        this.eyeColor = eyeColor;
        this.colorOfHair = colorOfHair;
        this.lengthOfToes = lengthOfToes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() { return eyeColor; }

    public Integer getAmountOfNoseHairs() { return amountOfNoseHairs; }

    public Integer getLengthOfToes() { return lengthOfToes; }

    public Person(String name, int age, String eyeColor, int amountOfNoseHairs, int lengthOfToes, String colorOfShirt, String colorOfHair) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.amountOfNoseHairs = amountOfNoseHairs;
        this.lengthOfToes = lengthOfToes;
        this.colorOfShirt = colorOfShirt;
        this.colorOfHair = colorOfHair;
    }

    public String getColorOfHair() {
        return colorOfHair;
    }

    public String getColorOfShirt() { return colorOfShirt; }
}
