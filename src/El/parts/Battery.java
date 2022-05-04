package El.parts;

import El.Utils.ResistorPacket;

import java.util.ArrayList;

public class Battery extends Part{

    float capacity = 100; // ampere hours
    float u = 12; // volts
    float restot = 0;
    float temp = 0;
    ArrayList<Float> ids = new ArrayList<>();
    public Battery(){
        this.value = capacity;
    }

    public void getRes(ArrayList<ResistorPacket> res){

    }

    public void sendResistence(){
        for(int i = 0; i< input.size(); i++){
            Part p = input.get(i);

            System.out.println(p.resistance);
        }
    }

}
