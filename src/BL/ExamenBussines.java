package BL;

import DAL.ExamenRepository;
import Modelos.db.Examen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExamenBussines {

    ExamenRepository examenRepository = new ExamenRepository();

    public Examen mapping_ResultSet_To_Examen(ResultSet resultSet) throws SQLException {

        Examen examen = new Examen();
        examen.setID(resultSet.getInt("ID"));
        examen.setNombre(resultSet.getString("nombre"));
        examen.setAsignatura(resultSet.getInt("ID"));
        examen.setFecha_examen(resultSet.getDate("fecha_examen"));
        examen.setFecha_realizado(resultSet.getDate("fecha_realizado"));
        examen.setNota(resultSet.getDouble("nota"));

        return examen;
    }

    public ArrayList<Examen> mapping_ResultSet_To_ListExamenes(ResultSet resultSet) throws SQLException {

        ArrayList<Examen> listExamen = new ArrayList<Examen>();

        while (resultSet.next()) {

            Examen examen = new Examen();
            examen.setID(resultSet.getInt("ID"));
            examen.setNombre(resultSet.getString("nombre"));
            examen.setAsignatura(resultSet.getInt("ID"));
            examen.setFecha_examen(resultSet.getDate("fecha_examen"));
            examen.setFecha_realizado(resultSet.getDate("fecha_realizado"));
            examen.setNota(resultSet.getDouble("nota"));
            listExamen.add(examen);
        }
        return listExamen;
    }

    //INSERCCIONES

    public boolean insert(Examen examen){
        return examenRepository.insert(examen);
    }



    //ELIMINACIONES

    public boolean delete(Examen examen){
        return examenRepository.delete(examen);
    }



    //ACTUALIZACIONES

    public int Update(Examen examen){
        return examenRepository.Update(examen);
    }



    //ACCESO A DATOS

    public Examen getById(Examen examen){

        ResultSet resultSet = examenRepository.getById(examen);

        try {
            Examen examenResult = mapping_ResultSet_To_Examen(resultSet);

            return examenResult;

        } catch (SQLException e) {
            e.printStackTrace();
            Examen examenResult = null;
            return examenResult;
        }
    }

    public ArrayList<Examen> getAll(){

        ResultSet resultSet = examenRepository.getAll();

        try {
            ArrayList<Examen> examenResult = mapping_ResultSet_To_ListExamenes(resultSet);

            return examenResult;

        } catch (SQLException e) {
            e.printStackTrace();

            ArrayList<Examen> examenResult = null;

            return examenResult;
        }

    }




}