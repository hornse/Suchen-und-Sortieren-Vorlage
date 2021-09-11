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

public class Sortieren_Brian
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
    public Sortieren_Brian()
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
    public Sortieren_Brian(int pGroesse)
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
    public Sortieren_Brian(int pGroesse, int pMaxZahl)
    {
        this.zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random();
        for(int i = 0; i<this.zZahlenarray.length; i++) this.zZahlenarray[i] = zZufallsgenerator.nextInt(pMaxZahl);
    }

    /**
     * Methode bfmsZufall
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum
     * von 0 - 1000 befüllt
     */
    public void bfmsZufall()
    {
        //Mit Hilfe der Methode nextInt(int pInt) der Klasse Random kann eine Zufallszahl im Spektrum
        // von 0 - pInt erzeugt werden Bs.p: der Aufruf zZufallsgenerator.nextInt(1000) erzeugt eine Zufallszahl im Spektrum
        // von 0 - 1000
    }

    /**
     * Methode bfmsZufallflex
     * Auftrag: Nach dem Aufruf dieser Methode ist das Array zZahlenarray mit zufälligen Zahlen im Spektrum
     * von 0 - pMaxZahl befüllt.
     */
    public void bfmsZufallflex(int pMaxZahl)
    {
        // Dein Quellcode hier
    }


    /**
     * Method bfms
     * Auftrag: Nach dem Aufruf der Methode ist das Array zZahlenarray mit aufsteigenden Zahlenwerten
     * beginnend bei 1 und einer Schrittweite von 1 gefuellt.
     *
     */
    public void bfms()
    {
        for(int i = 0; i < 30; i++)
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
     */
    public void bubblesort()
    {   
         // dieser loop geht einmal durch den array durch
         for(int i = 0; i < zZahlenarray.length; i++){  
             /**
              * dieser loop geht immer bis zu dem array bis zu dem ende minus dem index,
              * da nach einem durchgang die letzte zahl sortiert ist
              * und - 1, da neben rechts der letzten zahl nichts ist
              */
             for(int j = 0; j < zZahlenarray.length - i - 1; j++){  
                 // wir gucken ob die zahl rechts neben von dem aktuellen index kleiner ist
                 if(zZahlenarray[j] > zZahlenarray[j + 1]){   
                     // wir vertauschen die beiden zahlen
                     int temp = zZahlenarray[j];  
                     zZahlenarray[j] = zZahlenarray[j + 1];  
                     zZahlenarray[j + 1] = temp;  
                 }  
             }  
         }  
    }

    public void bubblesort_2()
    {   
        // dieser loop geht einmal durch den array durch
        int i = 0;
        boolean sort = false;
        while(!sort){  
             sort = true;
             /**
              * dieser loop geht immer bis zu dem array bis zu dem ende minus dem index,
              * da nach einem durchgang die letzte zahl sortiert ist
              * und - 1, da neben rechts der letzten zahl nichts ist
              */
             for(int j = 0; j < zZahlenarray.length - i - 1; j++){  
                 // wir gucken ob die zahl rechts neben von dem aktuellen index kleiner ist
                 if(zZahlenarray[j] > zZahlenarray[j + 1]){   
                     // wir vertauschen die beiden zahlen
                     int temp = zZahlenarray[j];  
                     zZahlenarray[j] = zZahlenarray[j + 1];  
                     zZahlenarray[j + 1] = temp;
                     sort = false;
                 }  
             }  
             i++;
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
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        for (int i = 1; i <= zZahlenarray.length - 1; i++)
        {   
            // wir gucken ob die links zahl größer ist als die rechte
            if(zZahlenarray[i - 1] > zZahlenarray[i]) {
                /**
                 * das i > -1 sorgt dafür das die kleinste zahl des arrays nicht 
                 * zu weit nach links geschoben wird ( out of bounds )
                 * wir loopen so lange bis die linke zahl größer ist als die aktuelle
                 */
                while( (i > -1) && zZahlenarray[i - 1] > zZahlenarray[i]) {
                    // wir vertauschen die beiden zahlen und gehen eins nach rechts
                    int temp = zZahlenarray[i];  
                    zZahlenarray[i] = zZahlenarray[i - 1];  
                    zZahlenarray[i - 1] = temp;  
                    i--;
                }
            }    
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
        // wir gehen durch den ganzen loop, - 1 weil die letzte zahl nichts rechts von ihr hat
        for(int i = 0; i < zZahlenarray.length - 1; i++) { 
            // wir deklarieren den index mit der niedrigsten zahl als die aktuelle zahl
            int lowest = i;
            // wir gehen durch den restlichen array und suchen immer einer niedrigere zahl
            for(int j = i + 1; j < zZahlenarray.length; j++) {  
                if(zZahlenarray[j] < zZahlenarray[lowest]){
                    // deklarierung des index mit der (aktuellen) niedgristen zahl
                    lowest = j;
                }
            }
            
            // wir vertauschen den aktuellen index mit dem der niedrigsten
            int temp = zZahlenarray[i];
            zZahlenarray[i] = zZahlenarray[lowest];  
            zZahlenarray[lowest] = temp;
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
        System.out.print("Test\n");
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
        int hRechts = pR; // Hilfszeiger f¸r recht
        if (pL < pR)
        {
            int pi = partition(pL, pR);
            quicksort_intern(pL, pi-1);
            quicksort_intern(pi+1, pR);
            //for(int i = 0; i< this.zZahlenarray.length; i++)System.out.println(this.zZahlenarray[i]);
        }
    }

    public void tauschen( int j, int i)
    {
        int temp = this.zZahlenarray[i];
        this.zZahlenarray[i] = this.zZahlenarray[j];
        this.zZahlenarray[j] = temp;
    }

    public static void main(String[] args){
        System.out.println("Beginne neuen Sortiervorgang mit Quicksort");
        Sortieren_Brian test = new Sortieren_Brian(10, 10);
        int[] array = test.zZahlenarray;
        for(int i = 0; i< test.zZahlenarray.length; i++)System.out.println((int) test.zZahlenarray[i]);
        test.quickSort(); 
        for(int i = 0; i< test.zZahlenarray.length; i++)System.out.print( array[i]);
        System.out.println("Sortiert: ");
        for(int i = 0; i< test.zZahlenarray.length; i++)System.out.println((int) test.zZahlenarray[i]);
    }



    public int partition( int lowest,int highest)
    {
        int hPivot = (int) (Math.random()*(highest-lowest+1))+lowest; // Stelle des Pivot
        int teile = lowest - 1;
        tauschen(hPivot, highest);
        hPivot = this.zZahlenarray[highest];
        for(int suche = lowest;  suche < highest; suche++)
        {
            if(this.zZahlenarray[suche] < hPivot)
            {
                teile++;
                tauschen(teile, suche);
            }
        }

        tauschen(teile+1, highest);
        return (teile+1);
    }

    public void mergeSort()
    {

    }


    private void merge_intern(int links, int mitte, int rechts)
    {
        int i,j,k;
        i = 0;
        j = links;
        int []b = new int [mitte - links +1];
        while (j <= mitte)
        {
            b[i] = zZahlenarray[j];
            i++;
            j++;
        }
        i = 0;
        k= links;
        while(k<j && j>= rechts)
        {
            if(b[i] <=zZahlenarray[j])
            {
                zZahlenarray[k] = b[i];
                k++;
                i++;
            }
            else
            {
                zZahlenarray[k] = zZahlenarray[j];
                k++;
                j++;
            }
        }
        while(k<j)
        {
            zZahlenarray[k] = b[i];
            k++;
            i++;
        }
    }

    public boolean binaereSuche(int pGesuchteZahl)
    {
        boolean gefunden = binaereSuche_intern(pGesuchteZahl,0, zZahlenarray.length -1);
        return gefunden;
    }

    private boolean binaereSuche_intern(int pZahl, int pBeginn, int pEnde)
    {
        //Dein Quellcode hier
        return true;
    }
    

}
