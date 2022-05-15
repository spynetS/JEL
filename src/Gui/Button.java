package Gui;

import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Button extends GameObject {
    public String text;
    public Button(String text, Vector2 pos){
        setPosition(pos);
        setScale(new Vector2(100,50));
        this.text = text;
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
        Graphics2D graphics2 = (Graphics2D) g;
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(getSpritePosition().getX(),getSpritePosition().getY(),getScale().getX(),getScale().getY(), 10, 10);
        graphics2.fill(roundedRectangle);

        g.setColor(Color.white);
        g.drawString(text, (int) getPosition().getX()-40, (int) getPosition().getY());
    }
}
