package El.parts;

import El.parts.basic.Resistor;

public class Light extends Resistor {

    public float min = 2;

    public Light(){
        this.resistance = 10;
    }
    public Light(float resistance){
        this.resistance = resistance;
    }

    @Override
    public void send(float bu, float bi,float u, float i) {
        System.out.println("Im lighting I="+i+"; u="+u);
    }
}
