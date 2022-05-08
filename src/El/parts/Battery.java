package El.parts;

import El.parts.basic.Resistor;

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
        return (((Resistor)output).getResistance());
    }


    public void send(){
        float restot = sendResistence();
        float i=u/restot;
        System.out.println(i);
        System.out.println(restot);
        output.send(u,i,u,i);
    }

    public void print() {
        output.print();
    }
}
