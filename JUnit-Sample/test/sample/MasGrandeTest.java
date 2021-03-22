/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.math.BigInteger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcos Gonzalez Leon
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    
    @Test
    public void testMax() {
        System.out.println(">> Testing");
        int[] a = null;
        int expResult = 0;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of max method [Cardinalidad], of class MasGrande.
     */
    
    @Test
    public void testMaxCardinalidad() {
        System.out.println(">> Testing Cardinalidad.");
        int[] a = {1,2,3,9};
        int expResult = 9;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    
    
    /**
     * Test of max method [Orden], of class MasGrande.
     */
    
    @Test
    public void testMaxOrden() {
        System.out.println(">> Testing Orden.");
        int[] a = {-2,-6,-1};
        int expResult = -1;
        int result = MasGrande.max(a);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of max method [Rango], of class MasGrande.
     */
    
    @Test
    public void testMaxRango() {
        System.out.println(">> Testing Rango.");
        int[] a = {-2147483648,-2147483645,-2147483647};
        int expResult = -2147483645;
        int result = MasGrande.max(a);
        System.out.println(">> Testing Rango EXPECTED:"+expResult);
        System.out.println(">> Testing Rango RESULT:"+result);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of max method [Referencia], of class MasGrande.
     */
    // Se pueden introducir caracteres en la comparacion (deberia(?)).
    
    @Test
    public void testMaxReferencia() {
        System.out.println(">> Testing Referencia.");
        int[] a = {'-',5,'*',','};
        int expResult = 45;
        int result = MasGrande.max(a);
        System.out.println(">> Testing Referencia EXPECTED:"+expResult);
        System.out.println(">> Testing Referencia RESULT:"+result);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of max method [Existencia], of class MasGrande.
     */ 
    
    @Test
    public void testMaxExistencia() {
        System.out.println(">> Testing Existencia.");
        int[] a = {};
        int expResult = 0;
        int result = MasGrande.max(a);
        System.out.println(">> Testing Existencia EXPECTED:"+expResult);
        System.out.println(">> Testing Existencia RESULT:"+result);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of max method [Tiempo], of class MasGrande.
     */    
    @Test (timeout=1)
    public void testMaxTiempo() {        
        System.out.println(">> Testing Tiempo.");
        int[] a = {1,2,3,4,5,6,7,8,9,1223,1123,345,4345,5456,63,1723,84,945645,107,223,390,41};
        int expResult = 945645;
        int result = MasGrande.max(a);
        System.out.println(">> Testing Tiempo EXPECTED:"+expResult);
        System.out.println(">> Testing Tiempo RESULT:"+result);
        assertEquals(expResult, result);
    }
    
    
}
