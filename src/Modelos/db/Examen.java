package Modelos.db;

import java.util.Date;
import java.util.List;

public class Examen {
    private  int ID;
    private String nombre;
    private int asignatura;
    private java.sql.Date fecha_examen;
    private java.sql.Date fecha_realizado;
    private double nota;

    private List<Asignatura> asignaturas;

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

    public int getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(int asignatura) {
        this.asignatura = asignatura;
    }

    public java.sql.Date getFecha_examen() {
        return fecha_examen;
    }

    public void setFecha_examen(java.sql.Date fecha_examen) {
        this.fecha_examen = fecha_examen;
    }

    public java.sql.Date getFecha_realizado() {
        return fecha_realizado;
    }

    public void setFecha_realizado(java.sql.Date fecha_realizado) {
        this.fecha_realizado = fecha_realizado;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
