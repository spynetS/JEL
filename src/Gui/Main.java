package Gui;

import El.parts.Battery;
import El.parts.Light;
import El.parts.basic.Component;
import JavaGameEngine.Backend.ComponentHandler;
import JavaGameEngine.Backend.UpdateThread;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.JavaGameEngine;
import JavaGameEngine.msc.Vector2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;


public class Main extends JavaGameEngine{

    public static Ob parent;
    public static Ob child;


    public static void main(String[] args)
    {
        init();
        DELAY = 1;
        JFrame frame = new JFrame();
        frame.setTitle("JEL");
        UpdateThread.camera.setPosition(new Vector2(0,0));

        List l = new List();
        l.setPosition(new Vector2(50,500));
        l.setScale(new Vector2(100,1000));
        l.addItem(new Button("Light",new Vector2(0,0)){
            @Override
            public void onMousePressed() {

                Part p = new Part();
                p.start();
                instantiate(p);
            }
        });
        l.addItem(new Button("Parallel",new Vector2(0,0)){
            @Override
            public void onMousePressed() {
                Parallel p = new Parallel();
                instantiate(p);
            }
        });
        l.addItem(new Button("Serie",new Vector2(0,0)));


        ComponentHandler.addObject(new Parallel());

        ComponentHandler.addObject(l);

        start();
    }

}