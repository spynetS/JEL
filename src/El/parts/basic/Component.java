package El.parts.basic;


import java.util.Random;

public class Component {

    float id = 0;
    public float u;
    public Component(){
        id = new Random().nextFloat();
    }

    public Component output;
    public Component inputs;

    public void connect(Component child){
        output = (child);
        child.inputs=(this);
    }
    public void disconnect(Component child){
        output = (null);
        child.inputs=(null);
    }

    public void send(float bu,float bi,float u, float i) {}
    public void print() {}
}
