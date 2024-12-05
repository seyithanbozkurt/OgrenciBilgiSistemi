import java.util.ArrayList;
import java.util.List;

public abstract class Ders {
    protected String DersAdi;
    protected String DersKodu;
    protected String donem;
    protected boolean secmeli;
    protected Akademisyen dersorumlusu;
    protected int kredi;

    private List<Ogrenci> ogrenciList;

    public Ders(String DersAdi, String DersKodu, String donem, boolean secmeli, Akademisyen dersorumlusu, int kredi){
        this.DersAdi=DersAdi;
        this.DersKodu=DersKodu;
        this.donem=donem;
        this.secmeli=secmeli;
        this.dersorumlusu=dersorumlusu;
        this.kredi=kredi;

        ogrenciList = new ArrayList<>();
    }

    public abstract String notHesapla(double... notlar);
         public void derseYazilim(Ogrenci ogrenci){
             ogrenciList.add(ogrenci);
         }

    public boolean ogrenciKayitliMi(int numara){
             for(Ogrenci ogrenci : ogrenciList){
                 if(ogrenci.getNumara() == numara)
                     return true;
             }
             return false;
    }

    public void ListeyiYazdir(){
        System.out.println(this.DersAdi + "Ogrenci Listesi:");
        for (Ogrenci ogrenci : ogrenciList){
            System.out.println(ogrenci.getAdSoyad());
        }

    }

    @Override
    public String toString(){
             return "Ders:" + this.DersAdi + "DersKod:" + this.DersKodu + "Donem:" + this.donem + "Secmeli:" + (this.secmeli ? "Evet" : "Hayır") +  "Sorumlu:" + this.dersorumlusu + "Kredi:" + this.kredi;
    }

    protected String HarfNotu(double ortalama){
             if(ortalama >= 90)
                 return "AA";
            else if(ortalama >=80)
                 return "BA";
            else if(ortalama >=70)
                return  "BB";
            else if(ortalama >=60)
                return "CB";
            else if(ortalama >=50)
                return "CC";
            else if(ortalama >=40)
                return "DC";
            else if(ortalama >=30)
                return "DD";
            else
                return "FF";

    }
}
