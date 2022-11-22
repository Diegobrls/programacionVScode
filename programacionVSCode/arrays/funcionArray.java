package arrays;
/**
 * 
 * funcionesArray
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) 
 * de números enteros que contenga las siguientes funciones
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 17/11/2022
 */

public class funcionArray {

    //Genera un array de tamaño n con números aleatorios cuyo intervalo 
    //(mínimo y máximo) se indica como parámetro.
    //
    //@param n, tamañp del array
    //@param x, minimo numero aleatorio
    //@param y, maximo numero aleatorio
    //@return array de tamaño n y numeros aletorios
    public static int[] generaArrayInt(int n, int x, int y) {
        int[] array = new int[n];
        for (int i=0; i < n; i++) {
            array[i]=(x-1) + (int)((Math.random()*((y - x)+1)+1)); //resto uno al punto de partida para que esté incluido el minimo,
            // y luego sumo 2 para que entre el máximo
        }
        return array;
    }

    //Devuelve el mínimo del array que se pasa como parámetro.
    //
    //@param x, array del que se averigua el minimo
    //@return el minimo del array

    public static int minimoArrayInt(int[] x) {
        
        int minimo = Integer.MAX_VALUE;
    
        for (int n : x) {
            if (n < minimo) {
                minimo = n;
            }
        }
        return n;
    }
}
