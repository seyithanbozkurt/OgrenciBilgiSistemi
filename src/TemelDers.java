public class TemelDers extends Ders{
    public TemelDers(String DersAdi, String DersKodu, String donem, boolean secmeli, Akademisyen derssorumlusu, int kredi){
        super(DersAdi, DersKodu, donem, secmeli, derssorumlusu, kredi);
    }

    @Override
    public String notHesapla(double... notlar){
        if(notlar.length !=3){
            throw new IllegalArgumentException("TEMEL DERS İÇİN 3 NOT GİRİNİZ , VİZE,FİNAL,PROJE");
        }
        double ortalama =(notlar[0]* 0.3) + (notlar[1] * 0.6) + (notlar[2] * 0.2);
        return super.HarfNotu(ortalama);
    }


}
