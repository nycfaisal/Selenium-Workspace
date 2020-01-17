package practice;

import java.util.Scanner;

public class BeginWithJavadotcom {

	public static void main(String[] args) {
		//create an obj
		BeginWithJavadotcom obj = new BeginWithJavadotcom();
		
		//obj.problemOne();
		//obj.problemTwo();
		//obj.problemThree();
		//obj.problemFour();
		//obj.problemFive();
		obj.altproblemSix(12456);
		//obj.problemSix();

	}
	//problem one: Write a program to print numbers from 1 to 10.
	public void problemOne()
	{
		for (int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}
	
	//problem two: Write a program to calculate the sum of first 10 natural number.
	public void problemTwo()
	{
		int sum =0;
		for(int i =0; i<=10; i++)
		{
			sum = sum+ i;
		}
		System.out.println("Total sum of first 10 digits are " + sum);
	}
	//problem three: Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
	public void problemThree()
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive interger");
		int num;
		num = console.nextInt();
		
		for (int i=0; i<=10; i++)
		{
			int multiplication = num * i;
			System.out.println(multiplication);
		}
		
	}
	//problem four: Write a program to find the factorial value of any number entered through the keyboard. 
	public void problemFour()
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive interger");
		int num;
		num = console.nextInt();
		int factorialValue = 1;
		for(int i = num; i > 0; i--)
		{
			factorialValue *= i;
		}
		System.out.println(factorialValue);
	}
	// problemfive: Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. 
	//(Do not use Java built-in method)
	public void problemFive()
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive interger");
		int base = console.nextInt();
		System.out.println("Enter Positive integer");
		int power = console.nextInt();

		for (int i=1; i<power; i++)
		{
		 base *= base;
		}
		System.out.println("Power of integer " + base);
	}
	//problem six: Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
	//For example, if the input is 12345, the output should be 54321.
	public void problemSix()
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter sequence of positive interger");
		int num = console.nextInt();
		String value = Integer.toString(num);
		String [] arrayofValue = value.split("");
		
		String revValue = "";
		
		for (int i=arrayofValue.length-1; i > 0; i--)
		{
			
			revValue += arrayofValue;
		}
		System.out.println("Reverse of your intput is " + revValue);
	}
	public void altproblemSix(int number){
		System.out.println("You entered these digits " + number);
		String value = Integer.toString(number);
		String [] arrofvalue = value.split("");
		
		String revValue = "";
		for (int i=arrofvalue.length -1; i>0; i--)
		{
			System.out.println("digits are " + arrofvalue[i]);
			
			revValue += arrofvalue[i];
			
	}
		int revIntValue = Integer.valueOf(revValue);
		System.out.println(revIntValue);
		
		
}
}
