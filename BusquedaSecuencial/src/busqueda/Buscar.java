/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

/**
 *
 * @author Diego
 */
public class Buscar {
    public static Integer Secuencial(Integer[] data, int valor) {
        Integer pos = null;
        for (int i = 0; i < data.length; i++) {
            if (valor == data[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
