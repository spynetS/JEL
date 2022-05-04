package El.parts;

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
    public ArrayList<Part> output = new ArrayList<>(); //child
    /**
     * plus goes in to next part
     */
    public ArrayList<Part> input = new ArrayList<>(); //minus

    public void connect(Part child){

        output.add(child);
        child.input.add(this);
    }



}
