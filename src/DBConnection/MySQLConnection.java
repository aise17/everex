package DBConnection;



import javax.swing.*;
import java.sql.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class MySQLConnection {

    final String DATABASE = "evarax";
    final String SERVIDOR = "jdbc:mysql://localhost:3306/"+ DATABASE;
    final String USUARIO = "root" ;
    final String PASS = "swdzswdz";

    private Connection conexion;

    public Connection Connect(){

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexion = DriverManager.getConnection(SERVIDOR, USUARIO, PASS);

            showMessageDialog(null, "Conecion exitosa");


        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e, "Error en la conexión a la base de datos: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "Error en la conexión a la base de datos: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "Error en la conexión a la base de datos: " + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }finally {
            return conexion;
        }

    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }


}
