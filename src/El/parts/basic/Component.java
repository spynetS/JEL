package El.parts;

import El.parts.basic.Part;

import java.util.ArrayList;
import java.util.Random;

public class Component {

    float id = 0;
    public float u;
    public Component(){
        id = new Random().nextFloat();
    }

    public Component outputs;
    public Component inputs;

    public void connect(Component child){

        outputs = (child);
        child.inputs=(this);
    }


    public void send(float bu,float bi,float u, float i) {
    }


    protected void print() {
    }
}
