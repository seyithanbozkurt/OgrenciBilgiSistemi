//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("Seyithan" , "Bozkurt" , 1234, "Yazılım" , "OfTek", 2021, 3 );
        Ogrenci ogr2 = new Ogrenci("Gül" , "Kalkan", 45678, "Yazılım", "OfTek", 2021,3);
        Ogrenci ogr3 = new Ogrenci("Metehan", "Sargın", 78940, "Yazılım", "OfTek", 2021,3);

        Akademisyen ak1= new Akademisyen("Ahmet" , "YILMAZ");
        Akademisyen ak2 = new Akademisyen("Mehmet", "VURAL");

        BilgiPaketi bilgiPaketi=new BilgiPaketi();

        TemelDers tm1= new TemelDers("Mat", "101", "Guz", false, ak1, 3);
        UygulamaliDers um1= new UygulamaliDers("YTM", "102", "Guz", false, ak2,2);


        bilgiPaketi.dersEkle(tm1);
        bilgiPaketi.dersEkle(um1);

        tm1.derseYazilim(ogr1);
        tm1.derseYazilim(ogr2);
        tm1.derseYazilim(ogr3);

        um1.derseYazilim(ogr1);
        um1.derseYazilim(ogr2);
        um1.derseYazilim(ogr3);

        um1.ListeyiYazdir();
        tm1.ListeyiYazdir();

        bilgiPaketi.transkriptSorgula(ogr1);
        bilgiPaketi.transkriptSorgula(ogr2);
        bilgiPaketi.transkriptSorgula(ogr3);
    }
}