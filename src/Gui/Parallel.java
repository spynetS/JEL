package Gui;

import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;

import java.awt.*;
import java.util.ArrayList;

public class Parallel extends Part {

    ArrayList<GameObject> parts = new ArrayList<>();
    public Parallel (){

        setPosition(new Vector2(600,300));
        setScale(new Vector2(400,200));
        start();
    }

}
