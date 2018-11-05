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
    - Demanar a l'usuari les dades per consola per crear una nova classe d'avió. 
      Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el nom, no té perquè estar formt per una única
    paraula, per exemple, Turista Preferent.
    Retorn: La nova classe.
     */
    public static Classe novaClasse() {
        Scanner dades= new Scanner(System.in);
        String codi,fabricant,model;
        int capacitat;
        
        do{
        System.out.println("Digueu-me el codi de l'avió: ");
        codi = i;
        }while(codi.length()==3);
        Avio nouAvio = new Avio(codi,fabricant,model,capacitat);
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

    }

    public void mostrarClasse() {
        System.out.println("\nLa classe " + getNom() + " té una capacitat de "+getCapacitat());
    }

    
    
}
