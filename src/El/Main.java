package El;

import El.parts.*;

public class Main {

    /*
        When a
     */


    public static void main(String[] args){
        Battery b = new Battery();
        Serie serie1 = new Serie();
        Parallel parallel = new Parallel();
        Light light = new Light(50);
        Resistor res2 = new Resistor(20);
        Resistor res3 = new Resistor(30);
        Resistor res4 = new Resistor(50);
        Resistor res5 = new Resistor(40);

        Parallel smallParallel = new Parallel();
        smallParallel.add(res2);
        smallParallel.add(res3);

        Serie parallelSerie = new Serie();
        parallelSerie.add(light);
        parallelSerie.add(smallParallel);

        parallel.add(parallelSerie);
        parallel.add(res4);

        serie1.add(parallel);
        serie1.add(res5);

        b.connect(serie1);

        b.send();
        //b.print();

    }

}
