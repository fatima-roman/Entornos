package clases;

import java.util.Random;

/**
 * La clase Aleatorio proporciona métodos estáticos para generar
 * números aleatorios. Permite generar números aleatorios de tipo double
 * entre 0 y 1, así como números enteros dentro de un rango específico.
 * 
 * @author fatima.roman
 * 
 */
public class Aleatorios {

    /**
     * Genera y muestra en consola una cantidad específica de números aleatorios
     * de tipo {@code double} entre 0 (inclusive) y 1 (exclusive).
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     */
    public static void numerosAletorios(int cantidad) {
        double aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = Math.random();
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera y muestra en consola una cantidad específica de números aleatorios
     * de tipo {@code int} entre 0 (inclusive) y {@code max} (exclusive).
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param max El valor máximo (no incluido) de los números generados.
     */
    public static void numerosAleatorios(int cantidad, int max) {
        int aleatorio;

        for (int i = 1; i <= cantidad; i++) {
            aleatorio = (int) (Math.random() * max);
            System.out.println(aleatorio);
        }
    }

    /**
     * Genera y muestra en consola una cantidad específica de números aleatorios.
     * 
     * @param cantidad La cantidad de números aleatorios a generar.
     * @param minimo El valor mínimo (incluido) de los números generados.
     * @param maximo El valor máximo (incluido) de los números generados.
     */
    public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
        int aleatorio;
        Random rand = new Random();
        for (int i = 1; i <= cantidad; i++) {
            aleatorio = rand.nextInt(minimo, maximo + 1);
            System.out.println(aleatorio);
        }
    }
}

