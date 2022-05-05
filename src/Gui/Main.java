package Gui;

import javax.swing.*;

public class Main extends JFrame
{
    public Main(){
        JPanel panel = new JPanel();
        panel.add(new Serie());
        add(panel);

    }

    public static void main(String[] args){
        Main m = new Main();
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setSize(400,400);
        m.setVisible(true);
    }
}
