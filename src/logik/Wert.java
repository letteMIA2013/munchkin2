package logik;
public enum Wert {


    EINS(1),
    ZWEI(2),
    DREI(3),
    VIER(4),
    FUENF(5),
    SECHS(6),
    SIEBEN(7),
    ACHT(8),
    NEUN(9);







    private final int wert;



    Wert (int wert){

        this.wert = wert;

    }



    public int setWert(){



        return wert;


    }


}
