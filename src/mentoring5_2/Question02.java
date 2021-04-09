package mentoring5_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
         /*  Rastgele kullan�c� ad� olu�turan JAVA kodu yaz�n�z.
         *  1. Ad�m : Kullan�c�dan ismini isteyelim
         *  2. Ad�m : Kullan�c� ad�ndaki bo�luklar� silelim.
         *  3. Ad�m : Kullan�c� ad�n�n al�nabilir olup olmad���na bakal�m.
         *  4. Ad�m : E�er bizim listemizde �yle bir kullan�c� ad� yoksa kullan�c� ad�, kullan�c�n�n girdi�i isim olsun.
         *  5. Ad�m : E�er bu kullan�c� ad� zaten varsa, sonuna rastgele say� olu�turup ekleyelim, ve g�sterelim.
         *  
            List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
            veritabanindakiKullaniciListesi.add("Ahmet");
            veritabanindakiKullaniciListesi.add("Ay�e");
            veritabanindakiKullaniciListesi.add("S�leyman");
            veritabanindakiKullaniciListesi.add("Nazmi");
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen Isminizi Giriniz");
        String isim = scan.nextLine().trim().replaceAll(" ", "");
        
        List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
        veritabanindakiKullaniciListesi.addAll(Arrays.asList("Ahmet","Ay�e","S�leyman","Nazmi"));
        
        Random r=new Random(); //random s�n�f�
         int rastgele=r.nextInt(100);
        
        if (veritabanindakiKullaniciListesi.contains(isim)) {
            System.out.println("Kullan�c� adiniz = " + isim+rastgele);
        } else {
            System.out.println("Kullan�c� adiniz = " + isim);
        }
    }
}
