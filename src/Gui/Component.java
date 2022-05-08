package Gui;

import El.parts.Light;
import El.parts.Parallel;
import El.parts.basic.Part;
import El.parts.basic.Resistor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Component extends JPanel {

    El.parts.basic.Component child;
    Point location = new Point();
    public Component(Color c,JPanel panel){

        setLayout(new FlowLayout());
        setAlignmentX(10);
        setSize(40,40);
        setBackground(c);


        ((JButton)panel.getComponent(0)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel t = new JLabel("light");
                t.setLocation(location);
                add(t);
                child = new Light();
                revalidate();
            }
        });
        ((JButton)panel.getComponent(1)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component t = new Component(Color.gray,panel);
                add(t);

                child = new Parallel();
                revalidate();
                t.setLocation(location);

            }
        });


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if(e.getButton()==3){
                    System.out.println(e.getX());
                    panel.setLocation(new Point(e.getX(),e.getY()));
                }
                else{
                    panel.setLocation(new Point(-100,-100));
                }
                location = new Point(e.getX(),e.getY());

            }
        });

    }

}
