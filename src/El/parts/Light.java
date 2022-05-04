package El.parts;

public class Light extends Part{

    public float min = 2;

    public Light(){
        this.resistance = 10;
    }

    //@Override
    public void get(float value) {
        //if(value>min){
            System.out.println("light "+ value);
       // }
        //super.get(value);
    }
}
