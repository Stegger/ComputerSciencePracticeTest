/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;


import org.junit.jupiter.api.*;

/**
 *
 * @author pgn
 */
public class CarTest
{

    /**
     * Test of getMaxKilometersPerHour method, of class Car.
     */
    @Test
    public void testGetMaxKilometersPerHour()
    {
        System.out.println("getMaxKilometersPerHour");
        Car instance = new Car();
        int expResult = 100;
        instance.setMaxKilometersPerHour(expResult);
        int result = instance.getMaxKilometersPerHour();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of setMaxKilometersPerHour method, of class Car.
     */
    @Test
    public void testSetMaxKilometersPerHourOne()
    {
        System.out.println("setMaxKilometersPerHour 1");
        int maxKilometersPerHour = 0;
        Car instance = new Car();
        int startVal = instance.getMaxKilometersPerHour();
        instance.setMaxKilometersPerHour(maxKilometersPerHour);
        int result = instance.getMaxKilometersPerHour();
        Assertions.assertNotEquals(maxKilometersPerHour, result);
        Assertions.assertEquals(startVal, result);
    }

    /**
     * Test of setMaxKilometersPerHour method, of class Car.
     */
    @Test
    public void testSetMaxKilometersPerHourTwo()
    {
        System.out.println("setMaxKilometersPerHour 2");
        int maxKilometersPerHour = 301;
        Car instance = new Car();
        int startVal = instance.getMaxKilometersPerHour();
        instance.setMaxKilometersPerHour(maxKilometersPerHour);
        int result = instance.getMaxKilometersPerHour();
        Assertions.assertNotEquals(maxKilometersPerHour, result);
        Assertions.assertEquals(startVal, result);
    }

    /**
     * Test of setMaxKilometersPerHour method, of class Car.
     */
    @Test
    public void testSetMaxKilometersPerHourThree()
    {
        System.out.println("setMaxKilometersPerHour 3");
        int maxKilometersPerHour = 220;
        Car instance = new Car();
        instance.setMaxKilometersPerHour(maxKilometersPerHour);
        int result = instance.getMaxKilometersPerHour();
        Assertions.assertEquals(maxKilometersPerHour, result);
    }

    /**
     * Test of getManufactor method, of class Car.
     */
    @Test
    public void testGetManufactorOne()
    {
        System.out.println("getManufactor 1");
        Car instance = new Car();
        String expResult = "Ford";
        instance.setManufactor(expResult);
        String result = instance.getManufactor();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of setManufactor method, of class Car.
     */
    @Test
    public void testSetManufactorOne()
    {
        System.out.println("setManufactor 1");
        String manufactor = "";
        Car instance = new Car();
        String expected = instance.getManufactor();
        instance.setManufactor(manufactor);
        String result = instance.getManufactor();
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test of setManufactor method, of class Car.
     */
    @Test
    public void testSetManufactorTwo()
    {
        System.out.println("setManufactor 2");
        String manufactor = null;
        Car instance = new Car();
        String expected = instance.getManufactor();
        instance.setManufactor(manufactor);
        String result = instance.getManufactor();
        Assertions.assertNotNull(result);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test of getPrice method, of class Car.
     */
    @Test
    public void testGetPrice()
    {
        System.out.println("getPrice");
        Car instance = new Car();
        double expResult = 10.0;
        instance.setPrice(expResult);
        double result = instance.getPrice();
        Assertions.assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of setPrice method, of class Car.
     */
    @Test
    public void testSetPriceTwo()
    {
        System.out.println("setPrice 2");
        Car instance = new Car();
        double expResult = instance.getPrice();
        double badPrice = -100.0;
        instance.setPrice(badPrice);
        double result = instance.getPrice();
        Assertions.assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of setPrice method, of class Car.
     */
    @Test
    public void testSetPriceOne()
    {
        System.out.println("setPrice 1");
        Car instance = new Car();
        double expResult = instance.getPrice();
        double badPrice = 0.0;
        instance.setPrice(badPrice);
        double result = instance.getPrice();
        Assertions.assertEquals(expResult, result, 0.01);
    }

}
