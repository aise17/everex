package BL;

import DAL.ProfesorRepository;
import Modelos.db.Examen;
import Modelos.db.Profesor;
import Modelos.db.Trimestre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfeosrBussines {

    ProfesorRepository profesorRepository = new ProfesorRepository();

    //MAPEOS

    public Profesor mapping_ResultSet_To_Profesor(ResultSet resultSet) throws SQLException {

        Profesor profesor = new Profesor();
        profesor.setID(resultSet.getInt("ID"));
        profesor.setNombre(resultSet.getString("nombre"));

        return profesor;
    }

    public ArrayList<Profesor> mapping_ResultSet_To_ListProfesor(ResultSet resultSet) throws SQLException {

        ArrayList<Profesor> listProfesor= new ArrayList<Profesor>();

        while (resultSet.next()) {

            Profesor profesor = new Profesor();
            profesor.setID(resultSet.getInt("ID"));
            profesor.setNombre(resultSet.getString("nombre"));

            listProfesor.add(profesor);
        }
        return listProfesor;
    }


    //INSERCCIONES

    public boolean insert(Profesor profesor){
        return profesorRepository.insert(profesor);
    }



    //ELIMINACIONES

    public boolean delete(Profesor profesor){
        return profesorRepository.delete(profesor);
    }



    //ACTUALIZACIONES

    public int Update(Profesor profesor){
        return profesorRepository.Update(profesor);
    }



    //ACCESO A DATOS

    public Profesor getById(Profesor profesor){
        ResultSet resultSet = profesorRepository.getById(profesor);
        try {
            Profesor profesorResult = mapping_ResultSet_To_Profesor(resultSet);

            return profesor;

        } catch (SQLException e) {
            e.printStackTrace();
            Profesor profesorResult = null;
            return profesorResult;
        }
    }

    public ArrayList<Profesor> getAll(){

        ResultSet resultSet = profesorRepository.getAll();

        try {
            ArrayList<Profesor> profesorResult = mapping_ResultSet_To_ListProfesor(resultSet);

            return profesorResult;

        } catch (SQLException e) {
            e.printStackTrace();

            ArrayList<Profesor> profesorResult = null;

            return profesorResult;
        }

    }


}