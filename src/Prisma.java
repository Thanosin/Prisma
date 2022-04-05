/**
 * Esta es la clase Prisma que sirve para generar objetos de su mismo nombre. Esta clase incluye un
 * constructor, al que hay que pasarle dos valores, para que inicialice los objetos prismas. Además incluye
 * métodos que nos ayudan a hacer todos los cálculos necesarios para hallar la base total de un prisma. Por
 * último, también incluye varios getters y setters que nos permiten ver los valores del prisma.
 *
 * @author Thanosin
 *
 */
public class Prisma {
    float baseTriangulo;
    float alturaPrisma;

    /**
     * Constructor de la clase prisma, sirve para inicializar los objetos prisma. Sí se quiere generar un
     * prisma, es importante establecer su base y altura.
     *
     * @param baseTriangulo primer dato necesario para crear un prisma
     * @param alturaPrisma segundo datos necesario para crear un prisma
     */
    public Prisma(float baseTriangulo, float alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Método getter al que si llamas, te devuelve el valor de la base del triángulo.
     *
     * @return la base del triángulo
     */
    public float getBaseTriangulo() {
        return baseTriangulo;
    }

    /**
     * Método getter al que si llamas, te devuelve la altura del prisma.
     *
     * @return la altura del prisma
     */
    public float getAlturaPrisma() {
        return alturaPrisma;
    }

    /**
     * Calculamos la altura del triángulo
     *
     * @return devuelvo el resultado del cálculo.
     */
    public float alturaTriangulo() {
        float calculo = (float) ((Math.sqrt(3)/2)*baseTriangulo);
        return calculo;
    }

    /**
     * Calculamos el área de la base.
     *
     * @return devolvemos ese cálculo
     */
    public float areaBase() {
        return (baseTriangulo * alturaTriangulo())/2;
    }

    /**
     * Método que calcula el perímetro.
     *
     * @return devuelve el cálculo.
     */
    public float perimetro() {
        return 3 * baseTriangulo;
    }

    /**
     * Método que te calcula el área lateral.
     *
     * @return devuelve el cálculo
     */
    public float areaLateral() {
        return perimetro() * alturaPrisma;
    }

    /**
     * Método que calcula el área total
     *
     * @return devuelve el resultado a el que lo solicite
     */
    public float areaTotal() {
        return (2 * areaBase()) + areaLateral();
    }
}

