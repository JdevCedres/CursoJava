package todoCode.pruebasCapas.igu;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {

    public Pantalla() {
        setTitle("Mi primera ventana");
        setSize(400, 300);
        setLocationRelativeTo(null); // centrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Label grande centrado arriba
        JLabel lblTitulo = new JLabel("Copiadora", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelPrincipal.add(lblTitulo, BorderLayout.NORTH);

        // Panel secundario para la fila de la izquierda
        JPanel panelIzquierda = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblInserte = new JLabel("Inserte texto:");
        lblInserte.setFont(new Font("Arial", Font.PLAIN, 14));
        panelIzquierda.add(lblInserte);

        panelPrincipal.add(panelIzquierda, BorderLayout.CENTER);

        add(panelPrincipal);

    }

    public static void main(String[] args) {
        new Pantalla().setVisible(true);
    }
}

