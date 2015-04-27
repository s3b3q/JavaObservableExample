
package javaobservableexample;

import static java.lang.Thread.sleep;

/**
 *
 * @author sstaniak
 */
public class JavaObservableExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Magazyn magazyn = new Magazyn();

        Producent prod1 = new Producent(magazyn);
        Producent prod2 = new Producent(magazyn);
        Producent prod3 = new Producent(magazyn);
        
        Konsument kons1 = new Konsument(magazyn);
        Konsument kons2 = new Konsument(magazyn);

        magazyn.addObserver(prod1);
        magazyn.addObserver(prod2);
        magazyn.addObserver(prod3);
        magazyn.addObserver(kons1);
        magazyn.addObserver(kons2);
        

        while (true) {
            if (magazyn.maMiejsce()) {
                magazyn.notifyObservers();
            }
            if (magazyn.saElementy()) {
                magazyn.notifyObservers();
            }
            sleep(2000);
        }
    }

}
