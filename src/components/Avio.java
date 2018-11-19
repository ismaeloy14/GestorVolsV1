/*
 * Un avió es defineix pel seu codi, fabricant, model, capacitat i un vector amb 
 * les seves classes.
 */
package components;

import java.util.Scanner;



/**
 *
 * @author root
 */
public class Avio {

    private String codi;
    private String fabricant;
    private String model;
    private int capacitat;
    private Classe[] classes;
    private int posicioClasses; //Atribut que controla la primera posició vuida del vector

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys classes i posicioClasses.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar el vector classes com a buit i una longitud de 4.
     - Inicialitzar l'atribut possicioClasses a 0.
     */
    public Avio(String codi, String fabricant, String model, int capacitat){
        this.codi=codi;
        this.fabricant=fabricant;
        this.model=model;
        this.capacitat=capacitat;
        classes = new Classe[4];
        posicioClasses=0;
    }

    /*
    Mètodes accessors
     */
    public String getCodi(){
        return codi;
    }
    public String getFabricant(){
        return fabricant;
    }
    public String getModel(){
        return model;
    }
    public int getCapacitat(){
        return capacitat;
    }
    public int getPosicioClasses(){
        return posicioClasses;
    }
    public Classe[] getClasses(){
        return classes;
    }
    
    
    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public void setClasses(Classe[] classes) {
        this.classes = classes;
    }

    public void setPosicioClasses(int posicioClasses) {
        this.posicioClasses = posicioClasses;
    }
    

    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou avió.
    Les dades a demanar són les que necessita el constructor.
    - També heu de tenir en compte que el fabricant o model, no tenen perquè estar 
    formats per una única paraula, per exemple, Airbus Company o Boing 777
    Retorn: El nou avió.
     */
    public static Avio nouAvio() {
        Scanner in= new Scanner(System.in);
        String codi, fabricant, model;
        int capacitat;

        
        do{
        System.out.println("Digueu-me el codi de l'avió: "); codi = in.next();
        }while(codi.length()!=3);
        System.out.println("Digueu-me el fabricant de l'avió: "); fabricant = in.nextLine();
        System.out.println("Digueu-me el model de l'avió: "); model = in.nextLine();
        System.out.println("Digueu-me la capacitat de l'avió: "); capacitat = in.nextInt();

        Avio newAvio = new Avio(codi,fabricant,model,capacitat);
        
        return newAvio;
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
    public void modificarAvio() {
        Scanner in= new Scanner(System.in);
        String codi, fabricant, model;
        int capacitat, posicioClasses;
        
        System.out.println("Codi de l'avió: "+getCodi());
        System.out.println("Fabricant de l'avió: "+getFabricant());
        System.out.println("Model de l'avió: "+getModel());
        System.out.println("Capacitat de l'avió: "+getCapacitat());
        System.out.println("");
        System.out.println("MODIFICACIÓ DE L'AVIÓ");
        System.out.println("");
        
        do{
            System.out.println("Digueu-me el codi de l'avió: "); codi = in.next();
        }while(codi.length()!=3);
        setCodi(codi);
        System.out.println("Digueu-me el fabricant de l'avió: "); fabricant = in.nextLine();
        setFabricant(fabricant);
        System.out.println("Digueu-me el model de l'avió: "); model = in.nextLine();
        setModel(model);
        System.out.println("Digueu-me la capacitat de l'avió: "); capacitat = in.nextInt();
        setCapacitat(capacitat);
    }

    public void mostrarAvio() {
        System.out.println("\nLes dades de l'avió amb codi " + codi + " són:");
        System.out.println("\nFabricant: " + fabricant);
        System.out.println("\nModel: " + model);
        System.out.println("\nCapacitat: " + capacitat);
    }

    /*
     Paràmetres: cap
     Accions:
     - Afegeix una nova classe al vector de classes de l'avió actual si aquesta encara 
     no s'ha afegit. S'ha de comprovar si s'ha afegit fent servir el mètode pertinent 
     d'aquesta classe, i actualitzar la posició del vector de classes.
     - Abans d'afegir la classe, també heu de comprovar que la seva capacitat sumada
     a la capacitat de les altres classes de l'avió, no superi la capacitat total
     de l'avió.
     - Si l'ingredient ja s'havia afegit o bé la seva capacitat sumada a les capacitats 
     de les altres classes supera la capacitat total de l'avió, no s'afegirà de nou i 
     li mostrarem a l'usuari el missatge "\nLa classe no s'ha pogut afegir".
     Retorn: cap
     */
    public void afegirClasse() {
        Classe classeActual = Classe.novaClasse();
        int esta;
        int capacitatUtilitzada=classeActual.getCapacitat();
        
        
        esta=this.seleccionarClasse(classeActual.getNom());
        
        if (esta==-1) {
            for (int i = 0; i < posicioClasses; i++) {
                capacitatUtilitzada+=this.classes[i].getCapacitat();
            }
            
            if (capacitatUtilitzada<this.capacitat){
                this.classes[posicioClasses]=classeActual;
                posicioClasses++;
            } else {
                System.out.println("\nLa classe no s'ha pogut afegir");
            }
            
        }
        
    }

    public int seleccionarClasse(String nom) {

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < posicioClasses && !trobat; i++) {
            if (classes[i].getNom().equals(nom)) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }

}
