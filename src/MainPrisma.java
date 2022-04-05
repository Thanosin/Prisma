/**
 * Clase que representa el programa principal. Básicamente, se encarga de generar tres objetos prismas
 * distintos con valores aleatorios, gracias a los métodos de la clase prisma podemos resolver cual es
 * el área total de cada uno de estos prismas. finalmente, mostramos todos los áreas totales de los prismas
 * que se han creado y pasamos a mostrarlos ordenados de mayor a menor según su área total.
 *
 * @author Tamara Alonso Perdomo
 *
 */
public class MainPrisma {
    /**
     * Creamos tres prismas con valores aleatorios.
     *
     * @param args parámetro por defecto del main
     */
    public static void main(String[] args) {
        Prisma prisma1 = new Prisma(aleatorio(), aleatorio());
        Prisma prisma2 = new Prisma(aleatorio(), aleatorio());
        Prisma prisma3 = new Prisma(aleatorio(), aleatorio());

        resultado(prisma1, prisma2, prisma3);
        ordenar(prisma1, prisma2, prisma3);
    }
    /**
     * Mostramos la base, altura y área total de cada uno de los prismas que hemos creado.
     *
     * @param prisma1 objeto prisma que contiene un parámetro de base y otro de altura
     * @param prisma2 objeto prisma que contiene un parámetro de base y otro de altura
     * @param prisma3 objeto prisma que contiene un parámetro de base y otro de altura
     */
    private static void resultado(Prisma prisma1, Prisma prisma2, Prisma prisma3) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("CREACIÓN DE OBJETOS PRISMA");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Prisma1. Con Base: " + prisma1.getBaseTriangulo() + " y altura: " + prisma1.getAlturaPrisma());
        System.out.println("Tiene un área total de: " + prisma1.areaTotal());
        System.out.println();

        System.out.println("Prisma2. Con Base: " + prisma2.getBaseTriangulo() + " y altura: " + prisma2.getAlturaPrisma());
        System.out.println("Tiene un área total de: " + prisma2.areaTotal());
        System.out.println();

        System.out.println("Prisma3. Con Base: " + prisma3.getBaseTriangulo() + " y altura: " + prisma3.getAlturaPrisma());
        System.out.println("Tiene un área total de: " + prisma3.areaTotal());
        System.out.println();
    }
    /**
     * Método que muestra el área de cada prisma ordenado de mayor a menor.
     *
     * @param prisma1 objeto prisma que contiene un parámetro de base y otro de altura
     * @param prisma2 objeto prisma que contiene un parámetro de base y otro de altura
     * @param prisma3 objeto prisma que contiene un parámetro de base y otro de altura
     */
    private static void ordenar(Prisma prisma1, Prisma prisma2, Prisma prisma3) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("ORDENADOS DE MAYOR A MENOR");
        System.out.println("---------------------------------------------------------------------");

        if(prisma1.areaTotal()> prisma2.areaTotal() && prisma1.areaTotal()> prisma3.areaTotal()) {
            System.out.println("Prisma1: área total " + prisma1.areaTotal());
            if(prisma2.areaTotal() > prisma3.areaTotal()) {
                System.out.println("Prisma2: área total " + prisma2.areaTotal());
                System.out.println("Prisma3: área total " + prisma3.areaTotal());
            } else {
                System.out.println("Prisma3: área total " + prisma3.areaTotal());
                System.out.println("Prisma2: área total " + prisma2.areaTotal());
            }
        } else {
            if(prisma2.areaTotal() > prisma3.areaTotal()) {
                System.out.println("Prisma2: área total " + prisma2.areaTotal());
                if(prisma1.areaTotal() > prisma3.areaTotal()) {
                    System.out.println("Prisma1: área total " + prisma1.areaTotal());
                    System.out.println("Prisma3: área total " + prisma3.areaTotal());
                } else {
                    System.out.println("Prisma3: área total " + prisma3.areaTotal());
                    System.out.println("Prisma1: área total " + prisma1.areaTotal());
                }
            } else {
                System.out.println("Prisma3: area total " + prisma3.areaTotal());
                if(prisma1.areaTotal()> prisma2.areaTotal()) {
                    System.out.println("Prisma1: área total " + prisma1.areaTotal());
                    System.out.println("Prisma2: área total " + prisma2.areaTotal());
                } else {
                    System.out.println("Prisma2: área total " + prisma2.areaTotal());
                    System.out.println("Prisma1: área total " + prisma1.areaTotal());
                }
            }
        }
    }
    /**
     * Método que calcula valores aleatorios.
     *
     * @return valor aleatorio
     */
    private static float aleatorio() {
        float n2=(int)(Math.random()*100);
        return n2;
    }
}