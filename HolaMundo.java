/**
 * Muestra por pantalla la frase "¡Hola Mundo y Mas!"
 * 
 * @utor Juan Pernas
 */

public class HolaMundo {

    public static void main(String[] arg) {
        String naranja = "\033[33m";
        String azul = "\033[34m";

        System.out.println(naranja +"¡Hola Mundo y Mas!");
        System.out.println(azul + "¡Aquí estamos haciendo pruebas con Git.!");
    }
}