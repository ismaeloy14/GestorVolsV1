/*
 * Una ruta internacional es defineix pel seu codi, aeroport d’origen, aeroport 
 * de destí, distància, país d’origen i país de destí
 */
package components;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaInternacional {
    private final static Scanner DADES= new Scanner(System.in);
    private String codi;
    private String aeroportOri;
    private String aeroportDes;
    private String paisOri;
    private String paisDes;
    private double distancia;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaInternacional(String codi,String aeroportOri,String aeroportDes,String paisOri,String paisDes,double distancia){
        this.codi = codi;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.paisOri = paisOri;
        this.paisDes = paisDes;
        this.distancia = distancia;
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

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta internacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports països no tene per què estar formats per una única 
    paraula, per exemple, El Prat o Regne Unit.
     */
    public static RutaInternacional novaRutaInternacional() {
        String codi, aeroportOri,aeroportDes,paisOri,paisDes;
        double distancia;
        
        System.out.println("Digueu-me el codi de la ruta internacional: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = DADES.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();     
        
        RutaInternacional newRutaInternacional = new RutaInternacional(codi,aeroportOri,aeroportDes,paisOri,paisDes,distancia);
        
        return newRutaInternacional;
        
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
    public void modificarRutaInternacional() {
        
        String codi, aeroportOri,aeroportDes,paisOri,paisDes;
        double distancia;
        
        System.out.println("VALORS ACTUALS");
        mostrarRutaInternacional();
        System.out.println("");
        System.out.println("VALOS A MODIFICAR");
        System.out.println("Digueu-me el codi de la ruta intercontinental: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país origen: "); paisOri = DADES.nextLine();
        System.out.println("Digueu-me el país destí: "); paisDes = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();
        
        setCodi(codi);
        setAeroportOri(aeroportOri);
        setAeroportDes(aeroportDes);
        setPaisOri(paisOri);
        setPaisDes(paisDes);
        setDistancia(distancia);
    }

    public void mostrarRutaInternacional() {
        System.out.println("\nLes dades de la ruta internacional amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
         System.out.println("\nPaís d'origen: " + getPaisOri());
        System.out.println("\nPaís de destí: " + getPaisDes());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}
