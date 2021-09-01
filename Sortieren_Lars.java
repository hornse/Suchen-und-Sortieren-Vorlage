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
    
    public class Sortieren_Lars
    {            
        
        //Deklaration der globalen Variablen/Zustandvariablen
        private int zZahlenarray[];
        private Random zZufallsgenerator;
                
        //Methoden/ Eigenschaften von Objekten der klasse Sortieren_Lars 
        
        /**
         * Konstruktor der Klasse Sortieren_Lars. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
         * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren_Lars erzeugt worden. Ein Array 
         * mit dem Namen zZahlenarray und der Grösse 30 wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
         * zur Erzeugung von Zufallszahlen erzeugt.
         * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
         */
        public Sortieren_Lars()
        {  
            //Zustandvariablen werden initialisiert
            zZahlenarray = new int [30];
            zZufallsgenerator = new Random(); 
            bfmsZufall();
        }
        
        /**
         * 2. Konstruktor der Klasse Sortieren. Im Konstruktor werden die zuvor deklarieten Zustandsvariablen
         * erzeugt. Nach dem Aufruf des Konstruktors ist ein Objekt der Klasse Sortieren erzeugt worden. Ein Array 
         * mit dem Namen zZahlenarray und einer variablen Groesse wurde erzeugt. Des Weiteren wurde ein Objekt der Klasse Random 
         * zur Erzeugung von Zufallszahlen erzeugt.
         * Es kann mehrer Konstruktoren geben, diese unterscheiden sich in den/ dem Parameter(n).
         */
        public Sortieren_Lars(int pGroesse)
        {  
            //Zustandvariablen werden initialisiert
            zZahlenarray = new int [pGroesse];
            zZufallsgenerator = new Random(); 
            bfmsZufall();
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
        public Sortieren_Lars(int pGroesse, int pMaxZahl)
        {  
            //Zustandvariablen werden initialisiert
            //Dein Quellcode hier
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
            //Mit Hilfe der Methode nextInt(int pInt) der Klasse Random kann eine Zufallszahl im Spektrum
            // von 0 - pInt erzeugt werden Bs.p: der Aufruf zZufallsgenerator.nextInt(1000) erzeugt eine Zufallszahl im Spektrum 
            // von 0 - 1000
            for(int i=0; i<zZahlenarray.length; i++){
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
           for(int i=0; i<zZahlenarray.length; i++){
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
           int index = 0;
           // Äußere Schleife
           boolean flac = true;
           while (index < zZahlenarray.length && flac){
               int inIndex = 1;
               flac = false;
               while(inIndex < zZahlenarray.length -index){
                   if(zZahlenarray[inIndex]<zZahlenarray[inIndex-1]){
                    int zwischen = zZahlenarray[inIndex];
                    zZahlenarray[inIndex] = zZahlenarray[inIndex -1];
                    zZahlenarray[inIndex-1] = zwischen;
                    flac = true;
                    
                    
                    }
                    inIndex++;
                }
                index++;
           
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
            int index = 1;
            while(index < zZahlenarray.length){
                int Zahl = zZahlenarray[index]; // einzuordnende Zahl
                int einIndex = index; //einzuordner Index -->
                boolean abbruch = false;
                while(einIndex>0 && !abbruch){
                    if (Zahl<zZahlenarray[einIndex-1]){
                       einIndex--; 
                    }else{
                        abbruch = true;
                    }
                }
                
                //Nun beginnt die Rückubg der Elemente nach rechts
                int zwischenVor = zZahlenarray[einIndex]; // Wert vor Vertauschung der verschwidet
                int zwischenNach = Zahl;
                while(einIndex <= index){
                    zwischenVor = zZahlenarray[einIndex];
                    zZahlenarray[einIndex] = zwischenNach;
                    zwischenNach = zwischenVor;
                    einIndex ++;
                
             
                }
           index++;
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
        int index = 0;
        while(index<zZahlenarray.length){
            int inIndex = index;
            int kleinst = zZahlenarray[inIndex];
            while(inIndex < zZahlenarray.length-1){
                if(zZahlenarray[inIndex+1]<kleinst){
                    int zwischen = kleinst;
                    kleinst = zZahlenarray[inIndex+1];
                    zZahlenarray[inIndex +1] = zwischen;
                    
                }
                inIndex++;
            }
            zZahlenarray[index] = kleinst;
            index ++;
           
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
