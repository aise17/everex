package DAL;

import DBConnection.MySQLConnection;
import Modelos.db.Profesor;
import Modelos.db.Trimestre;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class TrimestreRepository {

    MySQLConnection connection = new MySQLConnection();


    public TrimestreRepository() {
        connection.Connect();
    }


    public ResultSet getById(Trimestre trimestre) {

        try {
            String consulta = "SELECT * FORM trimestres where ID = " + trimestre.getID();

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return result;

        }catch (SQLException e){
            return null;
        }


    }

    public ResultSet getAll(){
        try{
            String consulta = "SELECT * FROM trimestres";

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return  result;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }



    public boolean insert(Trimestre trimestre){
        try{

            String consulta = "INSERT INTO trimestres (ID, nombre) value (?, ?)";

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.valueOf(String.valueOf(UUID.randomUUID())));
            preparedStatement.setString(2, trimestre.getNombre());

            boolean is = preparedStatement.execute();

            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public int Update(Trimestre trimestre){
        try{

            String consulta = "UPDATE examenes set nombre = ?" +
                    "where ID = ?" ;


            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta);
            preparedStatement.setString(1, trimestre.getNombre());
                preparedStatement.setInt(2, trimestre.getID());



            int filas_afectadas = preparedStatement.executeUpdate();

            return filas_afectadas;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public boolean delete(Trimestre trimestre){
        try{

            String conslta = "delete to profesores where ID = " + trimestre.getID();

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(conslta);

            boolean is = preparedStatement.execute();
            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }






}
