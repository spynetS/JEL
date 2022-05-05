package El.parts;

import El.Utils.ResistorPacket;

import java.util.ArrayList;

public class Battery extends Resistor {

    float capacity = 100; // ampere hours
    float u = 12; // volts

    public Battery(float capacity,float u){
        this.capacity = capacity;
        this.u = u;
    }
    public Battery(){
    }
    public float sendResistence(){
        return (((Resistor)outputs).getResistance());
    }


    public void send(){
        float restot = sendResistence();
        float i=u/restot;
        System.out.println(i);
        System.out.println(restot);
        outputs.send(u,i,u,i);
    }

    public void print() {
        outputs.print();
    }
}
