/*
 * Defineix una classe d’un avió. Una classe d’un avió es defineix pel seu nom 
 * (no pot haver-hi un avió amb dues classes amb el mateix nom) i capacitat.
 * 
 */
package components;


import java.util.Scanner;


/**
 *
 * @author root
 */
public class Classe {
      
    private String nom;
    private int capacitat;
    
     /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     */
    public Classe(String nom,int capacitat){
        this.nom = nom;
        this.capacitat = capacitat;
    }


    /*
    Mètodes accessors    
    */
    public String getNom(){
        return nom;
    }
    
    public int getCapacitat(){
        return capacitat;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear una nova classe de l'avió. 
      Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el nom, no té perquè estar formt per una única
    paraula, per exemple, Turista Preferent.
    Retorn: La nova classe.
     */
    public static Classe novaClasse() {
        Scanner in= new Scanner(System.in);
        String nom;
        int capacitat;
        System.out.println("Digeu-me el nom de la classe: "); nom = in.nextLine();
        System.out.println("Digeu-me la capacitat"); capacitat = in.nextInt();
        Classe newClasse = new Classe(nom,capacitat);
        return newClasse;
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los
     Retorn: cap
     */
    public void modificarClasse() {
        Scanner in= new Scanner(System.in);
        String nom;
        int capacitat;
        
        
        System.out.println("Nom de la classe: "+getNom());
        System.out.println("Capacitat de la classe: "+getCapacitat());
        System.out.println("");
        System.out.println("MODIFICACIÓ DE LA CLASSE");
        System.out.println("Digeu-me el nom de la classe: "); nom = in.nextLine();
        setNom(nom);
        System.out.println("Digeu-me la capacitat"); capacitat = in.nextInt();
        setCapacitat(capacitat);
    
        
    }

    public void mostrarClasse() {
        System.out.println("\nLa classe " + getNom() + " té una capacitat de "+getCapacitat());
    }

    
    
}
