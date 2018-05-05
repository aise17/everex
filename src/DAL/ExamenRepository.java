package DAL;

import DBConnection.MySQLConnection;
import Modelos.db.Examen;

import javax.swing.*;
import java.sql.*;
import java.util.UUID;

public class ExamenRepository {

    MySQLConnection connection = new MySQLConnection();


    public ExamenRepository() {
        connection.Connect();
    }

    public ResultSet getById(Examen examen) {

        try {
            String consulta = "SELECT * FORM examenes where ID = " + examen.getID();

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return result;

        }catch (SQLException e){
            return null;
        }


    }

    public ResultSet getAll(){
        try{
            String consulta = "SELECT * FROM examenes";

            Statement statement = connection.getConexion().createStatement();

            ResultSet result = statement.executeQuery(consulta);

            return  result;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public boolean insert(Examen examen){
        try{

            String consulta = "INSERT INTO examen (IdExamen, nombre, asignatura, fecha_examen, fecha_realizado, nota) " +
                              "value (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, Integer.valueOf(String.valueOf(UUID.randomUUID())));
            preparedStatement.setString(2, examen.getNombre());
            preparedStatement.setInt(3, examen.getAsignatura());
            preparedStatement.setDate(4, examen.getFecha_examen());
            preparedStatement.setDate(5, examen.getFecha_realizado());
            preparedStatement.setDouble(6,examen.getNota());

            boolean is = preparedStatement.execute();

            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public int Update(Examen examen){
        try{

            String consulta = "UPDATE examenes set nombre = ?,asignatura = ?, fecha_examen = ?, fecha_realizado = ?, nota = ?" +
                              "where ID = ?" ;


            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(consulta);
            preparedStatement.setString(1, examen.getNombre());
            preparedStatement.setInt(2, examen.getAsignatura());
            preparedStatement.setDate(3, examen.getFecha_examen());
            preparedStatement.setDate(4, examen.getFecha_realizado());
            preparedStatement.setDouble(5,examen.getNota());
            preparedStatement.setInt(6, examen.getID());


            int filas_afectadas = preparedStatement.executeUpdate();

            return filas_afectadas;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public boolean delete(Examen examen){
        try{

            String conslta = "delete to examen where ID = " + examen.getID();

            PreparedStatement preparedStatement = connection.getConexion().prepareStatement(conslta);

            boolean is = preparedStatement.execute();
            return is;

        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "fallo en la conexion","Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }



}
