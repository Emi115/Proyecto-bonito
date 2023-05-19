package controlador;

import basededatos.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorVentas {

    public void VenderCandil() {
        conexion.Conectar(); // Conectar a la base de datos

        // Obtener la cantidad del Candil de Mariposas en el inventario del jugador
        String sentenciaSelect = "SELECT Cantidad FROM inventario_jugador WHERE articulo = 'Candil de Mariposas'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next()) {
                int cantidad = resultados.getInt("Cantidad");

                // Verificar si hay suficientes Candil de Mariposas para vender
                if (cantidad > 0) {
                    String updateDinero = "UPDATE dinero_jugador SET dinero = dinero + 20000";
                    conexion.EjecutarUpdate(updateDinero);

                    // Actualizar la cantidad del Candil de Mariposas en el inventario
                    String sentenciaCambio = "UPDATE inventario_jugador SET Cantidad = Cantidad - 1 WHERE articulo = 'Candil de Mariposas'";
                    conexion.EjecutarUpdate(sentenciaCambio); // Ejecutar la sentencia de actualización de cantidad

                    //JOptionPane.showMessageDialog(null, "Has vendido el Candil correctamente");
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.jejethankyou();

                } else {
                    // La cantidad es 0
                    JOptionPane.showMessageDialog(null, "No tienes Candil de Mariposas disponible para vender");
                }
            } else {
                // No se encontró el Candil
                JOptionPane.showMessageDialog(null, "No tienes Candil de Mariposas en tu inventario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta");
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void VenderEstatua() {
        conexion.Conectar(); // Conectar a la base de datos

        // Obtener la cantidad de la Estatua de los Castellanos en el inventario del jugador
        String sentenciaSelect = "SELECT Cantidad FROM inventario_jugador WHERE articulo = 'Estatua de los Castellanos'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next()) {
                int cantidad = resultados.getInt("Cantidad");

                // Verificar si hay suficientes Estatua de los Castellanos para vender
                if (cantidad > 0) {
                    String updateDinero = "UPDATE dinero_jugador SET dinero = dinero + 500";
                    conexion.EjecutarUpdate(updateDinero);

                    // Actualizar la cantidad de la Estatua de los Castellanos en el inventario
                    String sentenciaCambio = "UPDATE inventario_jugador SET Cantidad = Cantidad - 1 WHERE articulo = 'Estatua de los Castellanos'";
                    conexion.EjecutarUpdate(sentenciaCambio); // Ejecutar la sentencia de actualización de cantidad

                    //JOptionPane.showMessageDialog(null, "Has vendido la Estatua de los Castellanos correctamente");
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.jejethankyou();
                } else {
                    // La cantidad es 0
                    JOptionPane.showMessageDialog(null, "No tienes Estatua de los Castellanos disponible para vender");
                }
            } else {
                // No se encontró la Estatua de los Castellanos
                JOptionPane.showMessageDialog(null, "No tienes Estatua de los Castellanos en tu inventario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta");
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void VenderCaliz() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT Cantidad FROM inventario_jugador WHERE articulo = 'Cáliz de Reina'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT para obtener la cantidad del Cáliz de Reina en el inventario

        try {
            if (resultados.next()) {
                int cantidad = resultados.getInt("Cantidad");

                if (cantidad > 0) {
                    String updateDinero = "UPDATE dinero_jugador SET dinero = dinero + 25000";
                    conexion.EjecutarUpdate(updateDinero); // Actualizar el dinero del jugador sumando el valor de venta del Cáliz de Reina

                    String sentenciaCambio = "UPDATE inventario_jugador SET Cantidad = Cantidad - 1 WHERE articulo = 'Cáliz de Reina'";
                    conexion.EjecutarUpdate(sentenciaCambio); // Actualizar la cantidad del Cáliz de Reina en el inventario, restándole 1

                    //JOptionPane.showMessageDialog(null, "Has vendido el Cáliz de Reina correctamente"); // Mostrar mensaje de venta exitosa del Cáliz de Reina
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.jejethankyou();
                } else {
                    // La cantidad es 0
                    JOptionPane.showMessageDialog(null, "No tienes Cáliz de Reina disponible para vender"); // Mostrar mensaje de que no hay Cáliz de Reina disponible para vender
                }
            } else {
                // No se encontró el Cáliz de Reina
                JOptionPane.showMessageDialog(null, "No tienes Cáliz de Reina en tu inventario"); // Mostrar mensaje de que no se encontró el Cáliz de Reina en el inventario
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta"); // Mostrar mensaje de error al realizar la venta
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void VenderEmblema() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT Cantidad FROM inventario_jugador WHERE articulo = 'Emblema de los Iluminados'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT para obtener la cantidad del Emblema de los Iluminados en el inventario

        try {
            if (resultados.next()) {
                int cantidad = resultados.getInt("Cantidad");

                if (cantidad > 0) {
                    String updateDinero = "UPDATE dinero_jugador SET dinero = dinero + 50000";
                    conexion.EjecutarUpdate(updateDinero); // Actualizar el dinero del jugador sumando el valor de venta del Emblema de los Iluminados

                    String sentenciaCambio = "UPDATE inventario_jugador SET Cantidad = Cantidad - 1 WHERE articulo = 'Emblema de los Iluminados'";
                    conexion.EjecutarUpdate(sentenciaCambio); // Actualizar la cantidad del Emblema de los Iluminados en el inventario, restándole 1

                    //JOptionPane.showMessageDialog(null, "Has vendido el Emblema de los Iluminados correctamente"); // Mostrar mensaje de venta exitosa del Emblema de los Iluminados
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.jejethankyou();
                } else {
                    // La cantidad es 0
                    JOptionPane.showMessageDialog(null, "No tienes Emblema de los Iluminados disponible para vender"); // Mostrar mensaje de que no hay Emblema de los Iluminados disponible para vender
                }
            } else {
                // No se encontró el Emblema de los Iluminados
                JOptionPane.showMessageDialog(null, "No tienes Emblema de los Iluminados en tu inventario"); // Mostrar mensaje de que no se encontró el Emblema de los Iluminados en el inventario
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta"); // Mostrar mensaje de error al realizar la venta
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void VenderCorona() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT Cantidad FROM inventario_jugador WHERE articulo = 'Corona del Rey'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT para obtener la cantidad de la Corona del Rey en el inventario

        try {
            if (resultados.next()) {
                int cantidad = resultados.getInt("Cantidad");

                if (cantidad > 0) {
                    String updateDinero = "UPDATE dinero_jugador SET dinero = dinero + 300000";

                    conexion.EjecutarUpdate(updateDinero); // Actualizar el dinero del jugador sumando el valor de venta de la Corona del Rey

                    String sentenciaCambio = "UPDATE inventario_jugador SET Cantidad = Cantidad - 1 WHERE articulo = 'Corona del Rey'";
                    conexion.EjecutarUpdate(sentenciaCambio); // Actualizar la cantidad de la Corona del Rey en el inventario, restándole 1

                    //JOptionPane.showMessageDialog(null, "Has vendido la Corona del Rey correctamente"); // Mostrar mensaje de venta exitosa de la Corona del Rey
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.jejethankyou();
                } else {
                    // La cantidad es 0
                    JOptionPane.showMessageDialog(null, "No tienes Corona del Rey disponible para vender"); // Mostrar mensaje de que no hay Corona del Rey disponible para vender
                }
            } else {
                // No se encontró la Corona del Rey
                JOptionPane.showMessageDialog(null, "No tienes Corona del Rey en tu inventario"); // Mostrar mensaje de que no se encontró la Corona del Rey en el inventario
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la venta"); // Mostrar mensaje de error al realizar la venta
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos

    }

}
