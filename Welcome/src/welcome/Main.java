// Declaración del paquete "welcome"
package welcome;

// Importación de las clases necesarias
import basededatos.conexion;
import controlador.ControladorAudios;
import vista.Welcome;

// Definición de la clase Main
public class Main {

    public static int Pesetas; //a esta variable pueden acceder todos los jframe

    // Método principal
    public static void main(String[] args) {

        // Carga y muestra el formulario "Welcome"
        Welcome W = new Welcome();
        W.setVisible(true);

        // Establece conexión a la base de datos
        conexion.Conectar();

        // Crea una instancia del controlador y llama al método "tengocosas"
        ControladorAudios controlador = new ControladorAudios();

        controlador.musica();
        controlador.tengocosas();

        // Cierra la conexión a la base de datos
        conexion.CerrarConexion();

    } // Fin del método principal
} // Fin de la clase Main
// Fin del programa
