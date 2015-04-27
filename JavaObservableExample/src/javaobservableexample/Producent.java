
package javaobservableexample;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author sstaniak
 */
public class Producent implements Observer{

    private Magazyn m = null;

    public Producent(Magazyn m) {
        this.m = m;
    }
    
    
    @Override
    public void update(Observable obs, Object arg) {
       if(m == obs){
           if(m.maMiejsce()){
               m.produkuj();
               System.out.println("wyprodukowano, teraz jest: "+m.getProdukty());
           }
       }
    }
    
    
    
}
