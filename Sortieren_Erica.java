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

public class Sortieren_Erica
{            
    
    //Deklaration der globalen Variablen/Zustandvariablen
    private int zMaxZahl;
    private int s;
    private int zZahlenarray[];
    private Random zZufallsgenerator;
    private int zZaehler;
            
    //Methoden/ Eigenschaften von Objekten der klasse Sortieren_Erica 
    
    /**
     * Konstruktor der Klasse Sortieren_Erica. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Erica erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Erica()
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [30];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 2. Konstruktor der Klasse Sortieren_Erica. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Erica erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     */
    public Sortieren_Erica(int pGroesse)
    {  
        //Zustandvariablen werden initialisiert
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random(); 
    }
    
    /**
     * 3. Konstruktor der Klasse Sortieren_Erica. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
     * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Erica erzeugt worden. Ein Array 
     * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
     * zur Erzeugung von Zufallszahlen erzeugt und das Array mit Zufallszahlen im Zahlenspektrum von 0 - pMaxZahl befuellt.
     * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
     * 
     * @param int pGroesse gibt die Groesse des Arrays an
     * @param int pMaxZahl gibt die groesste moegliche zu erzeugenden Zufallszahl an
     */
    public Sortieren_Erica(int pGroesse, int pMaxZahl)
    {  
        //Zustandvariablen werden initialisiert
        //Dein Quellcode hier
        zZahlenarray = new int [pGroesse];
        zZufallsgenerator = new Random();
        zMaxZahl = pMaxZahl;
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
        for (int i=0; i<zZahlenarray.length; i++)
        {
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
       // Dein Quellcode hier
       for (int i=0; i<zZahlenarray.length; i++)
        {
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
       //Dein Quellcode
       int s = 0;
       zZaehler = 0;
       for (int i=0; i<zZahlenarray.length; i++)
       {
           for (int j=0; j<zZahlenarray.length-1; j++)
           {
               if(zZahlenarray[j] > zZahlenarray[j+1])
               {
                    s = zZahlenarray[j];
                    zZahlenarray[j] = zZahlenarray[j+1];
                    zZahlenarray[j+1] = s;
                    
                    zZaehler = zZaehler + 6;
               }
               zZaehler = zZaehler + 2;
           }
           zZaehler = zZaehler + 2;
       }
    }
    public void bubblesortoptimiert()
    {   
       //Dein Quellcode
       int s;
       zZaehler = 0;
       boolean swap = true;
       while (swap == true)//solange swap auf true gesetzt ist, führe aus:
       {
           swap = false;
           for (int j = 0; j < zZahlenarray.length-1; j++) //für jedes j(also jeden Index), dass kleiner als die Groeße des Arrays ist
           {
               if(zZahlenarray[j] > zZahlenarray[j+1])//wenn der Index j größer also der folgende Index ist, führe aus:
               {
                   //Dreieckstausch
                   s = zZahlenarray[j];
                   zZahlenarray[j] = zZahlenarray[j+1];
                   zZahlenarray[j+1] = s;
                   s = 0;
                   swap = true;//weil getauscht wurde, setzt swap auf true
                   zZaehler = zZaehler + 6;//erhoeht zZaehler um 6
               }
               
               
               zZaehler = zZaehler + 2;//erhoeht zZaehler um 2
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
     */
    public void insertionsort()
    {   
        //Tipp: i = 1
        
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
        
        if(pL<pR && hPivot>=0)// Wenn Array Auschnitt nur ein Element ist, ist die Bedingung unwahr
        { 
            while(hLinks!=hRechts)// Abbruchbedingung: Wenn linkes und rechtes Element aufeinader treffen
            { 
                if(zZahlenarray[hLinks] > zZahlenarray[hPivot] || hLinks== hPivot)// Prüfen ob linkes Element für Tausch bereit ist
                { 
                    if(zZahlenarray[hRechts] < zZahlenarray[hPivot] || hRechts == hPivot)// Prüfen ob rechtes Element für Tausch bereit ist
                    { 
                        // Beide Elemente sind für Tausch bereit
                        //Dreieckstasuch wird durchgeführt
                        int zwischen = zZahlenarray[hRechts];
                        zZahlenarray[hRechts] = zZahlenarray[hLinks];
                        zZahlenarray[hLinks] = zwischen;
                        
                        // Ändeung der Stelle vom Pivoelement, wenn diese verändert wurde
                        if(hLinks == hPivot)
                        {
                            hPivot = hRechts;
                        }
                        
                        else if(hRechts == hPivot)
                        {
                            hPivot = hLinks;
                        }
                        
                        // Verschiebung der Zeiger, wenn jeweiliger auf richtiger Seite vom Pivotelement
                        if(hLinks < hPivot)
                        {
                            hLinks ++;
                        }
                        
                        if(hRechts > hPivot)
                        {
                            hRechts --;
                        }
                        
                        
                    
                    }
                    else
                    {
                        hRechts --; // Verschiebung des rechten Zeiger wenn noch nicht für Tausch bereit
                    }
                    
                }
                else
                {
                    hLinks ++; // Verschiebung des linken Zeiger wenn noch nicht für Tausch bereit
                    
                    if(zZahlenarray[hRechts] >= zZahlenarray[hPivot] && hRechts > hPivot)
                    {
                        hRechts --; // Verschiebung von rechten Zeiger wenn noch nicht für Tausch bereit
                    }
                    
                }
            }
        }
        
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
    
    /**
     * Methode lineareSuche
     *
     * @param pZahl Angabe der zu suchenden zahl
     * @return true wenn die Zahl gefunden wurde, sonst false
     */
    public boolean lineareSuche(int pZahl)
    {      
       //
       for (int i = 0; i<zZahlenarray.length; i++)
       {
           if (zZahlenarray[i] == pZahl)
           {
               return true;
           }
       }
       return false;
    }    
}
