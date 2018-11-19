/*
 * Un vol es defineix pel seu codi, ruta, avio, un vector amb els seus tripulants 
 * (tripulació), data de sortida, data d’arribada, hora de sortida, hora d’arribada
 * i durada.
 */
package principal;

import components.Avio;
import components.RutaIntercontinental;
import components.RutaInternacional;
import components.RutaNacional;
import components.RutaTransoceanica;
import components.TCP;
import components.TripulantCabina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class Vol {
    private final static Scanner DADES= new Scanner(System.in);
    private String codi;
    private Object ruta;
    private int tipusRuta;
    private Avio avio;
    private TripulantCabina[] tripulacioCabina;
    private int posicioTripulacioCabina;
    private TCP[] tcps;
    private int posicioTcps;
    private Date dataSortida;
    private Date dataArribada;
    private LocalTime horaSortida;
    private LocalTime horaArribada;
    private String durada;

    /*
     CONSTRUCTOR
     Paràmetres: valors per tots els atributs de la classe menys ruta, tipusRuta, avio,
     tripulacioCabina, posicioTripulacioCabina, tcp i posicioTCP.
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.
     - Inicialitzar ruta i avio a null, ja que quan es crea un vol, encara no s'han
     assignat ni la ruta ni el vol.
     - Inicialitzarem l'atribut tipusRuta a 0, ja que com no s'ha assignat encara una ruta,
     no podem saber de quin tipus és.
     - Inicialitzar el vector tripulacioCabina com a buit i una longitud de 7.
     - Inicialitzar el vector tcps com a buit i una longitud de 25.
     - Inicialitzar els atributs posicioTripulacioCabina i posicioTcps a 0.
     - Inicialitzar l'atribut durada amb el mètode pertinent d'aquesta classe.
     */
        public Vol(String codi, Date dataSortida, Date dataArribada, LocalTime horaSortida, LocalTime horaArribada, String durada){
            this.codi=codi;
            this.ruta=null;
            this.tipusRuta=0;
            this.avio=null;
            this.tripulacioCabina = new TripulantCabina[7];
            this.posicioTripulacioCabina=0;
            this.tcps = new TCP[25];
            this.posicioTcps=0;
            this.dataSortida=dataSortida;
            this.dataArribada=dataArribada;
            this.horaSortida=horaSortida;
            this.horaArribada=horaArribada;
            this.durada=durada;
        }

    /*
    Mètodes accessors
     */
    public String getCodi() {
        return codi;
    }

    public Object getRuta() {
        return ruta;
    }

    public int getTipusRuta() {
        return tipusRuta;
    }

    public Avio getAvio() {
        return avio;
    }

    public TripulantCabina[] getTripulacioCabina() {
        return tripulacioCabina;
    }

    public int getPosicioTripulacioCabina() {
        return posicioTripulacioCabina;
    }

    public TCP[] getTcps() {
        return tcps;
    }

    public int getPosicioTcps() {
        return posicioTcps;
    }

    public Date getDataSortida() {
        return dataSortida;
    }

    public Date getDataArribada() {
        return dataArribada;
    }

    public LocalTime getHoraSortida() {
        return horaSortida;
    }

    public LocalTime getHoraArribada() {
        return horaArribada;
    }

    public String getDurada() {
        return durada;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public void setRuta(Object ruta) {
        this.ruta = ruta;
    }

    public void setTipusRuta(int tipusRuta) {
        this.tipusRuta = tipusRuta;
    }

    public void setAvio(Avio avio) {
        this.avio = avio;
    }

    public void setTripulacioCabina(TripulantCabina[] tripulacioCabina) {
        this.tripulacioCabina = tripulacioCabina;
    }

    public void setPosicioTripulacioCabina(int posicioTripulacioCabina) {
        this.posicioTripulacioCabina = posicioTripulacioCabina;
    }

    public void setTcps(TCP[] tcps) {
        this.tcps = tcps;
    }

    public void setPosicioTcps(int posicioTcps) {
        this.posicioTcps = posicioTcps;
    }

    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }

    public void setDataArribada(Date dataArribada) {
        this.dataArribada = dataArribada;
    }

    public void setHoraSortida(LocalTime horaSortida) {
        this.horaSortida = horaSortida;
    }

    public void setHoraArribada(LocalTime horaArribada) {
        this.horaArribada = horaArribada;
    }

    public void setDurada(String durada) {
        this.durada = durada;
    }


    /*
    Paràmetres: cap
    Accions:
    - Demanar a l'usuari les dades per consola per crear un nou vol.
    Les dades a demanar són les que necessita el constructor.
    - En el cas de les dates, li hem de demanar a l'usuari que les introdueixi
    amb el format dd-mm-yyyy. Penseu que la data introduïda per l'usuari serà
    de tipus String i nosaltres l'hem de convertir a data.
    - En el cas de les hores només haurem de demanar l'hora i minuts, els segons
    i nanosegons no els tindrem en compte.
    Retorn: El nou vol.
     */
    public static Vol nouVol() throws ParseException {
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'objecte actual
     i modificar els atributs corresponents d'aquest objecte, excepte ruta, avio,
     tripulacioCabina, tcps, posicioTripulacioCabina i posicioTcps.
     - Li heu de mostrar a l'usuari el valor actual dels atributs de l'objecte
     actual, abans de modificar-los. Les dates les heu de mostrar amb el format
     dd-mm-yyyy, i les hores amb el format hh:mm.
     - Per demanar els nous valors de les dates i les hores, farem el mateix que
     en el mètode anterior nouVol().
     - Si es modifiquen els atributs de data o d'hora, també s'haurà de modificar
     el valor de durada mitjançant el mètode adient d'aquesta classe.
     Retorn: cap
     */
    public void modificarVol() throws ParseException {
        
    }

    /*
     Paràmetres: cap
     Accions:
     - Se li assignarà a l'atribut durada el valor tenint en compte que la durada
     és la diferència de temps entre la data i hora de sortida, i la data i hora
     d'arribada.
     - La durada ha de tenir el format "X h - Y s", on X seran les hores de durada i Y els minuts
     Retorn: cap
     */
    private void calcularDurada() {
        
    }

    /*
     Paràmetres: tripulant de cabina
     Accions:
     - afegeix el tripulant de cabina passat per paràmetre al vector tripulacioCabina    
     en la primera posició buida del vector i actualitza la posició del vector tripulacioCabina.
     Retorn: cap
     */
    public void afegirTripulantCabina(TripulantCabina tripulantCabina) {

    }

    /*
     Paràmetres: TCP
     Accions:
     - afegeix el TCP passat per paràmetre al vector tcps en la primera posició buida 
     del vector i actualitza la posició del vector tcps.
     Retorn: cap
     */
    public void afegirTCP(TCP tcp) {

    }
    
    public void mostrarVol() {
        System.out.println("\nLes dades del vol amb codi " + getCodi() + " són:");

        System.out.println("\nRuta: ");
        switch (getTipusRuta()) {
            case 1:
                ((RutaNacional) getRuta()).mostrarRutaNacional();
                break;
            case 2:
                ((RutaInternacional) getRuta()).mostrarRutaInternacional();
                break;
            case 3:
                ((RutaIntercontinental) getRuta()).mostrarRutaIntercontinental();
                break;
            case 4:
                ((RutaTransoceanica) getRuta()).mostrarRutaTransoceanica();
                break;
        }

        System.out.println("\nAvio: ");
        getAvio().mostrarAvio();

        System.out.println("\nData de sortida: " + new SimpleDateFormat("dd-MM-yyyy").format(getDataSortida()));
        System.out.println("\nData d'arribada: " + new SimpleDateFormat("dd-MM-yyyy").format(getDataArribada()));
        System.out.println("\nHores de sortida: " + getHoraSortida().getHour() + ":" + getHoraSortida().getMinute());
        System.out.println("\nHores d'arribada: " + getHoraArribada().getHour() + ":" + getHoraArribada().getMinute());

        System.out.println("\nLa tripulació de cabina és:");
        for (int i = 0; i < getPosicioTripulacioCabina(); i++) {
            getTripulacioCabina()[i].mostrarTripulantCabina();
        }

        System.out.println("\nLa tripulació de cabina de passatgers és:");
        for (int i = 0; i < getPosicioTcps(); i++) {
            getTcps()[i].mostrarTCP();
        }

        System.out.println("\nDurada: " + getDurada());
    }

    
}
