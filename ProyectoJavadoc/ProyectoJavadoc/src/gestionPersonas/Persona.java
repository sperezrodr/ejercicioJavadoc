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
     * Método getter
     * @return devuelve nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter
     * @param nombre Permite asignar valor a nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter
     * @return devuelve edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método setter
     * @param edad Permite asignar un valor a edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que muestra los valores por pantalla
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
