package UI.vistas.paneles.listados;

import javax.swing.*;
import java.awt.*;

public class PanelListaAsignaturas extends  JPanel{

    private JLabel tituloFormulario;

    private JTable tablaAsignaturas;
    private  JScrollPane tableScroll;



    private JButton guardar;
    private JButton limpiar;


    public void iniciar(){
        instanciarControles();
        configurarPanel();
    }

    private void instanciarControles(){

        tituloFormulario = new JLabel("Lista Asignaturas");
        tituloFormulario.setHorizontalAlignment(SwingConstants.CENTER);
        tituloFormulario.setSize(800,30);
        tituloFormulario.setFont(getFont().deriveFont(30.0f));

        //ExamenTable examenTable = new ExamenTable();

        //tablaExamenes = new JTable();
        tableScroll = new JScrollPane(tablaAsignaturas);
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

    public JTable getTablaAsignaturas() {
        return tablaAsignaturas;
    }

    public void setTablaAsignaturas(JTable tablaAsignaturas) {
        this.tablaAsignaturas = tablaAsignaturas;
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
