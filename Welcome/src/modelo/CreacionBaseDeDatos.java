package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreacionBaseDeDatos {

    public static void insertarDatos() {
        String url = "jdbc:mysql://localhost:3306/re4";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            String archivoCSV = "C:\\Users\\Emi\\Documentos\\Github\\Illocabesa\\Inventario_buhonero.csv";
            String linea = "";
            String separador = ";";
            String[] datos = new String[8];

            BufferedReader br = new BufferedReader(new FileReader(archivoCSV));

            String query = "INSERT INTO inventario_buhonero (id ,articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(query);

            while ((linea = br.readLine()) != null) {
                datos = linea.split(separador);

                statement.setString(1, datos[0]);
                statement.setString(2, datos[1]);
                statement.setString(3, datos[2]);
                statement.setString(4, datos[3]);
                statement.setString(5, datos[4]);
                statement.setString(6, datos[5]);
                statement.setString(7, datos[6]);
                statement.setString(8, datos[7]);
                statement.setString(9, datos[8]);

                statement.executeUpdate();
            }

            br.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Este metodo me elimina los registros sin tocar el csv
    public static void eliminarRegistros() {
        String url = "jdbc:mysql://localhost:3306/re4";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            String query = "DELETE FROM inventario_buhonero";

            PreparedStatement statement = conn.prepareStatement(query);

            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void eliminarRegistrosJugador() {
        String url = "jdbc:mysql://localhost:3306/re4";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            String query = "DELETE FROM inventario_jugador";

            PreparedStatement statement = conn.prepareStatement(query);

            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertarDatosJugador() {
        String url = "jdbc:mysql://localhost:3306/re4";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            String archivoCSV = "C:\\Users\\Emi\\Documentos\\Github\\Illocabesa\\Inventario_jugador.csv";
            String linea = "";
            String separador = ";";
            String[] datos = new String[8];

            BufferedReader br = new BufferedReader(new FileReader(archivoCSV));

            String query = "INSERT INTO Inventario_jugador (id ,articulo, cantidad, pesetas, descripcion, cadencia, capacidad, potencia, recarga) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(query);

            while ((linea = br.readLine()) != null) {
                datos = linea.split(separador);

                statement.setString(1, datos[0]);
                statement.setString(2, datos[1]);
                statement.setString(3, datos[2]);
                statement.setString(4, datos[3]);
                statement.setString(5, datos[4]);
                statement.setString(6, datos[5]);
                statement.setString(7, datos[6]);
                statement.setString(8, datos[7]);
                statement.setString(9, datos[8]);

                statement.executeUpdate();
            }

            br.close();
            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void eliminarRegistrosDinero() {
        String url = "jdbc:mysql://localhost:3306/re4";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conn = DriverManager.getConnection(url, usuario, contraseña);

            String query = "UPDATE dinero_jugador SET dinero = 0";

            PreparedStatement statement = conn.prepareStatement(query);

            statement.executeUpdate();

            statement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
