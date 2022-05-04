package El.Utils;

import java.util.ArrayList;

public class SomeMaths {

    public static float getParallel(ArrayList<Float> re){
        float base = re.get(0);
        float t = 0;
        float totalRes = 0;

        for(Float f : re){
            t+=(base/f);
        }
        return base/t;
    }

}
