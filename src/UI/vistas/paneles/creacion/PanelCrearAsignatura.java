package UI.vistas.paneles.creacion;

import javax.swing.*;
import java.awt.*;

public class PanelCrearAsignatura extends JPanel {

    private JLabel tituloFormulario;

    private JLabel nombreLabel;
    private JTextField nombreText;

    private JLabel trimestreLabel;
    private JComboBox trimestreCombo;
    private JLabel profesorLable;
    private JComboBox profesorCombo;


    private JButton guardar;
    private JButton limpiar;


    public void iniciar(){
        instanciarControles();
        configurarPanel();
    }

    private void instanciarControles(){

        tituloFormulario = new JLabel("Crear Asignatura");
        tituloFormulario.setBounds(220,50,255,30);
        tituloFormulario.setFont(getFont().deriveFont(30.0f));

        nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(150,150,80,20);

        nombreText = new JTextField();
        nombreText.setBounds(290,150,255,20);

        trimestreLabel = new JLabel("Trimestre");
        trimestreLabel.setBounds(150,180,255,20);

        trimestreCombo = new JComboBox();
        trimestreCombo.setBounds(290,180,255,20);

        profesorLable = new JLabel("Profesor");
        profesorLable.setBounds(150,210,255,20);

        profesorCombo = new JComboBox();
        profesorCombo.setBounds(290,210,255,20);



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
        this.add(trimestreLabel);
        this.add(trimestreCombo);
        this.add(profesorLable);
        this.add(profesorCombo);


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

    public JLabel getTrimestreLabel() {
        return trimestreLabel;
    }

    public void setTrimestreLabel(JLabel trimestreLabel) {
        this.trimestreLabel = trimestreLabel;
    }

    public JComboBox getTrimestreCombo() {
        return trimestreCombo;
    }

    public void setTrimestreCombo(JComboBox trimestreCombo) {
        this.trimestreCombo = trimestreCombo;
    }

    public JLabel getProfesorLable() {
        return profesorLable;
    }

    public void setProfesorLable(JLabel profesorLable) {
        this.profesorLable = profesorLable;
    }

    public JComboBox getProfesorCombo() {
        return profesorCombo;
    }

    public void setProfesorCombo(JComboBox profesorCombo) {
        this.profesorCombo = profesorCombo;
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
