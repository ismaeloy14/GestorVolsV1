/*
 * Una ruta transoceànica es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen, país de destí, continent d’origen, continent 
 * de destí i oceà que sobrevola.
 */
package components;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class RutaTransoceanica {
    private final static Scanner DADES= new Scanner(System.in);
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private String continentOri;
    private String continentDes;
    private String ocea;
    private double distancia;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaTransoceanica(String Codi,String AeroportOri,String AeroportDes,String PaisOri,String PaisDes,String ContinentOri,String ContinentDes,String Ocea,double Distancia){
        codi = Codi;
        aeroportOri = AeroportOri;
        aeroportDes = AeroportDes;
        paisOri = PaisOri;
        paisDes = PaisDes;
        continentOri = ContinentOri;
        continentDes = ContinentDes;
        ocea = Ocea;
        distancia = Distancia;
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

    public String getOcea() {
        return ocea;
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

    public void setOcea(String ocea) {
        this.ocea = ocea;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
   /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta transcoceanica.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports i països no tene per què estar formats
    per una única paraula, per exemple, El Prat i Regne Unit.
     */
    public static RutaTransoceanica novaRutaTransoceanica() {
        
        String codi, aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes,ocea;
        double distancia;
        
        System.out.println("Digueu-me el codi de la ruta transoceànica: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = DADES.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = DADES.nextLine();
        System.out.println("Digueu-me el continent origen: "); continentOri = DADES.nextLine();
        System.out.println("Digueu-me el continent destí: "); continentDes = DADES.nextLine();
        System.out.println("Digueu-me el ocà per on passa: "); ocea = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();
        
        RutaTransoceanica newRutaTransoceanica = new RutaTransoceanica(codi,aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes,ocea,distancia);
        
        return newRutaTransoceanica;
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
    public void modificarRutaTransoceanica() {
        String codi, aeroportOri,aeroportDes,paisOri,paisDes,continentOri,continentDes,ocea;
        double distancia;
        
        System.out.println("VALORS ACTUALS");
        mostrarRutaTransoceanica();
        System.out.println("");
        System.out.println("VALOS A MODIFICAR");
        System.out.println("Digueu-me el codi de la ruta intercontinental: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = DADES.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = DADES.nextLine();
        System.out.println("Digueu-me el continent origen: "); continentOri = DADES.nextLine();
        System.out.println("Digueu-me el continent destí: "); continentDes = DADES.nextLine();
        System.out.println("Digueu-me el ocà per on passa: "); ocea = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();
        
        setCodi(codi);
        setAeroportOri(aeroportOri);
        setAeroportDes(aeroportDes);
        setPaisOri(paisOri);
        setPaisDes(paisDes);
        setContinentOri(continentOri);
        setContinentDes(continentDes);
        setOcea(ocea);
        setDistancia(distancia);
    }

    public void mostrarRutaTransoceanica() {
        System.out.println("\nLes dades de la ruta transoceànica amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nContinent d'origen: " + getContinentOri());
        System.out.println("\nContinent de destí: " + getContinentDes());
        System.out.println("\nOceà que sobrevola: " + getOcea());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}

