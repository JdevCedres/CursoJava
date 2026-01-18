package todoCode.pruebasCapas.igu;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame {

    public Pantalla() {
        setTitle("Mi primera ventana");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        JLabel lblTitulo = new JLabel("Copiadora", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        panelPrincipal.add(lblTitulo, BorderLayout.NORTH);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BoxLayout(panelCentro, BoxLayout.Y_AXIS));

        JPanel panelIzquierda = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelIzquierda.add(new JLabel("Inserte texto:"));
        JTextField jText = new JTextField(25);
        panelIzquierda.add(jText);

        JPanel panelIzquierdaDos = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton jButtonCopiar = new JButton("Copiar");
        panelIzquierdaDos.add(jButtonCopiar);



        JPanel panelResultado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelResultado.add(new JLabel("El texto que ingresó es:"));
        JTextField jTextIntroducido = new JTextField(25);
        panelResultado.add(jTextIntroducido);

        // Botón limpiar
        JPanel panelFinal = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton jButtonLimpiar = new JButton("Limpiar");
        panelFinal.add(jButtonLimpiar);


        // evento del botón copiar
        jButtonCopiar.addActionListener(e -> {
            String texto = jText.getText();
            jTextIntroducido.setText(texto);
        });

        // evento botón limpiar
        jButtonLimpiar.addActionListener(e -> {
            jText.setText("");
            jTextIntroducido.setText("");
        });

        panelCentro.add(panelIzquierda);
        panelCentro.add(panelIzquierdaDos);
        panelCentro.add(panelResultado);
        panelCentro.add(panelFinal);

        panelPrincipal.add(panelCentro, BorderLayout.CENTER);
        add(panelPrincipal);
    }



}

