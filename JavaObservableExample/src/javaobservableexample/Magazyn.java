
package javaobservableexample;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author sstaniak
 */
public class Magazyn extends Observable{

    private int produkty;
    private int maxMiejsce;
    
    

    public Magazyn() {
        this.produkty = 0;
        this.maxMiejsce = 50;
    }

    public boolean maMiejsce() {
        if (produkty < maxMiejsce) {
            setChanged();
            return true;
        }
        return false;
    }
    
    public boolean saElementy() {
        if (produkty > 0) {
            setChanged();
            return true;
        }
        return false;
    }

    public int getProdukty() {
        return produkty;
    }

    public int getMaxMiejsce() {
        return maxMiejsce;
    }

    public void setProdukty(int produkty) {
        this.produkty = produkty;
    }

    public void setMaxMiejsce(int maxMiejsce) {
        this.maxMiejsce = maxMiejsce;
    }
    
    public void produkuj(){
        produkty++;
    }
    
     public void konsumuj(){
        produkty--;
    }

}
