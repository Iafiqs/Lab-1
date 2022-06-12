package exercise_7;

import java.util.Scanner;

public class HumanEarthMars 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the weight on Earth: ");
		double EarthWeight= sc.nextInt();
		double MarsWeight= (EarthWeight/9.81)*3.711;
		System.out.println("Weight on Earth: " +EarthWeight);
		System.out.println("Weight on Mars: " +MarsWeight);

	}

}
