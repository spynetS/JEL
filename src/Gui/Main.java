package Gui;

import JavaGameEngine.Backend.ComponentHandler;
import JavaGameEngine.Backend.Input.Input;
import JavaGameEngine.Backend.Input.Keys;
import JavaGameEngine.Components.Component;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.Components.Sprite.Sprite;
import JavaGameEngine.JavaGameEngine;
import JavaGameEngine.msc.Vector2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main extends JavaGameEngine{

    public static void main(String[] args)
    {
        init();

        JFrame frame = new JFrame();
        frame.setTitle("JEL");
        Menu menu = new Menu();
        ComponentHandler.addObject(new Board(menu));
        //ComponentHandler.addObject(menu);

        start();
    }

    static class Light extends GameObject{
        public Light(Vector2 pos){
           // setPosition(pos);
            //setScale(new Vector2(10,10));
            setLocalPosition(pos);
            setLocalScale(new Vector2(10,10));
        }

        @Override
        public void draw(Graphics g) {
            g.setColor(Color.green);
            super.draw(g);

        }
    }

    static class Menu extends GameObject{
        public Menu(){
            setPosition(new Vector2(400,400));
        }

        @Override
        public void onMouseEnter() {
            setScale(getScale().multiply(1.1f));
        }

        @Override
        public void onMouseExit() {
            setScale(getScale().devide(1.1f));
        }
    }

    static class Board extends GameObject{
        static class Line{
            public int x,y,l,b;
            public Line(int x, int y, int b, int l){
                this.x = x;
                this.y = y;
                this.b = b;
                this.l = l;
            }
        }
        int block = 0;
        int x1,y1;
        int x2,y2;
        ArrayList<Line> lines = new ArrayList<>();
        Menu menu;

        public Board(Menu menu){
            //setScale(new Vector2(400,400));
            this.menu = menu;
        }

        int time = 100;
        @Override
        public void update() {
            super.update();
            if(Input.isMouseDown(1)&&time<=0){
                if(this.x1==0){
                    Vector2 pos = Input.getMousePosition();
                    x1 = (int) pos.getX();
                    y1 = (int) pos.getY();
                    time = 20;
                }
                else{
                    Vector2 pos = Input.getMousePosition();
                    x2 = (int) pos.getX();
                    y2 = (int) pos.getY();
                    Line l = new Line(x1,y1,x2,y2);
                    lines.add(l);
                    x1 = 0;
                    y1 = 0;
                    x2 = 0;
                    y2 = 0;
                    time = 20;
                }
            }
            time-=1;
        }

        @Override
        public void draw(Graphics g) {
            super.draw(g);
            g.drawString(Integer.toString(time),10,10);
            g.drawString(ComponentHandler.getObjects().toString(),50,10);
            for(Line l : lines){
                g.drawLine(l.x,l.y,l.b, l.l);
            }
        }
    }

}