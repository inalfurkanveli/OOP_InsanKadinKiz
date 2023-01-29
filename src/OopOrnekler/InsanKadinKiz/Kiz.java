package OopOrnekler.InsanKadinKiz;

public class Kiz extends Kadin {
    int konusmaSuresi;
    public Kiz(String sacRengi, String isim, int boy , int konusmaSuresi  ){
        this.boy=boy;
        this.isim=isim;
        this.sacRengi=sacRengi;
        this.konusmaSuresi=konusmaSuresi;

    }



    @Override
    public String toString() {
        return "Kiz{" +
                "konusmaSuresi=" + konusmaSuresi +
                ", sacRengi='" + sacRengi + '\'' +
                ", isim='" + isim + '\'' +
                ", boy=" + boy +
                '}';
    }
}
