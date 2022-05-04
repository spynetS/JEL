package El.parts;

public class Light extends Resistor {

    public float min = 2;

    public Light(){
        this.resistance = 10;
    }
    public Light(float resistance){
        this.resistance = resistance;
    }

    @Override
    public void send(float u, float i) {
        System.out.println("my i "+i);

        super.send(u, i);
        System.out.println(this.u);
    }
}
