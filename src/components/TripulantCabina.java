/*
 * Un tripulant de cabina es defineix pel seu passaport, nom, edat, data d’alta 
 * en la companyia, hores que porta de vol, rang i barres
 */
package components;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class TripulantCabina {

    private static Scanner DADES = new Scanner(System.in);

    private String passaport;
    private String nom;
    private int edat;
    private Date dataAlta;
    private LocalTime horesVol;
    private String rang;
    private int barres;
    
    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys dataAlta i barres.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar l'atribut dataAlta amb l'hora actual del sistema.
     - Inicialitzar l'atribut barres mitjançant el mètode pertinent d'aquesta classe.
     */
    public TripulantCabina (String pPassaport, String pNom, short pEdat, LocalTime pHoresVol, String pRang) {
        passaport=pPassaport;
        nom=pNom;
        edat=pEdat;
        horesVol=pHoresVol;
        rang=pRang;
        dataAlta=new Date();
        assignarBarres(rang);
    }


    /*
    Mètodes accessors
     */
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
    public int getBarres() {
        return barres;
    }
    public static void setDADES(Scanner aDADES) {
        DADES = aDADES;
    }
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
    public void setBarres(int barres) {
        this.barres = barres;
    }
    

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou tripulant de cabina.
    Les dades a demanar són les que necessita el constructor.
    - Heu de tenir en compte que el nom no té per què estar format per una única 
    paraula, per exemple, Pep Gómez.
    - També heu de tenir en compte que les hores de vol són de tipus LocalTime, per
    tant heu de demanar a l'usuari les hores i minuts per crear el LocalTime. En aquest
    cas es considerarà que els segons i nanosegons, sempre són  0.
    -  Li demanarà a l'usuari el rang del tripulant de cabina tenint en compte que
    "C" serà el que ha d'introduir l'usuari si el rang és comandant, "CP" si és
    copilot i "EV" si és enginyer de vol.
    - Si no introdueix cap dels tres rangs, no se li assignarà cap valor al rang i se 
    li mostrarà a l'usuari el missatge "\nEl rang introduït no és correcte".
    - Si el rang introduït és correcte, se li assignarà a l'atribut rang "Comandant"
    en cas que el valor introduït sigui "C", "Copilot" en cas que el valor introduït
    sigui "CP" i "Enginyer de vol" en cas que el valor introduït sigui "EV".
    Retorn: El nou tripulant de cabina.
     */
    public static TripulantCabina nouTripulantCabina() {
        Scanner in = new Scanner(System.in);
        String passaport;
        String nom;
        short edat;
        LocalTime horesVol;
        int h, m; // hores i minuts
        String rang;
        
        System.out.print("Nou tripulant de cabina: ");
        System.out.print("\nDigueu-me el passaport: "); passaport = in.next();
        System.out.print("\nDigueu-me el nom: "); nom = in.nextLine();
        System.out.print("\nDigueu-me l'edat: "); edat = in.nextShort();
        System.out.print("\nDigueu-me les hores i minuts de vol: ");
        h = in.nextInt(); System.out.print(":"); m = in.nextInt();
        horesVol = LocalTime.of(h, m);
        System.out.println(horesVol);
        System.out.print("\nDigueu-me el rang: "); rang = in.next();
        
        TripulantCabina newTripulantCabina = new TripulantCabina(passaport, nom, edat, horesVol, rang);
        
        return newTripulantCabina;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte menys data d'alta.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. En el cas de les hores de vol, només se li han
     de mostrar les hores i minuts.
     - Si es vol modificar el rang, a l'hora de demanar-li el nou rang a l'usuari
     haurem de fer el mateix que en el mètode nouTripulantCabina, però en aquest 
     cas, si no s'introdueix un rang correcte, en lloc de no assignar-li res a 
     l'atribut rang, el que farem és no modificar el seu valor actual.
     - Abans de modificar el valor del rang, hem de comprovar que el nou valor 
     compleix els requisits especificats en l'enunciat de la pràctica de la UF1 
     del mòdul 5, és a dir, un Enginyer de cabina pot passar a ser còpilot si té 5
     o més anys d'antiguetat, i un copilot pot passar a ser comandant, si té 15 
     o més anys d'antiguetat.
     - Si modifiquem el valor del rang, també haurem de modificar el valor de les
     barres amb el mètode adient d'aquesta classe.
    
     NOTA: 5 anys són 157788000 segons.
    
     Retorn: cap
     */
    public void modificarTripulantCabina() {

    }

    public void mostrarTripulantCabina() {
        System.out.println("\nLes dades del tripulant de cabina amb passaport " + getPassaport() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nEdat: " + getEdat());
        System.out.println("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(getDataAlta()));
        System.out.println("\nHores de vol: " + getHoresVol().getHour() + ":" + getHoresVol().getMinute());
        System.out.println("\nRang: " + getRang());
        System.out.println("\nBarres: " + getBarres());
    }

    /*
     Paràmetres: rang
     Accions:
     - Se li assignarà a l'atribut barres el valor corresponent segons el rang introduït
     per paràmetre i les especificacions de l'enunciat de la UF1 del mòdul 5, és a dir, 
     en el cas del copilot, 2 barres si té menys de 1500 hores de vol i 3 si té 1500 o més, 
     en el cas del comandant sempre 4 i en el cas de l'enginyer de vol sempre 1.
     Retorn: número de barres
     */
    public int assignarBarres(String pRang) {
        int barres=0;
        
        switch (pRang) {
            case "enginyer":
                    barres = 1;
                break;
            case "copilot":   
                if (this.horesVol.getHour()<1500) {
                    barres = 2;
                } else {
                    barres = 3;
                } 
                break;
            case "comandant":
                    barres = 4;
                break;
            default:barres = 0;
                break;
        }
        return barres;
    }

    public static Scanner getDADES() {
        return DADES;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LocalTime horesVol;
    }
}
