package mentoring5_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
         /*  Rastgele kullanýcý adý oluþturan JAVA kodu yazýnýz.
         *  1. Adým : Kullanýcýdan ismini isteyelim
         *  2. Adým : Kullanýcý adýndaki boþluklarý silelim.
         *  3. Adým : Kullanýcý adýnýn alýnabilir olup olmadýðýna bakalým.
         *  4. Adým : Eðer bizim listemizde öyle bir kullanýcý adý yoksa kullanýcý adý, kullanýcýnýn girdiði isim olsun.
         *  5. Adým : Eðer bu kullanýcý adý zaten varsa, sonuna rastgele sayý oluþturup ekleyelim, ve gösterelim.
         *  
            List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
            veritabanindakiKullaniciListesi.add("Ahmet");
            veritabanindakiKullaniciListesi.add("Ayþe");
            veritabanindakiKullaniciListesi.add("Süleyman");
            veritabanindakiKullaniciListesi.add("Nazmi");
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Isminizi Giriniz");
        String isim = scan.nextLine().trim().replaceAll(" ", "");
        
        List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
        veritabanindakiKullaniciListesi.addAll(Arrays.asList("Ahmet","Ayþe","Süleyman","Nazmi"));
        
        Random r=new Random(); //random sýnýfý
         int rastgele=r.nextInt(100);
        
        if (veritabanindakiKullaniciListesi.contains(isim)) {
            System.out.println("Kullanýcý adiniz = " + isim+rastgele);
        } else {
            System.out.println("Kullanýcý adiniz = " + isim);
        }
    }
}
