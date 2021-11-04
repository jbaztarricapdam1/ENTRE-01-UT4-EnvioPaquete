import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - 
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        //TODO
        dimension = new Dimension(40, 30, 50);
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        //TODO
        generador = new Random();
        int aleatorio = generador.nextInt(9) + 2;

        //Paquete paquete = new Paquete(()40, 30, 40, aleatorio);
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {

        Paquete paquete = new Paquete(dimension, 8.0);
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
        double volumen = dimension.getAlto() * dimension.getAncho() * dimension.getLargo();
        return volumen;

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
        double pesoVol = calcularVolumen() / 5000;
        return pesoVol;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        double pesoFac = peso / calcularPesoVolumetrico();
        return pesoFac;

    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
        
        return new Paquete(dimension.getAlto(), dimension.getAncho(), dimension.getLargo());

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        String str = "";
        str = str + String.format("Descripccion del Paquete:"); 
        str = str + String.format("Alto: " + dimension.getAlto() + "(cm)");
        str = str + String.format("Ancho: " + dimension.getAncho() + "(cm)");
        str = str + String.format("Largo: " + dimension.getLargo() + "(cm)");
        str = str + String.format("Peso real: " + peso); 
        str = str + String.format("Volumen" + calcularVolumen()); 
        str = str + String.format("Peso volumetrico: " + calcularPesoVolumetrico()); 
        return str;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

}
