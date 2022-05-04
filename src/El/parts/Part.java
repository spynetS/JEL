package El.parts;

import El.Utils.ResistorPacket;
import El.Utils.SomeMaths;

import java.util.ArrayList;
import java.util.Random;

public class Part {

    float resistance = 0; //ohm
    public float value;
    public float id;
    public Part(float resistance){
        this.resistance = resistance;
        id = new Random().nextFloat();
    }
    public Part(){
        id = new Random().nextFloat();
    }

    /**
     * plus goes in to next part
     */
    public ArrayList<Part> outputs = new ArrayList<>(); //child
    /**
     * plus goes in to next part
     */
    public ArrayList<Part> inputs = new ArrayList<>(); //minus

    public void connect(Part child){

        outputs.add(child);
        child.inputs.add(this);
    }


    public ArrayList<ResistorPacket> getRes(ArrayList<ResistorPacket> res){
        if(outputs.size()>1){
            ArrayList<Float> resistences = new ArrayList<>();

            for(Part output : outputs) {
                resistences.add(output.resistance);
                res.addAll(output.getRes(res));
            }
            res.add(new ResistorPacket(new Random().nextFloat(),SomeMaths.getParallel(resistences)));
            return res;
        }
        else{
            res.add(new ResistorPacket(outputs.get(0).id,outputs.get(0).resistance));
            res.addAll(outputs.get(0).getRes(res));
            return res;

        }
    }

}
