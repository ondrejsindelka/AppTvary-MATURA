package Tvary;

public abstract class Tvar {
    protected int sirka;
    protected int vyska;


    public Tvar() {
        this.sirka = 10;
        this.vyska = 10;
    }

    public Tvar(int sirka) {
        this.sirka = sirka;
        this.vyska = sirka;
    }

    public Tvar(int sirka, int vyska) {
        this.sirka = sirka;
        this.vyska = vyska;
    }

    @Override
    public String toString() {
        return "Som tvar a moja vyska a sirka je " + this.vyska + " " + this.sirka;
    }

    public abstract void nakreslit();


    public abstract double vypocitatObvod();

    public abstract double vypocitatObsah();
}