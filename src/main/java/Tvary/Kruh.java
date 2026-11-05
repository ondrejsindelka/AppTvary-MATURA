package Tvary;

public class Kruh extends Tvar
{
    public Kruh(){
        super();
    }
    public Kruh(int sirka) {
        super(sirka);
    }
    @Override
    public void nakreslit()
    {
        System.out.println("Do konzole neni tak lahke nakreslit kruh");
    }
    @Override
    public double vypocitatObsah()
    {
        return Math.PI * Math.pow(((double) sirka / 2), 2);
    }
    @Override
    public double vypocitatObvod()
    {
        return Math.PI * sirka;
    }
    @Override
    public String toString()
    {
        return "Kruh, prumer = " + this.sirka;
    }
}