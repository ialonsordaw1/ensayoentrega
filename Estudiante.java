
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Estudiante
{
    private String nombre;
    private int nota;
    private String dni;
     

    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota, String dni)    {
        nombre = queNombre;
        nota = queNota;
        dni = dni; 
    }

    /**
     * 
     */
    public String getNombre() {
        return nombre;
         
    }
    
    
     /**
     * 
     */
    public int getNota() {
        return nota;
         
    }
    
    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
                "\nNota: " + nota);

    }

}
