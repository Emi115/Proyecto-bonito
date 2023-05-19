
package controlador;

import basededatos.conexion;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorTablas {
    private JTable tabla;
    private DefaultTableModel modeloTabla;

    public ControladorTablas(JTable tabla) {
        this.tabla = tabla;
        this.modeloTabla = (DefaultTableModel) tabla.getModel();
    }

    public void eliminarFilasVacias() {
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
    }
    public void limpiarTabla() {
        modeloTabla.setRowCount(0);
    }

    public void cargarInventario(String tablaBD) {
    conexion.Conectar();
    String sentencia = "SELECT * FROM " + tablaBD ;
    ResultSet resultado = conexion.EjecutarSentencia(sentencia);

    try {
        while (resultado.next()) {
            String articulo = resultado.getString("Articulo");
            int cantidad = resultado.getInt("Cantidad");
            long pesetas = resultado.getLong("Pesetas");
            String descripcion = resultado.getString("Descripcion");
            int potencia = resultado.getInt("potencia");
            int capacidad = resultado.getInt("capacidad");
            int cadencia = resultado.getInt("cadencia");
            int recarga = resultado.getInt("recarga");

            Object[] fila = {articulo, cantidad, pesetas, descripcion, potencia, capacidad, cadencia, recarga};
            modeloTabla.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
        conexion.CerrarConexion();
        }
    }
    
    
    
    public void cargarInventarioSoloArmas(String tablaBD) {
    conexion.Conectar();
    String sentencia = "SELECT * FROM " + tablaBD + " WHERE articulo IN ('red9', 'Tmp', 'Escopeta Antidisturbios', 'Rifle Francotirador', 'Lanzacohetes')";

    ResultSet resultado = conexion.EjecutarSentencia(sentencia);

    try {
        while (resultado.next()) {
            String articulo = resultado.getString("Articulo");
            int cantidad = resultado.getInt("Cantidad");
            long pesetas = resultado.getLong("Pesetas");
            String descripcion = resultado.getString("Descripcion");
            int potencia = resultado.getInt("potencia");
            int capacidad = resultado.getInt("capacidad");
            int cadencia = resultado.getInt("cadencia");
            int recarga = resultado.getInt("recarga");

            Object[] fila = {articulo, cantidad, pesetas, descripcion, potencia, capacidad, cadencia, recarga};
            modeloTabla.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
        conexion.CerrarConexion();
    }
}

}
