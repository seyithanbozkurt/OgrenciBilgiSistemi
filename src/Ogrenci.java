import static java.lang.reflect.Array.set;
import java.util.List;

public class Ogrenci {
    private String ad;
    private String Soyad;
    private int numara;
    private String bolum;
    private String fakülte;
    private int girisyili;
    private int sinif;

    public Ogrenci(String ad, String Soyad, int numara, String bolum, String fakülte, int girisyili, int sinif){
            this.ad=ad;
            this.Soyad=Soyad;
            this.numara=numara;
            this.bolum=bolum;
            this.fakülte=fakülte;
            this.girisyili=girisyili;
            this.sinif=sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getFakülte() {
        return fakülte;
    }

    public void setFakülte(String fakülte) {
        this.fakülte = fakülte;
    }

    public int getGirisyili() {
        return girisyili;
    }

    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getAdSoyad(){
        return getAd() + " " + getSoyad();
    }
}
