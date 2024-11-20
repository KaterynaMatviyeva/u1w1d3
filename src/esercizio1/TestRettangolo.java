package esercizio1;

public class TestRettangolo {
    public static void main(String[] args) {
        Rettangolo ret1 = new Rettangolo(10.2, 6.8);
        Rettangolo ret2 = new Rettangolo(10.1, 6.7);

        ret1.stampaRettangolo();
        Rettangolo.stampa2Rettangoli(ret1, ret2);
    }
}
