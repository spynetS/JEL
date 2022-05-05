package El.parts;

import El.parts.basic.Part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Parallel extends Part {

    private ArrayList<Resistor> sortParts(){
        System.out.println(parts);
        ArrayList<Resistor> tempParts = (ArrayList<Resistor>) parts.clone();
        Resistor temp = null;
        for(int i = 0;i<parts.size();i++){
            Resistor mainr = parts.get(i);
            for(int y = 1;y<parts.size();y++){
                Resistor testr = parts.get(y);

                if(testr.getResistance()>mainr.getResistance()){
                    temp = mainr;
                    tempParts.set(i,testr);
                    tempParts.set(y,mainr);
                }

            }
        }
        System.out.println(tempParts);
        return tempParts;
    }

    @Override
    public void send(float bu,float bi,float u, float i){
        for(Resistor r : parts){
            //u=i*R
            //I=u/r
            //r=u/i
            float U = i*getResistance();
            float I = U/r.getResistance();
            r.send(bu,bi,U,I);
        }
    }
    @Override
    protected void print() {
        for(Resistor r : parts){
            System.out.print("|");
            r.print();
            System.out.println();
        }
    }
    @Override
    public float getResistance(){
        float base = parts.get(0).getResistance();
        float t = 0;
        float totalRes = 0;

        for(Resistor f : parts){

            t+=(base/f.getResistance());
        }
        return (base/t);
    }
}
