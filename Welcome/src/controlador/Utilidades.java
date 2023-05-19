
package controlador;

import basededatos.conexion;
import javax.swing.JLabel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Utilidades {
    public static void actualizarCartel(JLabel cartel) {
        // Declaración de la variable que guardará el valor obtenido
        int dinero = 0;
        // Establecer conexión
        conexion.Conectar();

        // Consulta en la tabla dinero_jugador
        String consultaDinero = "SELECT dinero FROM dinero_jugador";
        ResultSet resultadoDinero = conexion.EjecutarSentencia(consultaDinero);
        try {
            // Obtener el valor de dinero
            if (resultadoDinero.next()) {
                dinero = resultadoDinero.getInt("dinero");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cerrar conexión
        conexion.CerrarConexion();

        // Imprimir valor de dinero
        System.out.println("Valor de dinero: " + dinero);
        String dineroString = String.valueOf(dinero);
        cartel.setText(dineroString);
    }
    
    public static void cerrarResultSet(ResultSet rs) {
    if (rs != null) {
        try {
            rs.close();
        } catch (SQLException e) {
            // manejo de la excepción
            e.printStackTrace();
        }
    }
}
}