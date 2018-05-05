package Modelos.db;

import java.util.List;

public class Asignatura {

    private int ID;
    private String nombre;
    private  int trimestre;
    private  int profesor;

    private List<Trimestre> trimestres;
    private  List<Profesor>profesores;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public List<Trimestre> getTrimestres() {
        return trimestres;
    }

    public void setTrimestres(List<Trimestre> trimestres) {
        this.trimestres = trimestres;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
}
