package El.parts;

import El.Utils.ResistorPacket;

import java.util.ArrayList;

public class Battery extends Part{

    float capacity = 100; // ampere hours
    float u = 12; // volts
    float restot = 0;
    float temp = 0;
    float id = 0;
    ArrayList<ResistorPacket> resistors = new ArrayList<>();
    public Battery(){
        this.value = capacity;
    }


    @Override
    public ArrayList<ResistorPacket> getRes(ArrayList<ResistorPacket> res) {
        System.out.println("im the battery stupid");
        return res;
    }

    public void sendResistence(){
        float total = 0;
        ArrayList<Float> ids = new ArrayList<>();
        for(int i = 0; i< outputs.size(); i++){
            Part p = outputs.get(i);
            //System.out.println(p.resistance);
            for(ResistorPacket packet : p.getRes(resistors)){
                if(!ids.contains(packet.componentId)){
                    System.out.println(packet.resistance);
                    ids.add(packet.componentId);
                }
            }
        }
    }

}
