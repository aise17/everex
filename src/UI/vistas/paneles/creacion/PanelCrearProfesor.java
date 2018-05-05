package UI.vistas.paneles.creacion;

import javax.swing.*;
import java.awt.*;

public class PanelCrearProfesor extends JPanel {

    private JLabel tituloFormulario;

    private JLabel nombreLabel;
    private JTextField nombreText;

    private JButton guardar;
    private JButton limpiar;


    public void iniciar(){
        instanciarControles();
        configurarPanel();
    }

    private void instanciarControles(){

        tituloFormulario = new JLabel("Crear Profesor");
        tituloFormulario.setBounds(220,50,255,30);
        tituloFormulario.setFont(getFont().deriveFont(30.0f));

        nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(150,150,80,20);

        nombreText = new JTextField();
        nombreText.setBounds(290,150,255,20);


        guardar = new JButton("Guardar");
        guardar.setBounds(180,320,100,20);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(380,320,100,20);


    }

    private void configurarPanel(){
        this.setLayout(null);
        this.setBackground(Color.RED);
        this.add(tituloFormulario);
        this.add(nombreLabel);
        this.add(nombreText);

        this.add(guardar);
        this.add(limpiar);

    }
    //GETTER AND SETTERS


    public JLabel getTituloFormulario() {
        return tituloFormulario;
    }

    public void setTituloFormulario(JLabel tituloFormulario) {
        this.tituloFormulario = tituloFormulario;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public void setNombreLabel(JLabel nombreLabel) {
        this.nombreLabel = nombreLabel;
    }

    public JTextField getNombreText() {
        return nombreText;
    }

    public void setNombreText(JTextField nombreText) {
        this.nombreText = nombreText;
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
