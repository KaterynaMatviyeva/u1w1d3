package esercizio2;

public class Sim {
    private String numero;
    private double credito = 0;
    private Chiamata chiamata[] = new Chiamata[5];

    public Sim(String numero) {
        this.numero = numero;

    }
    public double ricarica(double ricarica){
      return this.credito += ricarica;
    };
    public void aggiungiChiamata(Chiamata chiamata){
        for (int i = 0; i < this.chiamata.length -1; i++) {
            this.chiamata[i + 1] = this.chiamata[i];
        }
        this.chiamata[0] = chiamata;
    }
}
