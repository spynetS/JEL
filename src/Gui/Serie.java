package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Serie extends JPanel {

    public Serie(){
        Button add = new Button("+");
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(add);
        setBackground(Color.gray);
    }

}
