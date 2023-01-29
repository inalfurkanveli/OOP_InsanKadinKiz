package OopOrnekler.InsanKadinKiz;

public abstract class Insan {
    String isim;
    byte boy;

    public Insan(){

    }

    @Override
    public String toString() {
        return "Insan{" +
                "isim='" + isim + '\'' +
                ", boy=" + boy +
                '}';
    }
}

