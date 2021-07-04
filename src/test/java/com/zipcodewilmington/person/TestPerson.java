package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithEyeColor() {
        // Given
        Person person = new Person();
        String expected = "Blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithColorOfHair() {
        // Given
        Person person = new Person();
        String expected = "Blonde";

        // When
        person.setColorOfHair(expected);
        // Then
        String actual = person.getColorOfHair();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithColorOfShirt() {
        // Given
        Person person = new Person();
        String expected = "Purple";

        // When
        person.setColorOfShirt(expected);
        // Then
        String actual = person.getColorOfShirt();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAmountOfNoseHairs() {
        // Given
        Person person = new Person();
        Integer expected = 100;

        // When
        person.setAmountOfNoseHairs(expected);
        // Then
        Integer actual = person.getAmountOfNoseHairs();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithLengthOfToes() {
        // Given
        Person person = new Person();
        Integer expected = 7;

        // When
        person.setLengthOfToes(expected);
        // Then
        Integer actual = person.getLengthOfToes();
        Assert.assertEquals(expected, actual);
    }
}
