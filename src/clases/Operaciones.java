package clases;

/**
 * La clase Operaciones permite realizar operaciones matemáticas básicas
 * (suma, resta, multiplicación, división) y obtener el valor máximo o mínimo
 * entre dos números.
 * 
 * @author fatima.roman
 */
public class Operaciones {

    /** Primer número para realizar operaciones */
    double num1;

    /** Segundo número para realizar operaciones */
    double num2;

    /**
     * Constructor por defecto.
     * Crea una instancia de Operaciones con num1 y num2 igual a 0.
     */
    public Operaciones() {
    }

    /**
     * Constructor que inicializa los dos números sobre los que se realizarán
     * las operaciones.
     * 
     * @param num1 Primer número.
     * @param num2 Segundo número.
     */
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Calcula la suma de ambos num..
     * 
     * @return La suma de los dos números.
     */
    public double suma() {
        return num1 + num2;
    }

    /**
     * Calcula la resta de ambos num.
     * 
     * @return La resta de los dos números.
     */
    public double resta() {
        return num1 - num2;
    }

    /**
     * Calcula la multiplicación de ambos num.
     * 
     * @return El producto de los dos números.
     */
    public double multiplicacion() {
        return num1 * num2;
    }

    /**
     * Calcula la división de ambos num
     * 
     * @return El resultado de la división, o 0 si es 0.
     */
    public double division() {
        double res = 0;
        if (num2 != 0) {
            res = num1 / num2;
        } 
        return res;
    }

    /**
     * Devuelve el número mayor entre ambos num.
     * 
     * @return El número mayor de los dos.
     */
    public double max() {
        return num1 > num2 ? num1 : num2;
    }

    /**
     * Devuelve el número menor entre ambos num.
     * 
     * @return El número menor de los dos.
     */
    public double min() {
        return num1 < num2 ? num1 : num2;
    }
}

