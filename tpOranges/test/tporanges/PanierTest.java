/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dl112695
 */
public class PanierTest {
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = new Panier();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrange method, of class Panier.
     */
    @Test
    public void testAddOrange() throws Exception {
        System.out.println("addOrange");
        Orange o = null;
        Panier instance = new Panier();
        instance.addOrange(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class Panier.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        Panier instance = new Panier();
        instance.removeLast();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Panier.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class Panier.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Panier instance = new Panier();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Panier.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Panier instance = new Panier();
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boycottOrigin method, of class Panier.
     */
    @Test
    public void testBoycottOrigin() {
        System.out.println("boycottOrigin");
        String origin = "";
        Panier instance = new Panier();
        instance.boycottOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
