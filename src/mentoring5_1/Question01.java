package mentoring5_1;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
         * // Stringi ters çevirmek için bir Java Programý yazýn //1.Yol: StringBuilder
         * () kullanarak //2.Yol: String Classini kullanarak //3.Yol: Bir method
         * oluþturun, ardýndan methodu main method dan çaðýrýn
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a sentence and i will reverse your writing");
        String str = scan.nextLine();
        StringBuilder strb = new StringBuilder(str);
        answer1(str, strb);
        System.out.println("==========================================================");
        String str2 = "";
        answer2(str, str2);
        scan.close();
    }
    public static void answer2(String str, String str2) {
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
    public static void answer1(String str, StringBuilder strb) {
        strb.reverse();
        System.out.println(strb);
        /*
         * StringBuilder strb2 = new StringBuilder(); strb2.append(scan.nextLine());
         * System.out.println("27. satir" + strb2); strb2.reverse();
         * System.out.println("29.satir" + strb2);
         */
    }
}
    