/*
 * Un tripulant de cabina de passatgers (TCP) es defineix pel seu passaport, nom
 * , edat, data d’alta en la companyia, hores que porta de vol i rang
 */
package components;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author root
 */
public class TCP {

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta i rang.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut rang a null, ja que quan es crea un TCP, mai té rang.
     */
    public TCP(String passaport, String nom, int edat, LocalTime horesVol){
        Date data = new Date();
        
        this.passaport = passaport;
        this.nom = nom;
        this.edat = edat;
        this.horesVol = horesVol;
        this.dataAlta = data;
        this.rang = null;
    }

    /*
    Mètodes accessors
     */
    // Getters //
    public String getPassaport() {
        return passaport;
    }
    public String getNom() {
        return nom;
    }
    public int getEdat() {
        return edat;
    }
    public Date getDataAlta() {
        return dataAlta;
    }
    public LocalTime getHoresVol() {
        return horesVol;
    }
    public String getRang() {
        return rang;
    }
    // Setters //
    public void setPassaport(String passaport) {
        this.passaport = passaport;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public void setDataAlta(Date dataAlta) {
        this.dataAlta = dataAlta;
    }
    public void setHoresVol(LocalTime horesVol) {
        this.horesVol = horesVol;
    }
    public void setRang(String rang) {
        this.rang = rang;
    }
    

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou TCP.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
     */
    public static TCP nouTCP() {
       
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta i
     rang.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
    
     Retorn: cap
     *//*
    public void modificarTCP() {

    }*/

    public void mostrarTCP() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + getPassaport() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nEdat: " + getEdat());
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(getDataAlta()));
        System.out.println("\nHores de vol: " + getHoresVol().getHour() + ":" + getHoresVol().getMinute());
        System.out.println("\nRang: " + getRang());
    }

}