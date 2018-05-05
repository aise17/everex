package BL;

import DAL.AsignaturasRepository;
import Modelos.db.Asignatura;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AsignaturaBussines {

    AsignaturasRepository asignaturasRepository = new AsignaturasRepository();

    public Asignatura mapping_ResultSet_To_Asignatura(ResultSet resultSet) throws SQLException {

        Asignatura asignatura = new Asignatura();
        asignatura.setID(resultSet.getInt("ID"));
        asignatura.setNombre(resultSet.getString("nombre"));
        asignatura.setTrimestre(resultSet.getInt("trimestre"));
        asignatura.setProfesor(resultSet.getInt("profesor"));



        return asignatura;
    }

    public ArrayList<Asignatura> mapping_ResultSet_To_ListAsignaturas(ResultSet resultSet) throws SQLException {

        ArrayList<Asignatura> listAsignaturas = new ArrayList<Asignatura>();

        while (resultSet.next()) {

            Asignatura asignatura = new Asignatura();
            asignatura.setID(resultSet.getInt("ID"));
            asignatura.setNombre(resultSet.getString("nombre"));
            asignatura.setTrimestre(resultSet.getInt("trimestre"));
            asignatura.setProfesor(resultSet.getInt("profesor"));

            listAsignaturas.add(asignatura);
        }
        return listAsignaturas;
    }



    //INSERCCIONES

    public boolean insert(Asignatura asignatura){
        return asignaturasRepository.insert(asignatura);
    }



    //ELIMINACIONES

    public boolean delete(Asignatura asignatura){
        return asignaturasRepository.delete(asignatura);
    }



    //ACTUALIZACIONES

    public int Update(Asignatura asignatura){
            return asignaturasRepository.Update(asignatura);
    }



    //ACCESO A DATOS

    public Asignatura getById(Asignatura asignatura){

        ResultSet resultSet = asignaturasRepository.getById(asignatura);

        try {
            Asignatura asignaturaResult = mapping_ResultSet_To_Asignatura(resultSet);

            return asignaturaResult;

        } catch (SQLException e) {
            e.printStackTrace();

            Asignatura asignaturaResult = null;
            return asignaturaResult;
        }
    }

    public ArrayList<Asignatura> getAll(){

        ResultSet resultSet = asignaturasRepository.getAll();

        try {
            ArrayList<Asignatura> examenResult = mapping_ResultSet_To_ListAsignaturas(resultSet);

            return examenResult;

        } catch (SQLException e) {
            e.printStackTrace();

            ArrayList<Asignatura> examenResult = null;
            return examenResult;
        }

    }




}