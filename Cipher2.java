
/* 
 Programming Fundamentals
 Christopher Thompson
 Programming Assignment1
 */
import java.util.Scanner;
import java.util.Random;

public class Cipher2 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Cipher Program!");
		
		int num1, num2, num3, num4, num5, sum, key, tens, ones, tensCoded, onesCoded;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers between 0 and 19: ");
		
		num1= scan.nextInt();
			if (num1<0 || num1>19)
				System.out.println("Please read directions and try again!");
			else 
				System.out.println("1st number: "+num1);
		
		
		num2= scan.nextInt();
			if (num2<0 || num2>19)
				System.out.println("Please read directions and try again!");
			else 
				System.out.println("2nd number: "+num2);
		
		
		num3= scan.nextInt();
			if (num3<0 || num3>19)
				System.out.println("Please read directions and try again!");
			else 
				System.out.println("3rd number: "+num3);
		
		
		num4= scan.nextInt();
			if (num4<0 || num4>19)
				System.out.println("Please read directions and try again!");
			else 
				System.out.println("4th number: "+num4);
		
		
		num5= scan.nextInt();
			if (num5<0 || num5>19)
				System.out.println("Please read directions and try again!");
			else 
				System.out.println("5th number: "+num5);
		
		
		//encoding steps
		sum= (num1 + num2 + num3 + num4 + num5);
			System.out.println("Total= "+sum);
		
		Random generator = new Random();
		key = generator.nextInt(10);
			System.out.println("Your random key is: "+ key);
		
		tens = (sum/10);
		ones = (sum%10);
		
		//encoded number broken down by tens and ones 
		tensCoded =(tens+key)%10;
		onesCoded =(ones+key)%10;
		
			System.out.println("Your encoded number is: " +tensCoded+onesCoded);
			
		
		}
		

	}

