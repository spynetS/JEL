package El.parts.basic;

import El.parts.Component;
import El.parts.Resistor;

import java.util.ArrayList;

public class Part extends Resistor {

    public ArrayList<Resistor> parts = new ArrayList<>();
    public void add(Resistor child){
        parts.add(child);
    }

}
