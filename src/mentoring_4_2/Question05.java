package mentoring_4_2;
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        /* 
        Kullanici 1 ile 7 arasinda bir sayi girdiginde haftanin hangi gunu oldugunu yazdiran switch case java kodunu yaziniz.
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanin hangi gun oldugunu yazdirmak icin bir rakam giriniz(1-7)");
        int sayi = scan.nextInt();
        
        switch (sayi) {
        case 1 : System.out.println("Pazartesi"); 
        break;
        case 2 : System.out.println("Sali");
        break;
        case 3 : System.out.println("Carsamba");
        break;
        case 4 : System.out.println("Persembe");
        break;
        case 5 : System.out.println("Cuma");
        break;
        case 6 : System.out.println("Cumartesi");
        break;
        case 7 : System.out.println("Pazar");
        break;
        default:
            System.out.println("Lutfen 1,2,3,4,5,6,7 rakamlarindan birini giriniz");
    }
scan.close();   }
}
