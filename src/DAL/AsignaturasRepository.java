package DAL;

import DBConnection.MySQLConnection;
import Modelos.db.Asignatura;
import Modelos.db.Examen;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class AsignaturasRepository {

    MySQLConnection connection = new MySQLConnection();


    public AsignaturasRepository() {
        connection.Connect();
    }




    public ResultSet getById(Asignatura asignatura) {

        try {
            String consulta = "SELECT * FORM asignaturas where ID = " + asignatura.getID();

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return result;

        }catch (SQLException e){
            return null;
        }


    }

    public ResultSet getAll(){
        try{
            String consulta = "SELECT * FROM asignaturas";

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return  result;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }



    public boolean insert(Asignatura asignatura){
        try{

            String consulta = "INSERT INTO examen (ID, nombre, trimestre, profesor) " +
                              "value (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.valueOf(String.valueOf(UUID.randomUUID())));
            preparedStatement.setString(2, asignatura.getNombre());
            preparedStatement.setInt(3, asignatura.getTrimestre());
            preparedStatement.setInt(4, asignatura.getProfesor());

            boolean is = preparedStatement.execute();

            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public int Update(Asignatura asignatura){
        try{

            String consulta = "UPDATE examenes set nombre = ?, trimestre = ?, profesor = ?" +
                              "where ID = ?" ;


            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta);
            preparedStatement.setString(1, asignatura.getNombre());
            preparedStatement.setInt(2, asignatura.getTrimestre());
            preparedStatement.setInt(3, asignatura.getProfesor());
            preparedStatement.setInt(4, asignatura.getID());

            int filas_afectadas = preparedStatement.executeUpdate();

            return filas_afectadas;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public boolean delete(Asignatura asignatura){
        try{

            String conslta = "delete to examen where ID = " + asignatura.getID();

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(conslta);

            boolean is = preparedStatement.execute();
            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }






}
