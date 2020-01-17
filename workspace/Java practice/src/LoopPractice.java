import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class LoopPractice {

	public static void main(String[] args) {
		
		LoopPractice obj = new LoopPractice();
		
		//calling problem1
		//obj.problem1();
		//obj.problem2();
		//obj.problem3();
		//obj.problem4();
		//obj.problem5();
		//obj.problem6();
		
	}
	
		//1. Write a program to print numbers from 1 to 10.
		public void problem1 ()
		{
		for (int x = 1; x<=10; x++)
		{
			System.out.println("the value of x is " + x);
		}}
		
		//Write a program to calculate the sum of first 10 natural number.
		public void problem2 (){
		
			int sum = 0;
		
		/*for (int x = 1; x<=10; x++)
		{
			sum = x+x;
			sum=sum+x;
		}
		System.out.println("sum is " + sum1);*/
		// Answer from website
	
		for (int i=1; i<=10; i++)
		{
			sum += i;
			//System.out.println("each sum is " + sum);
		}
		System.out.println(sum);}
		
		//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
		@SuppressWarnings("resource")
		public void problem3 ()
		{
		Scanner console = new Scanner(System.in);
		int num;
		
		System.out.println("Enter positive number: ");
		num = console.nextInt();
		int answer = 1;
		for (int j = 0; j<=10; j++)
		{
		answer = num * j;
		System.out.println("Mutliplication table is " + answer);
		
		}}
		
		// Write a program to find the factorial value of any number entered through the keyboard******
		public void problem4 (){
			Scanner console = new Scanner (System.in);
			int num = console.nextInt();
			int answer = 1;
		for (int x=1; x<=num; x++)
		{
			answer = answer * x;
		}
		System.out.println("factorial value of the number is  " + answer);
		console.close();
		}
		
		//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)****
		@SuppressWarnings("resource")
		public void problem5 (){
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("please enter the base number");	
		int base = console.nextInt();
		
		System.out.println("please enter the power number");
		int power = console.nextInt();
		
		int answer = 1;
		for (int y=1; y<=power; y++)
		{
			answer*= base;
		}
		System.out.println("Value is " + answer);
		
		}
		// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
		//For example, if the input is 12345, the output should be 54321.
		@SuppressWarnings("resource")
		public void problem6 (){
			
			Scanner console = new Scanner(System.in);
			
			System.out.println("Please the number");
			int num = console.nextInt();
			//initialize variable
			String reverse = "the reverse number is ";
			
			//convert int to String to array
			String y = String.valueOf(num);
			String [] a = y.split("");
			
			//reversing the array element
			for (int i=a.length-1; i>=0; i--){
			
				reverse +=a[i];
				
			 //System.out.print(reverse);
				
				}
			System.out.println (reverse); 
			
			}
		
		//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
		
		@SuppressWarnings("resource")
		public void problem7 (){
			
		Scanner console = new Scanner(System.in);
		
		System.out.println(" Please enter the value");
		int num = console.nextInt();
		
		//converting int to string and then to array
		String y = String.valueOf(num);
		String [] a = y.split("");
		
		}
		
		
		}
