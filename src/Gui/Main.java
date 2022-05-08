package Gui;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args){
        Main m = new Main();
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JButton light = new JButton("Light");
        JButton parallel = new JButton("Parallel");
        JButton serie = new JButton("Serie");
        panel.add(light);
        panel.add(parallel);
        panel.add(serie);


        Component first = new Component(Color.CYAN,panel);

        main.add(new JButton("send"),BorderLayout.NORTH);
        main.add(first,BorderLayout.CENTER);

        first.add(panel);

        m.setContentPane(main);

        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);


    }

}
