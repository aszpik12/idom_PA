package main;

import idomok.FaIdom;
import java.util.List;
import idomok.FaIdom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;

public class FaIdomok {

    private List<FaIdom> idomok;

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
        idomok = new ArrayList();
        idomok.add(new Gomb(3));
        idomok.add(new Gomb(1.5));
        idomok.add(new Hasab(3, 3, 2));
        idomok.add(new Hasab(1, 0.5, 6));
       
    }
    
}
