package El.parts.basic;

import java.util.ArrayList;

public class Part extends Resistor {

    public ArrayList<Resistor> parts = new ArrayList<>();

    public void add(Resistor child){
        parts.add(child);
        child.connect(this);
    }
    public void remove(Resistor child){
        child.disconnect(this);
        parts.remove(child);
    }

}
