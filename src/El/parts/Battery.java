package El.parts;

import java.util.ArrayList;

public class Battery extends Part{

    float capacity = 100; // ampere hours
    float u = 12; // volts
    float restot = 0;
    float temp = 0;
    public Battery(){
        this.value = capacity;
    }



}
