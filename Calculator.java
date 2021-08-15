package src.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wn {
    public static void main(String[] args){
        JFrame window = new JFrame("New Window");
        int x, y, width, height;
        window.setBounds(x=5, y=5, width=500, height=500);
        window.setLayout(null);
        window.setVisible(true);

        JTextField a_Field = new JTextField();
        JTextField b_Field = new JTextField();
        a_Field.setBounds(x=5, y=5, width=150, height=50);
        b_Field.setBounds(x=5, y=65, width=150, height=50);

        window.add(a_Field);
        window.add(b_Field);

        JButton button = new JButton("Sum");
        button.setBounds(x=5, y=125, width=150, height=50);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.GREEN);
        window.add(button);

        JLabel label = new JLabel("Here");
        label.setBounds(x=5, y=185, width=150, height=50);

        window.add(label);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=0, b=0;


                a = Integer.parseInt(a_Field.getText());
                b = Integer.parseInt(b_Field.getText());
                label.setText(a+b+"");
            }
        };
        button.addActionListener(actionListener);
        window.setVisible(true);

    }

}
