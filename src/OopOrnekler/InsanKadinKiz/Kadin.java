package OopOrnekler.InsanKadinKiz;

public class   Kadin  extends Insan {


    String sacRengi;
    String isim;
    int boy;

    public Kadin(){
        this.sacRengi=sacRengi;
        this.boy=boy;
        this.isim=isim;
    }

    @Override
    public String toString() {
        return "Kadin{" +
                "sacRengi='" + sacRengi + '\'' +
                ", isim='" + isim + '\'' +
                ", boy=" + boy +
                '}';
    }
}
