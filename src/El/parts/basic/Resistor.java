package El.parts.basic;

import java.util.Random;

public class Resistor extends El.parts.basic.Component {

    protected float resistance = 1; //ohm
    public float id;
    public float i;
    public String name="resistor";

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
    public void send(float bu,float bi,float u, float i) {
        this.u = i*getResistance();
    }

    @Override
    public void print() {
        System.out.print("<"+getResistance()+">");
    }

    @Override
    public String toString() {
        return "Resistor{" +
                this.getClass()+"="+  getResistance() +
                '}';
    }
}
