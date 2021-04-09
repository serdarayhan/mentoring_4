package mentoring5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/* SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip,
         *  bu sayinin daha* onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method* yaziniz
         *  
         *  Array={3,5,21,32,34,45,56,57,76,87,95}** Input : 5 Output: Girdiginiz sayi Arrayde var*
         *   Input : 15 Output: Girdiginiz sayi Arrayde yok
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer less than 100");
        int num = scan.nextInt();
        
        int arr [] = {3,5,21,32,34,45,56,57,76,87,95};
        
        arrayNum(num, arr);
        scan.close();
    }
    public static void arrayNum(int num, int[] arr) {
        if (Arrays.binarySearch(arr, num)>=0) {
            System.out.println("Girdiginiz sayi Arrayde var");
        } else {
            System.out.println("Girdiginiz sayi Arrayde yok");
        }
    }
}