package esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    private double area;
    private double perimetro;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.area = this.altezza * this.larghezza;
        this.perimetro = 2*(this.altezza + this.larghezza);


    }
public void stampaRettangolo(){
    System.out.println("altezza: " + this.altezza + " " + "larghezza: " + this.larghezza + " " + "area: " + this.area + " " + "perimetro: " + this.perimetro);
}
    public static void stampa2Rettangoli(Rettangolo ret1, Rettangolo ret2){
        double sommaRettangoli = ret1.area + ret2.area;
        double sommaPerimetri = ret1.perimetro + ret2.perimetro;
        System.out.println("altezza rettangolo1" + ret1.altezza + "larghezza rettangolo1" + ret1.larghezza + "somma rea perimetro" + sommaRettangoli + sommaPerimetri);
    };

}
