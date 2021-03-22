/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcos Gonzalez Leon
 */
public class VectorsTest {
    
    public VectorsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Testing. Se ejecuta una unica vez y antes inicializar cualquier clase.
        System.out.println("* UtilsTest: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Testing. Se ejecuta una unica vez y al finalizar las pruebas de testing.
        System.out.println("* UtilsTest: @AfterClass method");
    }
    
    @Before
    public void setUp() {
        // Testing. Se ejecuta antes de cada metodo.
        System.out.println("* UtilsTest: @Before method");
    }
    
    @After
    public void tearDown() {
        // Testing. Se ejecuta despues de cada metodo.
        System.out.println("* UtilsTest: @After method");
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void equalsCheck() {
        System.out.println("* VectorsTest: equalsCheck()");

        // Testing. Metodo Equals de Vectors.
        
        assertTrue(Vectors.equal(new int[] {}, new int[] {}));
        assertTrue(Vectors.equal(new int[] {0}, new int[] {0}));
        assertTrue(Vectors.equal(new int[] {0, 0}, new int[] {0, 0}));
        assertTrue(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 0}));
        assertTrue(Vectors.equal(new int[] {5, 6, 7}, new int[] {5, 6, 7}));
        
        assertFalse(Vectors.equal(new int[] {}, new int[] {0}));
        assertFalse(Vectors.equal(new int[] {0}, new int[] {0, 0}));
        assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0, 0, 0}));
        assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0}));
        assertFalse(Vectors.equal(new int[] {0, 0}, new int[] {0}));
        assertFalse(Vectors.equal(new int[] {0}, new int[] {}));
        assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 0, 1}));
        assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {0, 1, 0}));
        assertFalse(Vectors.equal(new int[] {0, 0, 0}, new int[] {1, 0, 0}));
        assertFalse(Vectors.equal(new int[] {0, 0, 1}, new int[] {0, 0, 3}));
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void ScalarMultiplicationCheck() {
        System.out.println("* VectorsTest: ScalarMultiplicationCheck()");
        //assertEquals(expResult, result);
        
        // Testing, Multiplicacion de Vectores
        assertEquals( 0, Vectors.scalarMultiplication(new int[] { 0, 0}, new int[] { 0, 0}));
        assertEquals( 39, Vectors.scalarMultiplication(new int[] { 3, 4}, new int[] { 5, 6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[] {-3, 4}, new int[] { 5,-6}));
        assertEquals( 0, Vectors.scalarMultiplication(new int[] { 5, 9}, new int[] {-9, 5}));
        assertEquals(100, Vectors.scalarMultiplication(new int[] { 6, 8}, new int[] { 6, 8}));

    }
    

    
}
