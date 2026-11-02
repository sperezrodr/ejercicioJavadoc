package gestionPersonas;

/**
 * Clase principal
 * 
 * @author Sandra
 */
public class Main {
    /**
     * Método principal
     * Crea una persona, muestra sus datos y modifica su nombre y edad.
     *
     * @param args argumentos de la línea de comandos
     */

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Ana", 25);

        // Mostrar información de la persona
        persona.mostrarInformacion();

        // Cambiar el nombre y la edad
        persona.setNombre("Carlos");
        persona.setEdad(30);

        // Mostrar la nueva información de la persona
        persona.mostrarInformacion();
    }
}
