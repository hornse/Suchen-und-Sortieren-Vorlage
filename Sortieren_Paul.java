//Das Java Paket Random wird benötigt, um mit Hilfe eines Objektes der klasse Random Zufallszahlen zu erzeugen.
import java.util.Random;
/**
 * Mit Hilfe von Objekten der Klasse Sortierer koennen Zahlenwerte, die in einem Array gespeichert sind,
 * der groesse nach von klein nach groß sortiert werden.
 * Hierfuer stehen drei unterschiedliche Verfahren zur Verfuegung: Bubblesort, Selectionsort und Insertionsort
 * Fuer die Erzeugung von Zufallszahlen steht die Klasse Random zur Verfügung, die zuvor siehe 1. Zeile importiert 
 * werden muss.
 * 
 * @author Paul Drösser
 * @version 1.0
 */

public class Sortieren_Paul
{            

    //Deklaration der globalen Variablen/Zustandvariablen
    private int zZahlenarray[];
    private Random zZufallsgenerator;

    //Methoden/ Eigenschaften von Objekten der klasse Sortieren 

    /**
     * Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Paul()
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [30];
        zZufallsgenerator = new Random(); 
    }

    /**
     * 2. Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Paul(int pGroesse)
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
    }

    /**
     * 3. Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt und das Array mit Zufallszahlen im Zahlenspektrum von 0 - pMaxZahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxZahl gibt die groesste moegliche zu erzeugenden Zufallszahl an
     */
    public Sortieren_Paul(int pGroesse, int pMaxZahl)
    {  
        zZahlenarray=new int [pGroesse];
        zZufallsgenerator=new Random(); 
        bfmsZufallflex(pMaxZahl);
    }

    /**
     * Methode bfmsZufall
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - 1000 befüllt
     */
    public void bfmsZufall()
    {         
        for(int i=0; i<zZahlenarray.length; i++) {
            zZahlenarray[i]=zZufallsgenerator.nextInt(1000);
        }
    }

    /**
     * Methode bfmsZufallflex
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - pMaxZahl befüllt.
     */
    public void bfmsZufallflex(int pMaxZahl)
    {
        for(int i=0; i<zZahlenarray.length; i++) {
            zZahlenarray[i]=zZufallsgenerator.nextInt(pMaxZahl);
        }
    }

    /**
     * Method bfms
     * Auftrag: Nach dem Aufruf der Methode ist das Array zZahlenarray mit aufsteigenden Zahlenwerten 
     * beginnend bei 1 und einer Schrittweite von 1 gefuellt.
     *
     */
    public void bfms()
    { 
        for(int i = 0; i < zZahlenarray.length; i++)
        {
            zZahlenarray[i]=i+1;
        }
    }

    /**
     * Method bubblesort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Bubblesort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!! Hilfe zum Prinzip findest du unter:
     * https://www.youtube.com/watch?v=lyZQPjUT5B4 und im Buch!!!!!
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void bubblesort()
    {   
        int pGroesse=zZahlenarray.length;  
        int temp=0;  
         for(int i=0; i<pGroesse; i++){  
                 for(int j=1;j<(pGroesse-i); j++){  
                          if(zZahlenarray[j-1]>zZahlenarray[j]){  
                                 temp=zZahlenarray[j-1];  
                                 zZahlenarray[j-1]=zZahlenarray[j];  
                                 zZahlenarray[j]=temp;  
                         }  
                 }  
         }  
    }
    public void optimized_bubblesort()
    {   
        int pGroesse=zZahlenarray.length;  
        int temp=0;  
        boolean Ende=false;
        do{
         for(int i=0; i<pGroesse; i++){  
                 for(int j=1;j<(pGroesse-i); j++){  
                          if(zZahlenarray[j-1]>zZahlenarray[j]){  
                                 temp=zZahlenarray[j-1];  
                                 zZahlenarray[j-1]=zZahlenarray[j];  
                                 zZahlenarray[j]=temp;  
                         }  
                         else{
                                 Ende=true;
                         }  
                 }  
         }  
        }while (Ende=false);
    }

    /**
     * Method insertionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!!Hilfe findest du hier:
     * https://www.youtube.com/watch?v=ROalU379l3U und im Buch.
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int i=1; i<=zZahlenarray.length-1; i++)
        {   
         int temp=zZahlenarray[i];
            while (i>0 && zZahlenarray[i-1] > temp) {
                zZahlenarray[i]=zZahlenarray[i - 1];
                i--;
            }
            zZahlenarray[i]=temp;   
        }   
    }

    /**
     * Method selectionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zZahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!! Hilfe findest du hier:
     * https://www.youtube.com/watch?v=Ns4TPTC8whw und im Buch!!!
     * 
     * Hierfür muss das Array vorher mit Zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void selectionSort()
    {
        //Tipp: Auch hier werden 2 Schleifen benötigt
        for (int i=0; i<zZahlenarray.length - 1; i++) {
            for (int j=i+1; j<zZahlenarray.length; j++) {
                if (zZahlenarray[i]>zZahlenarray[j]) {
                    int temp=zZahlenarray[i];
                    zZahlenarray[i]=zZahlenarray[j];
                    zZahlenarray[j]=temp;
                }
            }
}
}

    /**
     * Methode lineareSuche
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pZahl)
    {      
        //
        return false;
    }
    
    /**
     * Initiale Sortiermethode fuer den Quicksort-Algorithmus
     */
    public void quickSort()
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Beginne neuen Sortiervorgang mit Quicksort");
        //zeigeElementenfolge();
        quicksort_intern(0, zZahlenarray.length-1);        
        //zeigeElementenfolge();
        //System.out.println("--------------------------------------------------------------------");        
    } 
    
    private void quicksort_intern(int pL, int pR)
    {
        int hLinks = pL;  // Hilfszeiger f¸r links
        int hRechts = pR; // Hilfszeiger f¸r rechts
        int hPivot = (int) (Math.random()*(pR-pL+1))+pL; // Stelle des Pivot
        //dein Quellcode hier
    }
}
