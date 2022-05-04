package El.parts;

import El.Utils.ResistorPacket;

import java.util.ArrayList;

public class Battery extends Resistor {

    float capacity = 100; // ampere hours
    float u = 12; // volts
    float restot = 0;
    float temp = 0;
    float id = 0;
    float value = 0;
    ArrayList<ResistorPacket> resistors = new ArrayList<>();
    public Battery(){
        this.value = capacity;
    }

    public float sendResistence(){
        return (((Resistor)outputs).getResistance());
    }
    public float getLargest(float a,float b){
        if(a>b)return a;
        else if(b>a)return b;
        else return 0;
    }

    public void send(){
        restot = sendResistence();
        float i=u/restot;
        System.out.println(i);
        System.out.println(restot);
        outputs.send(u,i);
    }
}
