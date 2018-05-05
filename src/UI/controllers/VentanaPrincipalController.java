package UI.controllers;

import DBConnection.MySQLConnection;
import Modelos.tablas.AsignaturaTable;
import Modelos.tablas.ExamenTable;
import Modelos.tablas.ProfesorTable;
import Modelos.tablas.TrimestreTable;
import UI.vistas.paneles.listados.PanelListaAsignaturas;
import UI.vistas.paneles.listados.PanelListaProfesores;
import UI.vistas.paneles.listados.PanelListaTrimestre;
import UI.vistas.paneles.listados.PanelListaExamenes;
import UI.vistas.paneles.creacion.*;
import UI.vistas.ventanas.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipalController {

    Ventana ventana = new Ventana();
    MySQLConnection db = new MySQLConnection();


    PanelBienvenida panelBienvenida = new PanelBienvenida();








    public void iniciar() {


        ventana.iniciar();
        ventana.setVisible(true);
        ventana.getSubCrearAsignatura().addActionListener(menuListener);
        ventana.getSubCrearProfesor().addActionListener(menuListener);
        ventana.getSubCrearEvaluacion().addActionListener(menuListener);
        ventana.getSubCrearExamen().addActionListener(menuListener);
        ventana.getListaAsignaturas().addActionListener(menuListener);
        ventana.getListaExamenes().addActionListener(menuListener);
        ventana.getListaTrimestre().addActionListener(menuListener);
        ventana.getListaProfesores().addActionListener(menuListener);


        ventana.getSubCrearEvaluacion().addActionListener(menuListener);

        ventana.getHome().addActionListener(menuListener);

        panelBienvenida.iniciar();
        ventana.getContentPane().add(panelBienvenida);
        panelBienvenida.updateUI();
        db.Connect();
    }

    ActionListener menuListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== ventana.getHome()) {



                System.out.println("pulsado");
                panelBienvenida.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelBienvenida);
                panelBienvenida.updateUI();

                return;

            }else if(e.getSource()== ventana.getSubCrearEvaluacion()){

                PanelCrearTrimestre panelcrearEvaluacion = new PanelCrearTrimestre();

                System.out.println("pulsado");
                panelcrearEvaluacion.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelcrearEvaluacion);
                panelcrearEvaluacion.updateUI();

                return;

            }else if(e.getSource()== ventana.getSubCrearProfesor()){

                PanelCrearProfesor panelProfesor = new PanelCrearProfesor();

                System.out.println("pulsado");
                panelProfesor.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelProfesor);
                panelProfesor.updateUI();

                return;
            }else if(e.getSource()== ventana.getSubCrearExamen()){

                PanelCrearExamen panelcrearExamen = new PanelCrearExamen();

                System.out.println("pulsado");
                panelcrearExamen.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelcrearExamen);
                panelcrearExamen.updateUI();

                return;

            }else if(e.getSource()== ventana.getSubCrearAsignatura()){

                PanelCrearAsignatura panelcrearAsignatura = new PanelCrearAsignatura();

                System.out.println("pulsado");
                panelcrearAsignatura.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelcrearAsignatura);
                panelcrearAsignatura.updateUI();

                return;
            }else if(e.getSource()== ventana.getListaTrimestre()){


                PanelListaTrimestre panelListaTrimestres = new PanelListaTrimestre();


                System.out.println("pulsado");

                panelListaTrimestres.setTablaTrimestres(new TrimestreTable().getTabla());
                panelListaTrimestres.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelListaTrimestres);
                panelListaTrimestres.updateUI();

                return;
            }else if(e.getSource()== ventana.getListaExamenes()){


                PanelListaExamenes panelListaExamenes = new PanelListaExamenes();

                System.out.println("pulsado");

                panelListaExamenes.setTablaExamenes(new ExamenTable().getTabla());
                panelListaExamenes.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelListaExamenes);
                panelListaExamenes.updateUI();

                return;
            }else if(e.getSource()== ventana.getListaProfesores()){

                PanelListaProfesores panelListaProfesores = new PanelListaProfesores();


                System.out.println("pulsado");

                panelListaProfesores.setTablaProfesores(new ProfesorTable().getTabla());
                panelListaProfesores.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelListaProfesores);
                panelListaProfesores.updateUI();

                return;
            }else if(e.getSource()== ventana.getListaAsignaturas()){

                PanelListaAsignaturas panelListaAsignaturas = new PanelListaAsignaturas();


                System.out.println("pulsado");

                panelListaAsignaturas.setTablaAsignaturas(new AsignaturaTable().getTabla());
                panelListaAsignaturas.iniciar();
                ventana.getContentPane().removeAll();
                ventana.getContentPane().add(panelListaAsignaturas);
                panelListaAsignaturas.updateUI();

                return;
            }
        }
    };




    public static void main (String[] args){
        new VentanaPrincipalController().iniciar();
    }

}
