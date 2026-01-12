package clases;

import java.util.Random;

/**
 * La clase Tesoro representa un juego sencillo de tablero donde un
 * jugador se mueve para encontrar un tesoro escondido.
 * @author fatima.roman
 * 
 */
public class Tesoro {

    /** Tamaño del tablero (cuadrado) */
    public static final int TAM_TABLERO = 5;

    /** Posición X del tesoro (fila) */
    static int xTesoro;

    /** Posición Y del tesoro (columna) */
    static int yTesoro;

    /** Posición X del jugador (fila), comienza en 1 */
    int xJugador = 1;

    /** Posición Y del jugador (columna), comienza en 1 */
    int yJugador = 1;

    /**
     * Genera una posición aleatoria para el tesoro dentro del tablero.
     * La posición X y Y estará en el rango.
     */
    static void generaPosicionTesoro() {
        Random rand = new Random();
        xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
        yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
    }

    /**
     * Muestra en consola el tablero con números de fila y columna. 
     * Coloca la ficha del jugador "J" en su posición actual.
     */
    void pintaTablero() {
        // Imprimimos la primera línea de números (columnas)
        for (int i = 1; i <= TAM_TABLERO; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();

        // Imprimimos cada fila del tablero
        for (int i = 1; i <= TAM_TABLERO; i++) {
            System.out.print(i); // Número de fila
            if (xJugador == i) {
                for (int j = 1; j <= yJugador; j++) {
                    System.out.print("\t");
                }
                System.out.print("J"); // Ficha del jugador
            }
            System.out.println();
        }
    }

    /**
     * Mueve al jugador en la dirección indicada.
     * 
     * @param movimiento Dirección del movimiento: "arriba", "abajo", "izquierda" o "derecha"
     * @return -2 si el movimiento es inválido, -1 si se intenta mover fuera del tablero,
     *         0 si el movimiento es correcto.
     */
    int mueveJugador(String movimiento) {
        int res = 0;
        String movMinuscula = movimiento.toLowerCase();

        switch (movMinuscula) {
            case "arriba":
                if (xJugador - 1 < 1) {
                    res = -1;
                } else {
                    xJugador--;
                }
                break;
            case "abajo":
                if (xJugador + 1 > TAM_TABLERO) {
                    res = -1;
                } else {
                    xJugador++;
                }
                break;
            case "izquierda":
                if (yJugador - 1 < 1) {
                    res = -1;
                } else {
                    yJugador--;
                }
                break;
            case "derecha":
                if (yJugador + 1 > TAM_TABLERO) {
                    res = -1;
                } else {
                    yJugador++;
                }
                break;
            default:
                res = -2;
                break;
        }
        return res;
    }

    /**
     * Comprueba si el jugador se encuentra en la misma posición que el tesoro.
     * 
     * @return Comprueba si el jugador encontró el tesoro,false en caso contrario.
     */
    boolean buscaTesoro() {
        return xTesoro == xJugador && yTesoro == yJugador;
    }
}
