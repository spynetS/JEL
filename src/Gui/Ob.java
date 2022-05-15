package Gui;

import El.parts.Light;
import El.parts.basic.Component;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;

public class Ob extends GameObject {
    private Ob con;
    public Component elComp = new Light(){
        @Override
        public void send(float bu, float bi,float u, float i) {
            setColor(Color.yellow);
        }

    };
    Label el = new Label();


    public Ob(Vector2 pos){
        setPosition(pos);
        addChild(el);
        el.text = String.valueOf(elComp.getClass());

    }

    public void setElComp(Component elComp) {
        this.elComp = elComp;
        el.text = String.valueOf(elComp.getClass());

    }

    public void connect(Ob child){
        this.con = child;
        elComp.connect(child.elComp);

    }

    @Override
    public void onMousePressed() {
        if(Main.parent==null){
            Main.parent = this;
        }
        else{
            connect(Main.parent);
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
        if(getColor() == Color.yellow){
            setColor(Color.darkGray);
        }
        if(con!=null){
            g.drawLine((int) getPosition().getX(), (int) getPosition().getY(), (int) con.getPosition().getX(), (int) con.getPosition().getY());
        }
    }
}