import java.util.Random;

//lista de pangramas
public class Pangrama { 
    private String lista[] = {"Jane quer LP, fax, CD, giz, TV e bom whisky",
        "Blitz prende ex-vesgo com cheque fajuto",
        "Um pequeno jabuti xereta viu dez cegonhas felizes",
        "Gazeta publica hoje no jornal uma breve nota de faxina na quermesse",
        "Zebras caolhas de Java querem passar fax para moças gigantes de New York"};
    
    public String getPangrama()
    {
        Random rand = new Random();       //instancia método random 
        String pangrama = lista[rand.nextInt(5)]; //gera pangrama aleatória, em consideração da quantidade total de pangramas
        return pangrama; //devolve o pangrama gerado para quem chamou
    }
}
