package UI.vistas.ventanas;

import javax.swing.*;

public class Ventana extends JFrame {

    private JMenuBar barraMenu;
    private JMenu inicio;
    private JMenuItem home;
    private JMenu crear;
    private JMenuItem subCrearExamen;
    private JMenuItem subCrearAsignatura;
    private JMenuItem subCrearEvaluacion;
    private JMenuItem subCrearProfesor;
    private JMenu listados;
    private JMenuItem listaExamenes;
    private JMenuItem listaAsignaturas;
    private JMenuItem listaTrimestre;
    private JMenuItem listaProfesores;





    public void iniciar(){
        instanciarControles();
        configurarPanelMenuBar();
        configurarVentana();

    }

    public void instanciarControles(){
        barraMenu = new JMenuBar();
        inicio = new JMenu("Inicio");
        home = new JMenuItem("Home");
        crear = new JMenu("Crear");
        subCrearAsignatura = new JMenuItem("Crear Asignatura");
        subCrearEvaluacion = new JMenuItem("Crear Evaluacion");
        subCrearExamen = new JMenuItem("Crear Examen");
        subCrearProfesor = new JMenuItem("Crear Profesor");
        listados = new JMenu("Listados");
        listaAsignaturas = new JMenuItem("Lista de Asignaturas");
        listaExamenes = new JMenuItem("Lista de Examenes");
        listaTrimestre = new JMenuItem("Lista de Trimestes");
        listaProfesores = new JMenuItem("Lista de Profesores");




        //mentemos botones menu en barra menu
        barraMenu.add(inicio);
        inicio.add(home);
        barraMenu.add(crear);
        barraMenu.add(listados);
        listados.add(listaAsignaturas);
        listados.add(listaExamenes);
        listados.add(listaTrimestre);
        listados.add(listaProfesores);

        crear.add(subCrearExamen);
        crear.add(subCrearAsignatura);
        crear.add(subCrearEvaluacion);
        crear.add(subCrearProfesor);
    }

    public void configurarPanelMenuBar(){
        JPanel cp = new JPanel();
        cp.add(barraMenu);
    }



    public void configurarVentana(){

        //CONFIGURACION DEL FRAME
        this.setTitle("Pruebas entanay paneles");
        this.setResizable(false);
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //POSICINAMIENTO DE BOTONES -setBounds-


        setJMenuBar(getBarraMenu());


    }

    /*****************************/
    /*      GETTER AND SETTERS   */
    /*****************************/


    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JMenu getCrear() {
        return crear;
    }

    public JMenuItem getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(JMenuItem listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public void setCrear(JMenu crear) {
        this.crear = crear;
    }

    public JMenu getInicio() {
        return inicio;
    }

    public void setInicio(JMenu inicio) {
        this.inicio = inicio;
    }

    public JMenu getListados() {
        return listados;
    }

    public void setListados(JMenu listados) {
        this.listados = listados;
    }

    public JMenuItem getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(JMenuItem listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    public JMenuItem getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(JMenuItem listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public JMenuItem getHome() {
        return home;
    }

    public void setHome(JMenuItem home) {
        this.home = home;
    }

    public JMenuItem getListaTrimestre() {
        return listaTrimestre;
    }

    public void setListaTrimestre(JMenuItem listaTrimestre) {
        this.listaTrimestre = listaTrimestre;
    }

    public JMenuItem getSubCrearExamen() {
        return subCrearExamen;
    }

    public void setSubCrearExamen(JMenuItem subCrearExamen) {
        this.subCrearExamen = subCrearExamen;
    }

    public JMenuItem getSubCrearAsignatura() {
        return subCrearAsignatura;
    }

    public void setSubCrearAsignatura(JMenuItem subCrearAsignatura) {
        this.subCrearAsignatura = subCrearAsignatura;
    }

    public JMenuItem getSubCrearEvaluacion() {
        return subCrearEvaluacion;
    }

    public void setSubCrearEvaluacion(JMenuItem subCrearEvaluacion) {
        this.subCrearEvaluacion = subCrearEvaluacion;
    }

    public JMenuItem getSubCrearProfesor() {
        return subCrearProfesor;
    }

    public void setSubCrearProfesor(JMenuItem subCrearProfesor) {
        this.subCrearProfesor = subCrearProfesor;
    }
}
