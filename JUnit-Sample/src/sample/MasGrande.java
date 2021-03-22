/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Marcos Gonzalez Leon
 */
public class MasGrande {

    public static int max(int[] a) {
        // Vars
        int i,m;
        
        // Comprobar si A es null
        if (a == null){
            return 0;
        } else {
            // Comprobar si A esta vacio
            if (a.length==0){
                return 0;
            }
            // Entonces minimo, tiene un elemento.
            m = a[0];
        }
        
        // Calculo
        for (i = 0; i < a.length; i++) {             
            if (a[i] > m){
                m = a[i];                    
            }
        }
        return m;
        
    }

}
