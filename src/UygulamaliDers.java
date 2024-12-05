public class UygulamaliDers extends Ders{
    public UygulamaliDers(String DersAdi, String DersKodu, String donem, boolean secmeli, Akademisyen derssorumlusu, int kredi){
        super(DersAdi, DersKodu, donem, secmeli, derssorumlusu , kredi);
    }

    @Override
    public String notHesapla(double... notlar){
        if(notlar.length !=2){
            throw  new IllegalArgumentException("UYGULAMALI DERS İÇİN 2 NOT GİRMELİSİNİZ. VİZE, FİNAL");
        }

        double ortalama= (notlar[0] * 0.3) + (notlar[1] * 0.6);
        return super.HarfNotu(ortalama);
    }
}
