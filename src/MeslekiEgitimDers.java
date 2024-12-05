public class MeslekiEgitimDers extends  Ders{
    public MeslekiEgitimDers(String DersAdi, String DersKodu, String donem, boolean secmeli, Akademisyen derssorumlusu, int kredi){
        super(DersAdi, DersKodu,donem,secmeli,derssorumlusu,kredi);
    }

    @Override
    public String notHesapla(double... notlar){
        if(notlar.length!=1){
            throw new IllegalArgumentException("MESLEKİEĞİTİM İÇİN 1 NOT GİRMELİSİNİZ");
        }

        double ortalama= (notlar[0]  * 0.6);
        return super.HarfNotu(ortalama);
    }
}
