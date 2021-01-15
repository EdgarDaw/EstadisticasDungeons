/**
 * Paquete que englobará todas las clases de creación de estadísticas de personajes.
 *@author Edgar Sánchez Pineda
 *@version 1.0 Alpha
 * 
 */
package estadisticasdungeons;

/**
 * Clase principal donde se irán reuniendo el resto de herramientas para realizar una ficha de personaje completa en el futuro.
 * Ningún método recoge excepciones.
 * 
 * @author Edgar Sánchez Pineda
 * @version 1.0 Alpha
 * @since 1.0
 */
public class EstadisticasDungeons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiradaDadosCaracteristicas t = new TiradaDadosCaracteristicas();
        
        t.tirarDados();
    }
    
}
