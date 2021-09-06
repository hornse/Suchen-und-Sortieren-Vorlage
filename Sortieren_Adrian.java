//Das Java Paket Random wird benötigt, um mit Hilfe eines Objektes der klasse Random Zufallszahlen zu erzeugen.
import java.util.Random;
/**
 * Mit Hilfe von Objekten der Klasse Sortierer koennen Zahlenwerte, die in einem Array gespeichert sind,
 * der groesse nach von klein nach groß sortiert werden.
 * Hierfuer stehen drei unterschiedliche Verfahren zur Verfuegung: Bubblesort, Selectionsort und Insertionsort
 * Fuer die Erzeugung von Zufallszahlen steht die Klasse Random zur Verfügung, die zuvor siehe 1. Zeile importiert 
 * werden muss.
 * 
 * @author Sebastian Horn
 * @version 0.2
 */

public class Sortieren_Adrian
{            
    
    //Deklaration der globalen Variablen/Zustandvariablen
    private int zzahlenarray[];
    private Random zzufallsgenerator;
            
    //Methoden/ Eigenschaften von Objekten der klasse Sortieren_Adrian 
    
    /**
     * Konstruktor der Klasse Sortieren_Adrian. Im Konstruktor werden die zuvor deklarieten zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Adrian erzeugt worden. Ein Array 
     * mit dem Namen zzahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Adrian()
    {  
        //zustandvariablen werden initialisiert
        zzahlenarray = new int [30];
        zzufallsgenerator = new Random(); 
    }
    
    /**
     * 2. Konstruktor der Klasse Sortieren_Adrian. Im Konstruktor werden die zuvor deklarieten zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Adrian erzeugt worden. Ein Array 
     * mit dem Namen zzahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Adrian(int pGroesse)
    {  
        //zustandvariablen werden initialisiert
        zzahlenarray = new int [pGroesse];
        zzufallsgenerator = new Random(); 
    }
    
    /**
     * 3. Konstruktor der Klasse Sortieren_Adrian. Im Konstruktor werden die zuvor deklarieten zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Adrian erzeugt worden. Ein Array 
     * mit dem Namen zzahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von zufallszahlen erzeugt und das Array mit zufallszahlen im zahlenspektrum von 0 - pMaxzahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxzahl gibt die groesste moegliche zu erzeugenden zufallszahl an
     */
    public Sortieren_Adrian(int pGroesse, int pMaxzahl)
    {  
        //zustandvariablen werden initialisiert
        //Dein Quellcode hier
    }
    
    /**
     * Methode bfmszufall
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zzahlenarray mit zufälligen zahlen im Spektrum 
     * von 0 - 1000 befüllt
     */
    public void bfmszufall()
    {         
        //Mit Hilfe der Methode nextInt(int pInt) der Klasse Random kann eine zufallszahl im Spektrum
        // von 0 - pInt erzeugt werden Bs.p: der Aufruf zzufallsgenerator.nextInt(1000) erzeugt eine zufallszahl im Spektrum 
        // von 0 - 1000
    }
    
    /**
     * Methode bfmszufallflex
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zzahlenarray mit zufälligen zahlen im Spektrum 
     * von 0 - pMaxzahl befüllt.
     */
    public void bfmszufallflex(int pMaxzahl)
    {
       // Dein Quellcode hier
    }


    /**
     * Method bfms
     * Auftrag: Nach dem Aufruf der Methode ist das Array zzahlenarray mit aufsteigenden zahlenwerten 
     * beginnend bei 1 und einer Schrittweite von 1 gefuellt.
     *
     */
    public void bfms()
    { 
        for(int i = 0; i < 30; i++)
        {
            zzahlenarray[i]= i +1; 
        }
    }
    
    
    /**
     * Method bubblesort
     * Auftrag: Nach Aufruf der Methode ist das Array zzahlenarray nach dem Prinzip Bubblesort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!! Hilfe zum Prinzip findest du unter:
     * https://www.youtube.com/watch?v=lyzQPjUT5B4 und im Buch!!!!!
     * 
     * Hierfür muss das Array vorher mit zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    
    
    public void bubblesort()
    {
           for(int i = 0; i < zzahlenarray.length; i++){
           for(int j = 0; j < zzahlenarray.length-1; j++){
               if (zzahlenarray[j] > zzahlenarray[j+1]){
                   int hilfint;
                   hilfint = zzahlenarray[j];
                   zzahlenarray[j] = zzahlenarray[j+1];
                   zzahlenarray[j+1] = hilfint;
               }
           }
       }
    }    
    
    
    /**
     * Method insertionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zzahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!!Hilfe findest du hier:
     * https://www.youtube.com/watch?v=ROalU379l3U und im Buch.
     * 
     * Hierfür muss das Array vorher mit zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int i=1; i<=zzahlenarray.length-1; i++)
        {   
            
        }    
    }
    
    /**
     * Method selectionsort
     * Auftrag: Nach Aufruf der Methode ist das Array zzahlenarray nach dem Prinzip Insertionsort sortiert worden.
     * 
     * Eine ausführliche Beschreibung muss hier eurerseits erfolgen!!!!!!!!! Hilfe findest du hier:
     * https://www.youtube.com/watch?v=Ns4TPTC8whw und im Buch!!!
     * 
     * Hierfür muss das Array vorher mit zahlenwerten gefüllt worden sein d.h. eine der Methoden zum Befüllen des Arrays
     * muss aufgerufen worden sein.
     * Wenn nicht bricht BlueJ mit einer Fehlermedung ab.
     */
    public void selectionSort()
    {
        //Tipp: Auch hier werden 2 Schleifen benötigt
    }    
    
    
    /**
     * Methode lineareSuche
     *
     * @param pzahl Angabe der zu suchenden zahl
     * @return true wenn die zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pzahl)
    {      
       //
       return false;
    }    
}
