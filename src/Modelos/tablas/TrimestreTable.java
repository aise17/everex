package Modelos.tablas;

import Modelos.db.Trimestre;

import javax.swing.*;
import java.util.List;

public class TrimestreTable {

    private String[] nombreColumnas = {"ID","Nombre"};
    private Object[][] datos = {
            {"1", "primer trimestre"}
    };


    public Object[][] add(Trimestre trimestre){
        Object[][] newObject = new Object[2][datos.length+1];
        return newObject;
    }




    private JTable tabla;

    public TrimestreTable(Object[][] datos,String[] nombreColumnas){
        tabla = new JTable(datos,nombreColumnas);
    }

    public TrimestreTable(Object[][] datos){
        tabla = new JTable(datos,nombreColumnas);
    }

    public TrimestreTable(){
        tabla = new JTable(datos,nombreColumnas);
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public String[] getNombreColumnas() {
        return nombreColumnas;
    }

    public void setNombreColumnas(String[] nombreColumnas) {
        this.nombreColumnas = nombreColumnas;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }
}
