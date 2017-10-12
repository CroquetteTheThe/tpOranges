/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tporanges_test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tporanges.Orange;
import static org.junit.Assert.*;

/**
 *
 * @author dl112695
 */
public class OrangeTest {
    
    public OrangeTest() {
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
     * Test of setOrigin method, of class Orange.
     */
    @Test
    public void testSetOrigin() throws Exception {
        System.out.println("setOrigin");
        String origin = "";
        Orange instance = new Orange(1.5, origin);
        instance.setOrigin(origin);
        assert(instance.getOrigin().equals(origin));
    }
    
    @Test(expected=Exception.class)
    public void testConstructor() throws Exception {
        System.out.println("constructor");
        String origin = "";
        Orange instance = new Orange(-1, origin);
    }
                

    /**
     * Test of getOrigin method, of class Orange.
     */
    @Test
    public void testGetOrigin() throws Exception {
        System.out.println("getOrigin");
        String origin = "";
        Orange instance = new Orange(1.5, origin);
        instance.setOrigin(origin);
        assert(origin.equals(instance.getOrigin()));
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double price = 4.2;
        try {
            Orange instance = new Orange(price, "origin");
            instance.setPrix(price);
            assert(price == instance.getPrix());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double price = 4.2;
        try {
            Orange instance = new Orange(price, "origin");
            instance.setPrix(price);
            assert(price == instance.getPrix());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
