/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author LENOVO
 */
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends Frame {
    static JButton button;
    static JTextField textfield1;
    static JTextField textfield2;
    
    
    public Layout() {
        JFrame frame = new JFrame("Conversion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label1 = new JLabel("Fahrenheit");
        panel.add(label1);

        JTextField textfield1 = new JTextField(10);
        panel.add(textfield1);

        JButton button = new JButton("Convert");
        panel.add(button);

        JLabel label2 = new JLabel("Celsius");
        panel.add(label2);

        JTextField textfield2 = new JTextField(10);
        panel.add(textfield2);
        
        frame.add(panel);
        frame.pack();

    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == button) {

            }
        }
    }

}
