package Gui;

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

        JFrame frame = new JFrame();
        frame.setTitle("JEL");
        UpdateThread.camera.setPosition(new Vector2(0,0));
        Ob ob1 = new Ob(new Vector2(100,100));
        Ob ob2 = new Ob(new Vector2(200,400));
        Ob ob3 = new Ob(new Vector2(400,400));

        ComponentHandler.addObject(ob1);
        ComponentHandler.addObject(ob2);
        ComponentHandler.addObject(ob3);

        Button button = new Button("Skicka",new Vector2(400,200)){
            @Override
            public void onMousePressed() {
                System.out.println("Vad menar du?");
            }
        };

        ComponentHandler.addObject(button);

        start();
    }

    static class Ob extends GameObject{
        public Ob con;

        public Ob(Vector2 pos){
            setPosition(pos);
        }

        @Override
        public void onMousePressed() {
            if(Main.parent==null){
                Main.parent = this;
            }
            else{
                Main.parent.con = this;
                Main.parent = null;
            }
        }

        @Override
        public void onMouseEntered() {
            setScale(getScale().multiply(1.1f));
        }
        @Override
        public void onMouseExit() {
            setScale(getScale().devide(1.1f));
        }
        @Override
        public void draw(Graphics g) {
            super.draw(g);
            if(con!=null){
                g.drawLine((int) getPosition().getX(), (int) getPosition().getY(), (int) con.getPosition().getX(), (int) con.getPosition().getY());
            }
        }
    }

}