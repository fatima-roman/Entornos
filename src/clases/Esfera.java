package clases;

/**
 * La clase Esfera representa una esfera geométrica y permite calcular
 * su superficie y volumen a partir del radio.
 * 
 * @author fatima.roman
 * 
 */
public class Esfera {

    /** Radio de la esfera. Por defecto es 1.0 */
    double radio = 1.0;

    /**
     * Constructor por defecto de la esfera.
     * Crea una esfera con radio igual a 1.0.
     */
    public Esfera() {
        super();
    }

    /**
     * Constructor que crea una esfera con un radio específico.
     * 
     * @param radio El radio de la esfera. Debe ser un valor positivo.
     */
    public Esfera(double radio) {
        super();
        this.radio = radio;
    }

    /**
     * Calcula la superficie de la esfera usando la fórmula:
     * superficie = 4 * π * radio^2
     * 
     * @return La superficie de la esfera.
     */
    public double superficie() {
        double superficie = 4 * Math.PI * Math.pow(radio, 2);        
        return superficie;
    }

    /**
     * Calcula el volumen de la esfera usando la fórmula:
     * volumen = (4/3) * π * radio^3
     * @return El volumen de la esfera.
     */
    public double volumen() {
        double volumen = (4 * Math.PI / 3) * Math.pow(radio, 3);
        return volumen;
    }
}

