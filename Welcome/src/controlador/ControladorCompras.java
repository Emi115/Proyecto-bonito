package controlador;

import basededatos.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorCompras {

    public void ComprarRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next() && resultados.getInt(1) > 0) {//aqui verifico si esta la pistola o no 
                JOptionPane.showMessageDialog(null, "Ya tienes esta Pistola, no me quedan más");
            } else {
                String sentenciaInsert = "INSERT INTO inventario_jugador (id,articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) " + "VALUES ('255','Red9', 1, 20000, 'Pistola Mauser Alemana (9mm)', 3, 8, 2, 2)"; // Sentencia SQL para hacer el INSERT
                conexion.EjecutarUpdate(sentenciaInsert); // Ejecutar la sentencia de actualización
                JOptionPane.showMessageDialog(null, "La pistola Red9 se ha añadido al inventario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Red9 en el inventario.");
        }

        String sentenciaDelete = "DELETE FROM inventario_buhonero WHERE articulo = 'Red9'";
        conexion.EjecutarUpdate(sentenciaDelete); // Ejecutar la sentencia de eliminación

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void ComprarTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next() && resultados.getInt(1) > 0) {//aqui verifico si esta la pistola o no 
                JOptionPane.showMessageDialog(null, "Ya tienes esta Pistola, no me quedan más");
            } else {
                String sentenciaInsert = "INSERT INTO inventario_jugador (id,articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) " + "VALUES ('256','Tmp', 1, 30000, 'Subfusil Compacto (9mm)', 5, 30, 1, 2)"; // Sentencia SQL para hacer el INSERT
                conexion.EjecutarUpdate(sentenciaInsert); // Ejecutar la sentencia de actualización
                JOptionPane.showMessageDialog(null, "La pistola Tmp se ha añadido al inventario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Tmp en el inventario.");
        }

        String sentenciaDelete = "DELETE FROM inventario_buhonero WHERE articulo = 'Tmp'";
        conexion.EjecutarUpdate(sentenciaDelete); // Ejecutar la sentencia de eliminación

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

// Comprar Escopeta Antidisturbios
    public void ComprarEscopetaAntidisturbios() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next() && resultados.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Ya tienes esta Escopeta Antidisturbios, no me quedan más");
            } else {
                String sentenciaInsert = "INSERT INTO inventario_jugador (id, articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) "
                        + "VALUES ('257', 'Escopeta Antidisturbios', 1, 35000, 'Escopeta Pesada (Cartuchos) ', 2, 7, 6, 1)";
                conexion.EjecutarUpdate(sentenciaInsert); // Ejecutar la sentencia de actualización
                JOptionPane.showMessageDialog(null, "La Escopeta Antidisturbios se ha añadido al inventario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la Escopeta Antidisturbios en el inventario.");
        }

        String sentenciaDelete = "DELETE FROM inventario_buhonero WHERE articulo = 'Escopeta Antidisturbios'";
        conexion.EjecutarUpdate(sentenciaDelete); // Ejecutar la sentencia de eliminación

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void ComprarRifleFrancotirador() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next() && resultados.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Ya tienes este Rifle Francotirador, no me quedan más");
            } else {
                String sentenciaInsert = "INSERT INTO inventario_jugador (id, articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) "
                        + "VALUES ('258', 'Rifle Francotirador', 1, 25000, 'Rifle de francotirador (7,62mm)',1, 5, 3, 1)";
                conexion.EjecutarUpdate(sentenciaInsert); // Ejecutar la sentencia de actualización
                JOptionPane.showMessageDialog(null, "El Rifle Francotirador se ha añadido al inventario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del Rifle Francotirador en el inventario.");
        }

        String sentenciaDelete = "DELETE FROM inventario_buhonero WHERE articulo = 'Rifle Francotirador'";
        conexion.EjecutarUpdate(sentenciaDelete); // Ejecutar la sentencia de eliminación

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void ComprarLanzacohetes() {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Lanzacohetes'";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next() && resultados.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Ya tienes este Lanzacohetes, no me quedan más");
            } else {
                String sentenciaInsert = "INSERT INTO inventario_jugador (id, articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) "
                        + "VALUES ('259', 'Lanzacohetes', 1, 300000, 'Mata de un tiro', 1, 1, 1000, 0)";
                conexion.EjecutarUpdate(sentenciaInsert); // Ejecutar la sentencia de actualización
                JOptionPane.showMessageDialog(null, "El Lanzacohetes se ha añadido al inventario.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del Lanzacohetes en el inventario.");
        }

        String sentenciaDelete = "DELETE FROM inventario_buhonero WHERE articulo = 'Lanzacohetes'";
        conexion.EjecutarUpdate(sentenciaDelete); // Ejecutar la sentencia de eliminación

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public void ReducirDinero(int cantidad) {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaUpdate = "UPDATE dinero_jugador SET dinero = dinero - " + cantidad;
        conexion.EjecutarUpdate(sentenciaUpdate); // Ejecutar la sentencia de actualización

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
    }

    public boolean verificarDineroSuficiente(int cantidad) {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT dinero FROM dinero_jugador";
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect); // Ejecutar la consulta SELECT

        try {
            if (resultados.next()) {
                int dineroJugador = resultados.getInt("dinero");
                if (dineroJugador >= cantidad) {
                    return true; // El jugador tiene suficiente dinero para comprar
                } else {
                    //JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para comprar este artículo.");
                    ControladorAudios controlador = new ControladorAudios();
                    controlador.nodinero();
                    return false; // El jugador no tiene suficiente dinero para comprar
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar el dinero del jugador.");
        }

        conexion.CerrarConexion(); // Cerrar la conexión a la base de datos

        return false; // El jugador no tiene suficiente dinero para comprar
    }

    public boolean verificarExistenciaArticulo(String articulo) {
        conexion.Conectar(); // Conectar a la base de datos

        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = '" + articulo + "'";
        try (ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect)) {
            if (resultados.next() && resultados.getInt(1) > 0) {
                return true; // El jugador tiene el artículo en su inventario
            } else {
                return false; // El jugador no tiene el artículo en su inventario
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del artículo en el inventario.");
            return false; // Error al verificar, asumimos que el jugador no tiene el artículo
        } finally {
            conexion.CerrarConexion(); // Cerrar la conexión a la base de datos
        }
    }

}
