package com.company;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ventana extends JFrame {
    private MLRAgente myAgent;
    private JTextField fieldValue1;
    private JTextField fieldValue2;

    ventana(MLRAgente a) {
        super(a.getLocalName());
        this.myAgent = a;
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        p.add(new JLabel("Valor X1:"));
        this.fieldValue1 = new JTextField(15);
        p.add(this.fieldValue1);
        p.add(new JLabel("Valor X2:"));
        this.fieldValue2 = new JTextField(15);
        p.add(this.fieldValue2);
        this.getContentPane().add(p, "Center");
        JButton addButton = new JButton("Resultado");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                try {
                    String value1ToPredict = ventana.this.fieldValue1.getText().trim();
                    String value2ToPredict = ventana.this.fieldValue2.getText().trim();
                    ventana.this.myAgent.ObtenerYhat(Double.parseDouble(value1ToPredict), Double.parseDouble(value2ToPredict));
                    ventana.this.fieldValue1.setText("");
                    ventana.this.fieldValue2.setText("");
                } catch (Exception var4) {
                    JOptionPane.showMessageDialog(ventana.this, "Invalid values. " + var4.getMessage(), "Error", 0);
                }

            }
        });
        p = new JPanel();
        p.add(addButton);
        this.getContentPane().add(p, "South");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ventana.this.myAgent.doDelete();
            }
        });
        this.setResizable(false);
    }

    public void showGui() {
        this.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int)screenSize.getWidth() / 2;
        int centerY = (int)screenSize.getHeight() / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
        super.setVisible(true);
    }
}
