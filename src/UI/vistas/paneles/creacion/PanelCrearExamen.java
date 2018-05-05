package UI.vistas.paneles.creacion;

import javax.swing.*;
import java.awt.*;

public class PanelCrearExamen extends JPanel {

    private JLabel          tituloFormulario;

    private JLabel          nombreLabel;
    private JTextField      nombreText;
    private JLabel          asignaturaLabel;
    private JComboBox       asignaturaCombo;

    private JLabel          fecha_examenLabel;
    private JTextField      fecha_examenText;
    private JLabel          fecha_realizadoLabel;
    private JTextField      fecha_realizadoText;
    private JLabel          notaLabel;
    private JTextField      notaText;

    private JButton         guardar;
    private JButton         limpiar;


    public void iniciar(){
        instanciarControles();
        configurarPanel();
    }

    private void instanciarControles(){

        tituloFormulario = new JLabel("Crear Examen");
        tituloFormulario.setBounds(220,50,255,30);
        tituloFormulario.setFont(getFont().deriveFont(30.0f));

        nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(150,150,80,20);

        nombreText = new JTextField();
        nombreText.setBounds(290,150,255,20);

        asignaturaLabel = new JLabel("Asignatura");
        asignaturaLabel.setBounds(150,180,255,20);

        asignaturaCombo = new JComboBox();
        asignaturaCombo.setBounds(290,180,255,20);

        fecha_examenLabel = new JLabel("Fecha examen");
        fecha_examenLabel.setBounds(150,210,255,20);

        fecha_examenText = new JTextField();
        fecha_examenText.setBounds(290,210,255,20);

        fecha_realizadoLabel= new JLabel("Fecha realizado");
        fecha_realizadoLabel.setBounds(150,240,255,20);

        fecha_realizadoText = new JTextField();
        fecha_realizadoText.setBounds(290,240,255,20);

        notaLabel = new JLabel("Nota:");
        notaLabel.setBounds(150,270,255,20);

        notaText = new JTextField();
        notaText.setBounds(290,270,255,20);

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
        this.add(asignaturaLabel);
        this.add(asignaturaCombo);
        this.add(fecha_examenLabel);
        this.add(fecha_examenText);
        this.add(fecha_realizadoLabel);
        this.add(fecha_realizadoText);
        this.add(notaLabel);
        this.add(notaText);

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

    public JLabel getAsignaturaLabel() {
        return asignaturaLabel;
    }

    public void setAsignaturaLabel(JLabel asignaturaLabel) {
        this.asignaturaLabel = asignaturaLabel;
    }

    public JComboBox getAsignaturaCombo() {
        return asignaturaCombo;
    }

    public void setAsignaturaCombo(JComboBox asignaturaCombo) {
        this.asignaturaCombo = asignaturaCombo;
    }

    public JLabel getFecha_examenLabel() {
        return fecha_examenLabel;
    }

    public void setFecha_examenLabel(JLabel fecha_examenLabel) {
        this.fecha_examenLabel = fecha_examenLabel;
    }

    public JTextField getFecha_examenText() {
        return fecha_examenText;
    }

    public void setFecha_examenText(JTextField fecha_examenText) {
        this.fecha_examenText = fecha_examenText;
    }

    public JLabel getFecha_realizadoLabel() {
        return fecha_realizadoLabel;
    }

    public void setFecha_realizadoLabel(JLabel fecha_realizadoLabel) {
        this.fecha_realizadoLabel = fecha_realizadoLabel;
    }

    public JTextField getFecha_realizadoText() {
        return fecha_realizadoText;
    }

    public void setFecha_realizadoText(JTextField fecha_realizadoText) {
        this.fecha_realizadoText = fecha_realizadoText;
    }

    public JLabel getNotaLabel() {
        return notaLabel;
    }

    public void setNotaLabel(JLabel notaLabel) {
        this.notaLabel = notaLabel;
    }

    public JTextField getNotaText() {
        return notaText;
    }

    public void setNotaText(JTextField notaText) {
        this.notaText = notaText;
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
