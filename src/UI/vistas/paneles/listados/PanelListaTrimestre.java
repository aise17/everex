package UI.vistas.paneles.listados;

import Modelos.tablas.ExamenTable;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class PanelListaTrimestre extends  JPanel{

    private JLabel tituloFormulario;

    private JTable tablaTrimestres;
    private  JScrollPane tableScroll;



    private JButton guardar;
    private JButton limpiar;


    public void iniciar(){
        instanciarControles();
        configurarPanel();
    }

    private void instanciarControles(){



        tituloFormulario = new JLabel("Lista Trimestres");
        tituloFormulario.setHorizontalAlignment(SwingConstants.CENTER);
        tituloFormulario.setSize(800,30);
        tituloFormulario.setFont(getFont().deriveFont(30.0f));

        //ExamenTable examenTable = new ExamenTable();

        //tablaExamenes = new JTable();
        tableScroll = new JScrollPane(tablaTrimestres);
        tableScroll.setBounds(0,250,800,200);


        guardar = new JButton("Guardar");
        guardar.setBounds(180,320,100,20);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(380,320,100,20);


    }

    private void configurarPanel(){
        this.setLayout(null);
        this.setBackground(Color.RED);
        this.add(tituloFormulario);
        this.add(tableScroll);
        //this.add(tablaExamenes);

        this.add(guardar);
        this.add(limpiar);

    }

    public JLabel getTituloFormulario() {
        return tituloFormulario;
    }

    public void setTituloFormulario(JLabel tituloFormulario) {
        this.tituloFormulario = tituloFormulario;
    }

    public JTable getTablaTrimestres() {
        return tablaTrimestres;
    }

    public void setTablaTrimestres(JTable tablaTrimestres) {
        this.tablaTrimestres = tablaTrimestres;
    }

    public JScrollPane getTableScroll() {
        return tableScroll;
    }

    public void setTableScroll(JScrollPane tableScroll) {
        this.tableScroll = tableScroll;
    }

    public JButton getGuardar() {
        return guardar;
    }

    public void setGuardar(JButton guardar) {
        this.guardar = guardar;
    }

    public JButton getLimpiar() {
        return limpiar;
    }

    public void setLimpiar(JButton limpiar) {
        this.limpiar = limpiar;
    }
}
