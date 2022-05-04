package El.parts;

import El.parts.basic.Part;

public class Serie extends Part {

    Resistor input = new Resistor();
    Resistor output = new Resistor();

    public void connect(Resistor child) {
        output = child;
        child.inputs=(input);
    }

    @Override
    public void send(float u,float i) {
        for(Resistor r : parts){
            r.send(i*getResistance(),i);
            //wrong u
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
