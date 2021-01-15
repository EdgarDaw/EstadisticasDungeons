/**
 * Paquete que englobará todas las clases de creación de estadísticas de personajes.
 *@author Edgar Sánchez Pineda
 *@version 1.0 Alpha
 * 
 */
package estadisticasdungeons;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase para lanzar y almacenar dados de características según mis propias reglas caseras de Dungeons and Dragons v3.5 y Pathfinder v1.0, sistema d20.
 * La clase inicializa 6 variables de tipo entero con un nombre asignado según su característica. También crea un objeto de tipo Scanner y otro de tipo Random para las tiradas.
 * Tiene muchas limitaciones, como no poder personalizar la asignación de tiradas o elegir entre varios tipos de reglas. Mejorable.
 * Probablemente tiene fallos de programación lógicos de novato.
 * Ningún método recoge excepciones.
 * 
 * @author Edgar Sánchez Pineda
 * @version 1.0 Alpha
 * @since 1.0
 */
public class TiradaDadosCaracteristicas {

    private int fuerza;
    private int destreza;
    private int constitucion;
    private int inteligencia;
    private int sabiduria;
    private int carisma;
    private static Random r = new Random();
    private static Scanner s = new Scanner(System.in);
/**
 * Constructor por defecto.
 * No inicializa ninguna variable.
 * 
 * @since 1.0
 */
    public TiradaDadosCaracteristicas() {

    }
    
    /**
     * Método tirarDados() que realiza las tiradas y las imprime por pantalla.
     * Está incrustado en un bucle para permitir la repetición.
     * Se compone de la tirada de 3 dados de 6 caras + 3. La puntuación mínima es de 3, la máxima de 21.
     * 
     * @since 1.0
     */

    public void tirarDados() {
        System.out.println("¿Realizar tiradas? Introduce cualquier número entero para realizar tiradas, o un 0 para salir");

        byte aux = s.nextByte();

        while (aux != 0) {

            fuerza = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;

                System.out.println("Fuerza = " + fuerza);

            destreza = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;

                System.out.println("Destreza = " + destreza);

            constitucion = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;

                System.out.println("Constitución = " + constitucion);

            inteligencia = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;
            
                System.out.println("Inteligencia = " + inteligencia);

            sabiduria = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;

                System.out.println("Sabiduría = " + sabiduria);

            carisma = (r.nextInt(7) + r.nextInt(7) + r.nextInt(7)) + 3;

                System.out.println("Carisma = " + carisma);

                
                    System.out.println("¿Repetir tiradas? Introduce 1 para repetir tiradas, o un 0 para salir");

                        aux = s.nextByte();
        }
            System.out.println("Fin del programa.");
    }
}
