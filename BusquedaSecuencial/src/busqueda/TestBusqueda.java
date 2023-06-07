/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class TestBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición de forma secuencial		
        Integer index = Buscar.Secuencial(datos, 11); // Busca 11
        System.out.println("Buscando 11 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
		
        index = Buscar.Secuencial(datos, 12); // Busca 12
        System.out.println("Buscando 12 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}


    

