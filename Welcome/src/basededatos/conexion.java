// Declaración del paquete "basededatos"
package basededatos;

// Importación de las clases necesarias
import java.sql.*;
import javax.swing.JOptionPane;

// Definición de la clase "conexion"
public class conexion {

    // Declaración de variables para la conexión a la base de datos
    static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String dbName = "re4";
    static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
    static String user = "root";
    static String pass = "";
    static String driver = "com.mysql.cj.jdbc.Driver";

    // Declaración de variables para la conexión
    static Connection conexion;
    static Statement consulta;
    static ResultSet resultado;

    // Método para establecer la conexión
    public static void Conectar() {
        try {
            // Carga el driver
            Class.forName(driver);
            // Establece la conexión
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de datos situada en :\n " + url);
            // Crea una instancia de la clase Statement
            consulta = conexion.createStatement();
        } catch (Exception e) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para ejecutar una sentencia y obtener el resultado
    public static ResultSet EjecutarSentencia(String Sentencia) {
        try {
            // Ejecuta la sentencia y guarda el resultado en la variable "resultado"
            resultado = consulta.executeQuery(Sentencia);
        } catch (Exception e) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // Retorna el resultado
        return resultado;
    }

    // Método para ejecutar una sentencia que no devuelve un resultado
    public static void EjecutarUpdate(String Sentencia) {
        try {
            // Ejecuta la sentencia
            consulta.executeUpdate(Sentencia);
            System.out.println("Done.");
        } catch (SQLException e) {
            // Muestra un mensaje de error
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Método para cerrar la conexión
    public static void CerrarConexion() {
        try {
            // Cierra la instancia de Statement
            consulta.close();
        } catch (Exception e) {
            // No hace nada
        }
    }

} // Fin de la clase "conexion"
