package Tvary;

public class Ctvorec extends Obdlznik
{
    public Ctvorec(){
        super();
    }
    public Ctvorec(int sirka){
        super(sirka, sirka);
    }
    @Override
    public  double vypocitatObsah()
    {
        return sirka * sirka;
    }

    @Override
    public double vypocitatObvod() {
        return 4 * sirka;
    }
    @Override
    public String toString()
    {
        return "Ctverec, strana = " + this.sirka;
    }
}