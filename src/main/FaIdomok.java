package main;

import java.util.List;
import idomok.FaIdom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;

public class FaIdomok {

    public FaIdomok() {
        run();
    }
    
    public double osszSuly(){
        
        return 1;
    }
    
    public double ossGombSuly(){
        
        return 1;
    }
    
    public FaIdom minV(){
        
        return null;
    }
    
    public FaIdom maxV(){
     
        return null;
    }
    
    public void run(){
        List<FaIdom> idomok = new ArrayList();
        idomok.add(new Gomb(3));
        idomok.add(new Gomb(1.5));
        idomok.add(new Hasab(3, 3, 2));
        idomok.add(new Hasab(1, 1.5, 6));
        
        for (int i = 0; i < idomok.size(); i++) {
            System.out.println(idomok.get(i).terfogat());
        }
    }
    
}
