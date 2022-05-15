package Gui;

import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;
import java.util.ArrayList;

public class List extends GameObject {

    ArrayList<GameObject> items = new ArrayList<>();
    int height = 10;


    public List(){
        setColor(Color.lightGray);
    }
    public void addItem(GameObject item){
        float x = 50;
        float newItemHeight = item.getScale().getY();

        float lastItemY = (getChildren().size() > 0 ) ? getChildren().getLast().getLocalPosition().getY()+ getScale().getY()/2 : 0;

        float y = (getChildren().size()>0)?lastItemY+newItemHeight:newItemHeight;

        item.setLocalPosition(new Vector2(x,(y+height)- getScale().getY()/2 ));

        item.setLocalScale(new Vector2(getScale().getX(),height));

        addChild(item);
    }

}
