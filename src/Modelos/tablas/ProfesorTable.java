package Modelos.tablas;

import javax.swing.*;

public class ProfesorTable {
    private String[] nombreColumnas = {"ID","Nombre"};
    private Object[][] datos;
    private JTable tabla;


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
