package Tvary;

public class Obdlznik extends Tvar
{
    public Obdlznik() {
        super();
    }
    public Obdlznik(int sirka, int vyska) {
        super(sirka, vyska);
    }

    public void nakreslit()
    {
        for (int i = 0; i < vyska; i++)
        {
            for (int j = 0; j < sirka; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    @Override
    public double vypocitatObsah()
    {
        return sirka * vyska;
    }
    @Override
    public double vypocitatObvod()
    {
        return 2*(sirka + vyska);
    }
    @Override
    public String toString()
    {
        return "Obdelnik, vyska = " + this.vyska + " sirka = " + this.sirka;
    }
}