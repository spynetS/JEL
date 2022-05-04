package El;

import El.Utils.SomeMaths;
import El.parts.Battery;
import El.parts.Light;
import El.parts.Part;

public class Main {

    public static void main(String[] args){
        Battery b = new Battery();
        Part res1 = new Part(50);
        Part res2 = new Part(20);
        Part res3 = new Part(30);
        Part res4 = new Part(40);
        Part res5 = new Part(50);

        b.connect(res1);
        res1.connect(res2);
        res1.connect(res3);
        res2.connect(res4);
        res3.connect(res4);
        b.connect(res5);
        res5.connect(res4);
        res4.connect(b);

        b.sendResistence();
        System.out.println(SomeMaths.getParallel(20,30));
    }

}
