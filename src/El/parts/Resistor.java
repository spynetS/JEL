package El.parts;

import El.parts.basic.Part;

import java.util.ArrayList;
import java.util.Random;

public class Resistor extends El.parts.Component {

    float resistance = 1; //ohm
    public float id;
    public Resistor(float resistance){
        this.resistance = resistance;
        id = new Random().nextFloat();
    }
    public Resistor(){
        id = new Random().nextFloat();
    }

    public float getResistance(){
        return resistance;
    }

    @Override
    public void send(float u, float i) {
        this.u = i*getResistance();
    }

    @Override
    public String toString() {
        return "Resistor{" +
                this.getClass()+"="+  getResistance() +
                '}';
    }
}
