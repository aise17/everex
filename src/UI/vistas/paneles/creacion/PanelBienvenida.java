package UI.vistas.paneles.creacion;

import javax.swing.*;
import java.awt.*;

public class PanelBienvenida extends JPanel {

    JLabel saludo;

    public void iniciar(){
        instanciarControles();
        configurarPanel();

    }

    public void instanciarControles(){
        saludo = new JLabel("<html>BIENVENIDOS  A  <br/> LA APILICACION <br/> PARA VAGOS</html>");
        saludo.setBounds(220,100,900,200);
        saludo.setFont(saludo.getFont().deriveFont(40.0f));

    }

    public void configurarPanel(){
        this.setLayout(null);
        this.setBackground(Color.BLUE);
        this.add(saludo);

    }

    public JLabel getSaludo() {
        return saludo;
    }

    public void setSaludo(JLabel saludo) {
        this.saludo = saludo;
    }
}
