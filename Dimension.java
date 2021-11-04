
/**
 *  Representa una dimensión
 *  
 *  @author - 
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return this.alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return this.ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return this.largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        return new Dimension(alto, ancho, largo);

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String str = "";
        str = str + String.format("Alto: " + alto + "(cm)");
        str = str + String.format("Ancho: " + ancho + "(cm)");
        str = str + String.format("Largo: " + largo + "(cm)");
        return str;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
