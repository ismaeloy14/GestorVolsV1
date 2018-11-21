/*
 * Una ruta nacional es defineix pel seu codi, aeroport d’origen, aeroport de 
 * destí, distància i país
 */
package components;

import java.util.Scanner;


/**
 *
 * @author root
 */
public class RutaNacional {
    private final static Scanner DADES= new Scanner(System.in);
    private String codi;
    private String pais;
    private String aeroportOri;
    private String aeroportDes;
    private double distancia;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public RutaNacional(String codi, String pais, String aeroportOri, String aeroportDes, double distancia){
        this.codi = codi;
        this.pais = pais;
        this.aeroportOri = aeroportOri;
        this.aeroportDes = aeroportDes;
        this.distancia = distancia;
    }

    /*
    Mètodes accessors
     */
    public String getCodi() {
        return codi;
    }

    public String getPais() {
        return pais;
    }

    public String getAeroportOri() {
        return aeroportOri;
    }

    public String getAeroportDes() {
        return aeroportDes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setAeroportOri(String aeroportOri) {
        this.aeroportOri = aeroportOri;
    }

    public void setAeroportDes(String aeroportDes) {
        this.aeroportDes = aeroportDes;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova ruta nacional.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que els aeroports no tene per què estar formats per una única 
    paraula, per exemple, El Prat.
     */
    public static RutaNacional novaRutaNacional() {
       
        String codi, aeroportOri,aeroportDes,pais;
        double distancia;
        
        System.out.println("Digueu-me el codi de la ruta nacional: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país: "); pais = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();     
        
        RutaNacional newRutaNacional = new RutaNacional(codi,pais,aeroportOri,aeroportDes,distancia);
        
        return newRutaNacional;
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
    public void modificarRutaNacional() {
        
        String codi, aeroportOri,aeroportDes,pais;
        double distancia;
        
        System.out.println("VALORS ACTUALS");
        mostrarRutaNacional();
        System.out.println("");
        System.out.println("VALOS A MODIFICAR");
        System.out.println("Digueu-me el codi de la ruta nacional: "); codi = DADES.next();
        System.out.println("Digueu-me l'aeroport origen: "); aeroportOri = DADES.nextLine();
        System.out.println("Digueu-me l'aeroport destí: "); aeroportDes = DADES.nextLine();
        System.out.println("Digueu-me el país origen: "); pais = DADES.nextLine();
        System.out.println("Digueu-me la distància: "); distancia = DADES.nextDouble();
        
        setCodi(codi);
        setAeroportOri(aeroportOri);
        setAeroportDes(aeroportDes);
        setPais(pais);
        setDistancia(distancia);
    }
    

    public void mostrarRutaNacional() {
        System.out.println("\nLes dades de la ruta nacional amb codi " + getCodi() + " són:");
        System.out.println("\nAeroport d'origen: " + getAeroportOri());
        System.out.println("\nAeroport de destí: " + getAeroportDes());
        System.out.println("\nDistància: " + getDistancia());
    }

    
}