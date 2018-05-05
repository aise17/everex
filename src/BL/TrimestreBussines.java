package BL;

import DAL.TrimestreRepository;
import Modelos.db.Trimestre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TrimestreBussines {

    TrimestreRepository trimestreRepository = new TrimestreRepository();

    //MAPEOS

    public Trimestre mapping_ResultSet_To_Trimestre(ResultSet resultSet) throws SQLException {

        Trimestre trimestre = new Trimestre();
        trimestre.setID(resultSet.getInt("ID"));
        trimestre.setNombre(resultSet.getString("nombre"));

        return trimestre;
    }

    public ArrayList<Trimestre> mapping_ResultSet_To_ListTrimestres(ResultSet resultSet) throws SQLException {

        ArrayList<Trimestre> listTrimestres = new ArrayList<Trimestre>();

        while (resultSet.next()) {

            Trimestre trimestre = new Trimestre();
            trimestre.setID(resultSet.getInt("ID"));
            trimestre.setNombre(resultSet.getString("nombre"));

            listTrimestres.add(trimestre);
        }
        return listTrimestres;
    }



    //INSERCCIONES

    public boolean insert(Trimestre trimestre){
        return trimestreRepository.insert(trimestre);
    }



    //ELIMINACIONES

    public boolean delete(Trimestre trimestre){
        return trimestreRepository.delete(trimestre);
    }



    //ACTUALIZACIONES

    public int Update(Trimestre trimestre){
        return trimestreRepository.Update(trimestre);
    }



    //ACCESO A DATOS

    public Trimestre getById(Trimestre trimestre){
        ResultSet resultSet = trimestreRepository.getById(trimestre);
        try {
            Trimestre trimestreResult = mapping_ResultSet_To_Trimestre(resultSet);

            return trimestre;

        } catch (SQLException e) {
            e.printStackTrace();
            Trimestre trimestreResult = null;
            return trimestreResult;
        }
    }

    public ArrayList<Trimestre> getAll(){

        ResultSet resultSet = trimestreRepository.getAll();

        try {
            ArrayList<Trimestre> trimestreResult = mapping_ResultSet_To_ListTrimestres(resultSet);

            return trimestreResult;

        } catch (SQLException e) {
            e.printStackTrace();

            ArrayList<Trimestre> trimestreResult = null;

            return trimestreResult;
        }

    }



}