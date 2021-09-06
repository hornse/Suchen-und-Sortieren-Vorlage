//Das Java Paket Random wird benötigt, um mit Hilfe eines Objektes der klasse Random Zufallszahlen zu erzeugen.
import java.util.Random;
import java.util.Arrays;
/**
 * Mit Hilfe von Objekten der Klasse Sortierer koennen Zahlenwerte, die in einem Array gespeichert sind,
 * der groesse nach von klein nach groß sortiert werden.
 * Hierfuer stehen drei unterschiedliche Verfahren zur Verfuegung: Bubblesort, Selectionsort und Insertionsort
 * Fuer die Erzeugung von Zufallszahlen steht die Klasse Random zur Verfügung, die zuvor siehe 1. Zeile importiert 
 * werden muss.
 * 
 * @author Sebastian Horn
 * @version 0.1
 */

public class Sortieren_Jodie
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
    public Sortieren_Jodie()
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
    public Sortieren_Jodie(int pGroesse)
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
    public Sortieren_Jodie(int pGroesse, int pMaxZahl)
    {  
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
        bfmsZufallflex(pMaxZahl);
    }

    /**
     * Methode bfmsZufall
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - 1000 befüllt
     */
    public void bfmsZufall()
    {         
        for(int i = 0; i < zZahlenarray.length; i++) {
            zZahlenarray[i] = zZufallsgenerator.nextInt(1000);
        }
    }

    /**
     * Methode bfmsZufallflex
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum 
     * von 0 - pMaxZahl befüllt.
     */
    public void bfmsZufallflex(int pMaxZahl)
    {
        for(int i = 0; i < zZahlenarray.length; i++) {
            zZahlenarray[i] = zZufallsgenerator.nextInt(pMaxZahl);
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
            zZahlenarray[i]= i +1;
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
     * 
     * Beim Bubblesort wird die im Array links stehenden Zahl mit der rechts stehenden Zahl verglichen, wenn die links stehende Zahl
     * kleiner ist werden die Zahlen vertauscht.
     * 
     */
    public void bubblesort()
    {   boolean sortiert = false;
        while ( !sortiert)

        {
            sortiert = true;
            for (int j = 0; j< zZahlenarray.length-1; j++) {
                if(zZahlenarray[j]> zZahlenarray[j+1]) {
                    int temp = zZahlenarray[j];
                    zZahlenarray[j] = zZahlenarray[j+1];
                    zZahlenarray[j+1] = temp;
                    sortiert = false;
                }

            }

        }
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
     * 
     * Insertionsort arbeitet, indem immer eine Zahl abgespeichert wird und sie dann mit jeder anderen Zahl verglichen wird
     * bis eine kleinere gefunden wurde. Falls eine gefunden wird werden sie getauscht und es wird zur nächsten Zahl übergegangen.
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int i=1; i<= zZahlenarray.length-1; i++)
        {   int temp = zZahlenarray[i];
            int j = i;
            while (j > 0 && zZahlenarray[j - 1] > temp) {
                zZahlenarray[j] = zZahlenarray[j - 1];
                j--;
            }
            zZahlenarray[j] = temp;

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
     * Der Algorithmus funktioniert wie bubblesort. Er unterscheidet sich darin, dass von rechts nach links durchgeführt wird.
     */

    public void selectionSort()
    {
        //Tipp: Auch hier werden 2 Schleifen benötigt
        for (int i = 0; i < zZahlenarray.length - 1; i++) {
            for (int j = i + 1; j < zZahlenarray.length; j++) {
                if (zZahlenarray[i] > zZahlenarray[j]) {
                    int temp = zZahlenarray[i];
                    zZahlenarray[i] = zZahlenarray[j];
                    zZahlenarray[j] = temp;
                }
            }
        }
    }    

    /**
     * Methode lineareSuche
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     * 
     *  Es wird durch das Array durgegangen und die übergebene Zahl mit der vom Nutzer eingeben Zahl verglichen.
     * 
     */
    public boolean lineareSuche(int pZahl)
    {   for ( int i = 0; i < zZahlenarray.length; i++) {    
            if ( zZahlenarray[i] == pZahl)
            { return true;
            }
        }
        return false;
    }

    /**
     * Methode print
     *
     * Das Array wird in der Konsole ausgegeben
     */    

    public void print() {
        System.out.println(Arrays.toString(zZahlenarray));
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
        while ( hLinks < hRechts){ 
            while ( zZahlenarray[hLinks] < zZahlenarray[hPivot] && hLinks < pR) {
             hLinks++;
            }
            while (zZahlenarray[hPivot] <zZahlenarray[hRechts] && hRechts>pL) {
                hRechts--;
            }
            if (hLinks < hRechts) {
                int temp = zZahlenarray[hLinks];
                zZahlenarray[hLinks] = zZahlenarray[hRechts];
                zZahlenarray[hRechts] = temp;
                hLinks++;
                hRechts--;
            }
            int temp = zZahlenarray[hLinks];
            zZahlenarray[hLinks] = zZahlenarray  [hPivot];
            zZahlenarray[hPivot] = temp;
            if (pL < hRechts){
                quicksort_intern(pL, hRechts);
            }
            if (hLinks<pR) {
                quicksort_intern(hLinks, pR);
            }
        }
    }
}

