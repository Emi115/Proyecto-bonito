package controlador;

import basededatos.conexion;
import java.sql.ResultSet;

public class ControladorDeDinero {

    // Método para verificar si el dinero existe en la tabla dinero_jugador
    public boolean verificarDinero(int dinero) {
        // Establece la conexión a la base de datos
        conexion.Conectar();

        // Construye la sentencia SQL para verificar el dinero
        String sentencia = "SELECT COUNT(*) FROM dinero_jugador WHERE dinero = " + dinero;

        // Ejecuta la sentencia y obtiene el resultado
        ResultSet resultado = conexion.EjecutarSentencia(sentencia);

        try {
            // Verifica si el resultado tiene una fila
            if (resultado.next()) {
                // Obtiene el valor de la primera columna (COUNT(*))
                int cantidad = resultado.getInt(1);

                // Comprueba si el dinero existe
                if (cantidad > 0) {
                    // El dinero existe, cierra la conexión y retorna true
                    conexion.CerrarConexion();
                    return true;
                }
            }
        } catch (Exception e) {
            // Muestra un mensaje de error
            e.printStackTrace();
        } finally {
            // Cierra la conexión en caso de excepción
            conexion.CerrarConexion();
        }

        // El dinero no existe o ocurrió un error, retorna false
        return false;
    }
}
