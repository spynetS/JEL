package El.parts;

import El.parts.basic.Part;
import El.parts.basic.Resistor;


public class Serie extends Part {

    Resistor input = new Resistor();
    Resistor output = new Resistor();

    public void connect(Resistor child) {
        output = child;
        child.inputs=(input);
    }

    @Override
    public void send(float bu,float bi,float u, float i) {
        for(Resistor r : parts){
            float U = i*r.getResistance();

            r.send(bu,bi,U,i);
        }
    }

    @Override
    public void print() {
        for(Resistor r : parts){
            r.print();
            System.out.print("-");
        }
    }

    @Override
    public float getResistance() {
        float sum = 0;
        for(Resistor r : parts){
            sum+=r.getResistance();
        }
        return sum;
    }
}
