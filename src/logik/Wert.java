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
    NEUN(9),
    ZEHN(10),
    ELF(11),
    ZWÖLf(12),
    DREIZEHN(13),
    VIERZEHN(14);







    private final int wert;



    Wert (int wert){

        this.wert = wert;


    }



    public int getWert(){



        return wert;


    }


}
