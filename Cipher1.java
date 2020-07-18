
import java.util.Scanner;
import java.util.Random;

public class Cipher1 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5, number, sum, key, tens, ones, tensCoded, onesCoded, encoded;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 5 numbers between 0 and 19: ");
		
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3= scan.nextInt();
		num4= scan.nextInt();
		num5= scan.nextInt();
		
		System.out.println("1st number: "+num1);
		System.out.println("2nd number: "+num2);
		System.out.println("3rd number: "+num3);
		System.out.println("4th number: "+num4);
		System.out.println("5th number: "+num5);
		
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

