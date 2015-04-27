
package javaobservableexample;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author sstaniak
 */
public class Konsument implements Observer{

    private Magazyn m = null;

    public Konsument(Magazyn m) {
        this.m = m;
    }
    
    
    @Override
    public void update(Observable obs, Object arg) {
       if(m == obs){
           if(m.saElementy()){
               m.konsumuj();
               System.out.println("zjedzono, teraz jest: "+m.getProdukty());
           }
       }
    }
    
    
    
}
