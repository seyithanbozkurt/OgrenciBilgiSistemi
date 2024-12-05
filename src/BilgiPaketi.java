import java.util.ArrayList;
import java.util.List;
public class BilgiPaketi {
    private List<Ders> tumDersler;

    public BilgiPaketi(){
        tumDersler = new ArrayList<>();
    }

    public void dersEkle(Ders ders){
        tumDersler.add(ders);
    }

    public void transkriptSorgula(Ogrenci ogrenci){
        System.out.println(ogrenci.getAdSoyad() + "Ders Listesi:");

        for(Ders ders: tumDersler){
            if(ders.ogrenciKayitliMi(ogrenci.getNumara())){
                System.out.print(ders.DersAdi + " " + "dersi" + " ");
                System.out.println("kredisi:" + " " + ders.kredi + " ");
                System.out.println("harfnotu:" + " " + ders.HarfNotu(0) + " ");

            }
        }
    }
}
