package Gui;

import JavaGameEngine.Backend.Input.Input;
import JavaGameEngine.Backend.Input.Keys;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;

public class Part extends GameObject {
    Vector2 offset;

    public Part(){

    }

    public void start(){
        Button n = new Button("X",new Vector2(0,0)){
            @Override
            public void onMousePressed() {
                close();
                System.out.println("close");
            }
        };
        n.setScale(new Vector2(50,50));
        n.setLocalPosition(new Vector2(getScale().getX()/2,-getScale().getY()/2));
        addChild(n);

    }

    private void close(){
        destroy();
    }
    @Override
    public void onMouseEntered() {
        setColor(Color.gray);
    }
    @Override
    public void onMouseExit() {
        setColor(Color.darkGray);
    }
    @Override
    public void update() {
        super.update();
        if(isMouseInside()&&Input.isMouseDown(Keys.MIDDLECLICK)){
            setPosition(Input.getMousePosition().add(offset));
        }
        else{
            offset = getPosition().subtract(Input.getMousePosition());
        }
        //System.out.println(Input.isMousePressed());
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.GREEN);
        g.drawRect((int) getSpritePosition().getX(), (int) getSpritePosition().getY(), (int) getScale().getX(), (int) getScale().getY());
    }
}
