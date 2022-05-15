package Gui;

import JavaGameEngine.Components.Component;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Button extends GameObject {

    public Button(String text, Vector2 pos){
        setPosition(pos);
        setScale(new Vector2(100,50));
        setLocalScale(new Vector2(100,50));
        setColor(Color.MAGENTA);

        Label label = new Label(text);
        label.setColor(Color.white);
        label.setLocalPosition(new Vector2(getScale().getX()/2,getScale().getY()/2));
        addChild(label);
    }

    @Override
    public void onMouseEntered() {
        setScale(getScale().devide(1.1f));
    }
    @Override
    public void onMouseExit() {
        setScale(getScale().multiply(1.1f));
    }
    @Override
    public void draw(Graphics g) {

        g.setColor(getColor());
        Graphics2D graphics2 = (Graphics2D) g;
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(getSpritePosition().getX(),getSpritePosition().getY(),getScale().getX(),getScale().getY(), 10, 10);
        graphics2.fill(roundedRectangle);

        for(Component c : getChildren()){
            c.draw(g);
        }

//        super.draw(g);
    }
}


