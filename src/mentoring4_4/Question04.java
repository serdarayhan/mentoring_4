package mentoring4_4;

import java.util.Arrays;
import java.util.Scanner;

public class Question04 {
	/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		      	*/
	public static void main(String[] args) {
		
		
	
		Scanner scan = new Scanner(System.in);
        System.out.println("Please write a number for fibonacci");
        int number = scan.nextInt();
        int arr [] = new int [number];
        arr[0]=0;
        arr[1]=1;
        
        for (int i=1; i<number-1; i++) {   // i=1 i=2
            
            arr[i+1] = arr[i] + arr[i-1];
            
        }
        System.out.println(Arrays.toString(arr));
        
	 }
}