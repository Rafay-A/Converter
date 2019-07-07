/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

//Importing the required methods
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter {

    //Making variables.
    static JButton button;
    static JTextField textfield1;
    static JTextField textfield2;
    static JLabel label1;
    static JLabel label2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversion");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Making labels and text fields.
        label1 = new JLabel("Fahrenheit");
        panel.add(label1);

        textfield1 = new JTextField(10);
        panel.add(textfield1);

        //Making the button and using actionListener method.
        button = new JButton("Convert");
        panel.add(button);
        button.addActionListener(new ButtonListener());

        label2 = new JLabel("Celsius");
        panel.add(label2);

        textfield2 = new JTextField(10);
        panel.add(textfield2);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}

class ButtonListener extends Converter implements ActionListener {

    ButtonListener() {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == button) {

            String f = textfield1.getText();
            double f1 = Double.parseDouble(f);

            double c = (f1 - 32) * 0.5555;

            String c1 = Double.toString(c);
            textfield2.setText(c1);

        }
    }
}
