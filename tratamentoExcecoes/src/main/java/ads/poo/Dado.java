package ads.poo;

import java.util.Random;

public class Dado {
    Random r = new Random();
    protected int face;
    protected int[] est = new int[6];

    public int jogar(){
        face = r.nextInt(6);
        est[face] ++;
        return face;
    }
}
