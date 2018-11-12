/*
 * Una ruta intercontinental es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen i continent 
 * de destí
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaIntercontinental {

    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaIntercontinental(String pCodi,String pAeroportOri,String pAeroportDes,String pPaisOri,String pPaisDes,String pContinentOri,String pContinentDes,double pDistancia){
        codi = pCodi;
        aeroportOri = pAeroportOri;
        aeroportDes = pAeroportDes;
        paisOri = pPaisOri;
        paisDes = pPaisDes;
        continentOri = pContinentOri;
        continentDes = pContinentDes;
        distancia = pDistancia;
    }
    
    /*
    Mètodes accessors
    */
    
    public String getCodi() {
        return codi;
    }

    public String getAeroportOri() {
        return aeroportOri;
    }

    public String getAeroportDes() {
        return aeroportDes;
    }

    public String getPaisOri() {
        return paisOri;
    }

    public String getPaisDes() {
        return paisDes;
    }

    public String getContinentOri() {
        return continentOri;
    }

    public String getContinentDes() {
        return continentDes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setAeroportOri(String aeroportOri) {
        this.aeroportOri = aeroportOri;
    }

    public void setAeroportDes(String aeroportDes) {
        this.aeroportDes = aeroportDes;
    }

    public void setPaisOri(String paisOri) {
        this.paisOri = paisOri;
    }

    public void setPaisDes(String paisDes) {
        this.paisDes = paisDes;
    }

    public void setContinentOri(String continentOri) {
        this.continentOri = continentOri;
    }

    public void setContinentDes(String continentDes) {
        this.continentDes = continentDes;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


   /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta intercontinental.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaIntercontinental novaRutaIntercontinental() {
        Scanner in= new Scanner(System.in);
        String codi, aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes;
        double distancia;
        
        System.out.println("Digueu-me el codi de la ruta intercontinental: "); codi = in.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = in.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = in.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = in.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = in.nextLine();
        System.out.println("Digueu-me el continent origen: "); continentOri = in.nextLine();
        System.out.println("Digueu-me el continent destí: "); continentDes = in.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = in.nextDouble();
        
        RutaIntercontinental newRutaIntercontinental = new RutaIntercontinental(codi,aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes,distancia);
        
        return newRutaIntercontinental;
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los.
    
     Retorn: cap
     */
    public void modificarRutaIntercontinental() {
        Scanner in= new Scanner(System.in);
        String codi, aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes;
        double distancia;
        
        System.out.println("VALORS ACTUALS");
        mostrarRutaIntercontinental();
        System.out.println("");
        System.out.println("VALOS A MODIFICAR");
        System.out.println("Digueu-me el codi de la ruta intercontinental: "); codi = in.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = in.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = in.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = in.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = in.nextLine();
        System.out.println("Digueu-me el continent origen: "); continentOri = in.nextLine();
        System.out.println("Digueu-me el continent destí: "); continentDes = in.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = in.nextDouble();
        
        setCodi(codi);
        setAeroportOri(aeroportOri);
        setAeroportDes(aeroportDes);
        setPaisOri(paisOri);
        setPaisDes(paisDes);
        setContinentOri(continentOri);
        setContinentDes(continentDes);
        setDistancia(distancia);
    }

    public void mostrarRutaIntercontinental() {
        System.out.println("\nLes dades de la ruta intercontinental amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nContinent d'origen: " + getContinentOri());
        System.out.println("\nContinent de destí: " + getContinentDes());
        System.out.println("\nDistància: " + getDistancia());
    }
}

    

