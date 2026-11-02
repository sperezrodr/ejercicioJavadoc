package gestionPersonas;


/**
 * Representa una persona con nombre y edad
 *
 * @author Sandra
 */

public class Persona {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Persona
     * 
     * @param nombre Nombre de la persona con un string
     * @param edad Edad de la persona con un entero 
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método getter para obtener el nombre de la persona
     * @return devuelve nombre en formato string
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para poner el nombre de la persona
     * @param nombre Nombre de la persona en formato string
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la edad de la persona
     * @return devuelve edad en formato int
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método setter para poner la edad de la persona
     * @param edad Edad de la persona en formato int
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que muestra el nombre y la edad de la persona por pantalla
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
