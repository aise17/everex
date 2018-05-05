package DAL;

import DBConnection.MySQLConnection;
import Modelos.db.Examen;
import Modelos.db.Profesor;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class ProfesorRepository {

    MySQLConnection connection = new MySQLConnection();


    public ProfesorRepository() {
        connection.Connect();
    }


    public ResultSet getById(Profesor profesor) {

        try {
            String consulta = "SELECT * FORM profesores where ID = " + profesor.getID();

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return result;

        }catch (SQLException e){
            return null;
        }


    }

    public ResultSet getAll(){
        try{
            String consulta = "SELECT * FROM profesores";

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return  result;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }



    public boolean insert(Profesor profesor){
        try{

            String consulta = "INSERT INTO profesores (ID, nombre) value (?, ?)";

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.valueOf(String.valueOf(UUID.randomUUID())));
            preparedStatement.setString(2, profesor.getNombre());

            boolean is = preparedStatement.execute();

            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public int Update(Profesor profesor){
        try{

            String consulta = "UPDATE examenes set nombre = ?" +
                    "where ID = ?" ;


            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta);
            preparedStatement.setString(1, profesor.getNombre());
            preparedStatement.setInt(2, profesor.getID());



            int filas_afectadas = preparedStatement.executeUpdate();

            return filas_afectadas;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public boolean delete(Profesor profesor){
        try{

            String conslta = "delete to profesores where ID = " + profesor.getID();

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(conslta);

            boolean is = preparedStatement.execute();
            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }






}
