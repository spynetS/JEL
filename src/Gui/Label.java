package Gui;

import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;

public class Label extends GameObject {

    String text;

    public Label(String text){
        this.text = text;
        setColor(Color.white);
    }
    public Label(String text, Vector2 pos){
        this.text = text;
        setPosition(pos);
        setColor(Color.white);
    }
    public Label(){setColor(Color.white);}

    @Override
    public void onMousePressed() {
        super.onMousePressed();
    }

    @Override
    public void draw(Graphics g) {
        //super.draw(g);
        g.setColor(this.getColor());
        g.drawString(text, (int) getPosition().getX(), (int) ((int) getPosition().getY()+getParent().getScale().getY()/2));
        g.setColor(Color.darkGray);
    }
}

