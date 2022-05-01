package El.parts;

import java.util.ArrayList;

public class Part {

    float resistance = 0; //ohm
    public float value;

    public Part(float resistance){
        this.resistance = resistance;
    }
    public Part(){}

    /**
     * plus goes in to next part
     */
    public ArrayList<Part> plus = new ArrayList<>(); //child
    /**
     * plus goes in to next part
     */
    public ArrayList<Part> minus = new ArrayList<>(); //minus

    public void connect(Part child){

        plus.add(child);
        child.minus.add(this);
    }




}
