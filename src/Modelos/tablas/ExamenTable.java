package Modelos.tablas;

import Modelos.db.Examen;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

public class ExamenTable {

    private String[] columnNames = {"ID","Nombre", "Asignatura", "Fecha examen", "Fecha realizado", "nota"};
    private Object[][] data = {
            {"1", "pepe", "programacion", "12-03-2018", "12-03-2018", "9"}
    };

    private  JTable tabla;

    public ExamenTable(){
        tabla = new JTable(data,columnNames);
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public Object[][] getData() {
        return data;
    }

    public void setData(Object[][] data) {
        this.data = data;
    }
}
