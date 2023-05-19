package controlador;

import basededatos.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorTrucos {

    private boolean verificarAñadido; // Variable para verificar si el artículo ha sido añadido al inventario

    public void modificarCadenciaRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Red9" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Red9" existe en el inventario, se procede a modificar su cadencia
                String sentenciaCadencia = "UPDATE inventario_jugador SET cadencia = cadencia * 2 WHERE articulo = 'Red9'";
                conexion.EjecutarUpdate(sentenciaCadencia);

                // Mostrar un mensaje de éxito al multiplicar la cadencia al doble
                //JOptionPane.showMessageDialog(null, "¡La cadencia de la Red9 se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Red9" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Red9 en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarPotenciaRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Red9" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Red9" existe en el inventario, se procede a modificar su potencia
                String sentenciaPotencia = "UPDATE inventario_jugador SET potencia = potencia * 2 WHERE articulo = 'Red9'";
                conexion.EjecutarUpdate(sentenciaPotencia);

                // Mostrar un mensaje de éxito al multiplicar la potencia al doble
                //JOptionPane.showMessageDialog(null, "¡La potencia de la Red9 se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Red9" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Red9 en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarRecargaRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Red9" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Red9" existe en el inventario, se procede a modificar su recarga
                String sentenciaRecarga = "UPDATE inventario_jugador SET recarga = recarga * 2 WHERE articulo = 'Red9'";
                conexion.EjecutarUpdate(sentenciaRecarga);

                // Mostrar un mensaje de éxito al multiplicar la recarga al doble
                //JOptionPane.showMessageDialog(null, "¡La recarga de la Red9 se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Red9" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCapacidadRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Red9" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Red9" existe en el inventario, se procede a modificar su capacidad
                String sentenciaCapacidad = "UPDATE inventario_jugador SET capacidad = capacidad * 2 WHERE articulo = 'Red9'";
                conexion.EjecutarUpdate(sentenciaCapacidad);

                // Mostrar un mensaje de éxito al multiplicar la capacidad al doble
                //JOptionPane.showMessageDialog(null, "¡La capacidad de la Red9 se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Red9" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }
        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCadenciaTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Tmp" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Tmp" existe en el inventario, se procede a modificar su cadencia
                String sentenciaCadencia = "UPDATE inventario_jugador SET cadencia = cadencia * 2 WHERE articulo = 'Tmp'";
                conexion.EjecutarUpdate(sentenciaCadencia);

                // Mostrar un mensaje de éxito al multiplicar la cadencia al doble
                //JOptionPane.showMessageDialog(null, "¡La cadencia de la Tmp se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Tmp" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Tmp en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarPotenciaTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        ResultSet resultados = null;
        try {
            // Consulta para verificar si existe la pistola "Tmp" en el inventario del jugador
            String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";

            // Ejecutar la consulta SELECT
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Tmp" existe en el inventario, se procede a modificar su potencia
                String sentenciaPotencia = "UPDATE inventario_jugador SET potencia = potencia * 2 WHERE articulo = 'Tmp'";
                conexion.EjecutarUpdate(sentenciaPotencia);

                // Mostrar un mensaje de éxito al multiplicar la potencia al doble
                //JOptionPane.showMessageDialog(null, "¡La potencia de la Tmp se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Tmp" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Tmp en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarRecargaTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Tmp" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Tmp" existe en el inventario, se procede a modificar su recarga
                String sentenciaRecarga = "UPDATE inventario_jugador SET recarga = recarga * 2 WHERE articulo = 'Tmp'";
                conexion.EjecutarUpdate(sentenciaRecarga);

                // Mostrar un mensaje de éxito al multiplicar la recarga al doble
                //JOptionPane.showMessageDialog(null, "¡La recarga de la Tmp se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Tmp" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCapacidadTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Tmp" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Tmp" existe en el inventario, se procede a modificar su capacidad
                String sentenciaCapacidad = "UPDATE inventario_jugador SET capacidad = capacidad * 2 WHERE articulo = 'Tmp'";
                conexion.EjecutarUpdate(sentenciaCapacidad);

                // Mostrar un mensaje de éxito al multiplicar la capacidad al doble
                //JOptionPane.showMessageDialog(null, "¡La capacidad de la Tmp se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Tmp" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCadenciaRifleFrancotirador() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe el rifle "Rifle Francotirador" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si el rifle "Rifle Francotirador" existe en el inventario, se procede a modificar su cadencia
                String sentenciaCadencia = "UPDATE inventario_jugador SET cadencia = cadencia * 2 WHERE articulo = 'Rifle Francotirador'";
                conexion.EjecutarUpdate(sentenciaCadencia);

                // Mostrar un mensaje de éxito al multiplicar la cadencia al doble
                //JOptionPane.showMessageDialog(null, "¡La cadencia del Rifle Francotirador se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si el rifle "Rifle Francotirador" no está en el inventario, mostrar un mensaje indicando que debe ser comprado
                JOptionPane.showMessageDialog(null, "No lo tienes. ¡Cómpralo!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia del rifle en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del rifle Rifle Francotirador en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarPotenciaRifleFrancotirador() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe el rifle "Rifle Francotirador" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si el rifle "Rifle Francotirador" existe en el inventario, se procede a modificar su potencia
                String sentenciaPotencia = "UPDATE inventario_jugador SET potencia = potencia * 2 WHERE articulo = 'Rifle Francotirador'";
                conexion.EjecutarUpdate(sentenciaPotencia);

                // Mostrar un mensaje de éxito al multiplicar la potencia al doble
                //JOptionPane.showMessageDialog(null, "¡La potencia del Rifle Francotirador se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si el rifle "Rifle Francotirador" no está en el inventario, mostrar un mensaje indicando que debe ser comprado
                JOptionPane.showMessageDialog(null, "No lo tienes. ¡Cómpralo!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia del rifle en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del rifle Rifle Francotirador en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarRecargaRifleFrancotirador() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe el rifle "Rifle Francotirador" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si el rifle "Rifle Francotirador" existe en el inventario, se procede a modificar su recarga
                String sentenciaRecarga = "UPDATE inventario_jugador SET recarga = recarga * 2 WHERE articulo = 'Rifle Francotirador'";
                conexion.EjecutarUpdate(sentenciaRecarga);

                // Mostrar un mensaje de éxito al multiplicar la recarga al doble
                //JOptionPane.showMessageDialog(null, "¡La recarga del Rifle Francotirador se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si el rifle "Rifle Francotirador" no está en el inventario, mostrar un mensaje indicando que debe ser comprado
                JOptionPane.showMessageDialog(null, "No lo tienes. ¡Cómpralo!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia del rifle en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del rifle Rifle Francotirador en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCapacidadRifleFrancotirador() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe el rifle "Rifle Francotirador" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si el rifle "Rifle Francotirador" existe en el inventario, se procede a modificar su capacidad
                String sentenciaCapacidad = "UPDATE inventario_jugador SET capacidad = capacidad * 2 WHERE articulo = 'Rifle Francotirador'";
                conexion.EjecutarUpdate(sentenciaCapacidad);

                // Mostrar un mensaje de éxito al multiplicar la capacidad al doble
                //JOptionPane.showMessageDialog(null, "¡La capacidad del Rifle Francotirador se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si el rifle "Rifle Francotirador" no está en el inventario, mostrar un mensaje indicando que debe ser comprado
                JOptionPane.showMessageDialog(null, "No lo tienes. ¡Cómpralo!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia del rifle en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia del rifle Rifle Francotirador en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }
        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarCadenciaEscopetaAntidisturbios() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Escopeta Antidisturbios" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Escopeta Antidisturbios" existe en el inventario, se procede a modificar su cadencia
                String sentenciaCadencia = "UPDATE inventario_jugador SET cadencia = cadencia * 2 WHERE articulo = 'Escopeta Antidisturbios'";
                conexion.EjecutarUpdate(sentenciaCadencia);

                // Mostrar un mensaje de éxito al multiplicar la cadencia al doble
                //JOptionPane.showMessageDialog(null, "¡La cadencia de la Escopeta Antidisturbios se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Escopeta Antidisturbios" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Escopeta Antidisturbios en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();

    }

    public void modificarPotenciaEscopetaAntidisturbios() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Escopeta Antidisturbios" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Escopeta Antidisturbios" existe en el inventario, se procede a modificar su potencia
                String sentenciaPotencia = "UPDATE inventario_jugador SET potencia = potencia * 2 WHERE articulo = 'Escopeta Antidisturbios'";
                conexion.EjecutarUpdate(sentenciaPotencia);

                // Mostrar un mensaje de éxito al multiplicar la potencia al doble
                //JOptionPane.showMessageDialog(null, "¡La potencia de la Escopeta Antidisturbios se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Escopeta Antidisturbios" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia de la pistola Escopeta Antidisturbios en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }

        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();
    }

    public void modificarRecargaEscopetaAntidisturbios() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Escopeta Antidisturbios" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = null;
        try {
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Escopeta Antidisturbios" existe en el inventario, se procede a modificar su recarga
                String sentenciaRecarga = "UPDATE inventario_jugador SET recarga = recarga * 2 WHERE articulo = 'Escopeta Antidisturbios'";
                conexion.EjecutarUpdate(sentenciaRecarga);

                // Mostrar un mensaje de éxito al multiplicar la recarga al doble
                //JOptionPane.showMessageDialog(null, "¡La recarga de la Escopeta Antidisturbios se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Escopeta Antidisturbios" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }
        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();
    }

    public void modificarCapacidadEscopetaAntidisturbios() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Escopeta Antidisturbios" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = null;
        try {
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Escopeta Antidisturbios" existe en el inventario, se procede a modificar su capacidad
                String sentenciaCapacidad = "UPDATE inventario_jugador SET capacidad = capacidad * 2 WHERE articulo = 'Escopeta Antidisturbios'";
                conexion.EjecutarUpdate(sentenciaCapacidad);

                // Mostrar un mensaje de éxito al multiplicar la capacidad al doble
                //JOptionPane.showMessageDialog(null, "¡La capacidad de la Escopeta Antidisturbios se ha multiplicado al doble!");
                ControladorAudios controlador = new ControladorAudios();
                controlador.interactuar2();
            } else {
                // Si la pistola "Escopeta Antidisturbios" no está en el inventario, mostrar un mensaje indicando que debe ser comprada
                JOptionPane.showMessageDialog(null, "No la tienes. ¡Cómprala!");
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
        }
        // Cerrar la conexión a la base de datos
        conexion.CerrarConexion();
    }

    public boolean verificarRed9() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Red9" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Red9'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = conexion.EjecutarSentencia(sentenciaSelect);

        try {
            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Red9" está en el inventario, asignar true a una variable (por ejemplo, verificarAñadido)
                return true;
            } else {
                // Si la pistola "Red9" no está en el inventario, asignar false a verificarAñadido
                return false;
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el ResultSet utilizando el método cerrarResultSet() de la clase Utilidades
            Utilidades.cerrarResultSet(resultados);

            // Cerrar la conexión a la base de datos
            conexion.CerrarConexion();
        }
        return false;
    }

    public boolean verificarTmp() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Tmp" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Tmp'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = null;
        try {
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Tmp" está en el inventario, asignar true a una variable (por ejemplo, verificarAñadido)
                return true;
            } else {
                // Si la pistola "Tmp" no está en el inventario, asignar false a verificarAñadido
                return false;
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
            // Cerrar la conexión a la base de datos
            conexion.CerrarConexion();
        }
        return false;
    }

    public boolean verificarEscopeta() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe la pistola "Escopeta Antidisturbios" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Escopeta Antidisturbios'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = null;
        try {
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si la pistola "Escopeta Antidisturbios" está en el inventario, asignar true a una variable (por ejemplo, verificarAñadido)
                return true;
            } else {
                // Si la pistola "Escopeta Antidisturbios" no está en el inventario, asignar false a verificarAñadido
                return false;
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia de la pistola en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
            // Cerrar la conexión a la base de datos
            conexion.CerrarConexion();
        }
        return false;
    }

    public boolean verificarFranco() {
        conexion.Conectar(); // Conectar a la base de datos

        // Consulta para verificar si existe el rifle "Rifle Francotirador" en el inventario del jugador
        String sentenciaSelect = "SELECT COUNT(*) FROM inventario_jugador WHERE articulo = 'Rifle Francotirador'";

        // Ejecutar la consulta SELECT
        ResultSet resultados = null;
        try {
            resultados = conexion.EjecutarSentencia(sentenciaSelect);

            // Verificar si hay resultados y si la cantidad de registros es mayor a 0
            if (resultados.next() && resultados.getInt(1) > 0) {
                // Si el rifle "Rifle Francotirador" está en el inventario, asignar true a una variable (por ejemplo, verificarAñadido)
                return true;
            } else {
                // Si el rifle "Rifle Francotirador" no está en el inventario, asignar false a verificarAñadido
                return false;
            }
        } catch (SQLException ex) {
            // En caso de error al verificar la existencia del rifle en el inventario, mostrar mensaje de error
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al verificar la existencia en el inventario.");
        } finally {
            // Cerrar el objeto ResultSet en el bloque finally para asegurar su cierre incluso si se produce una excepción
            Utilidades.cerrarResultSet(resultados);
            // Cerrar la conexión a la base de datos
            conexion.CerrarConexion();
        }
        return false;
    }

}
