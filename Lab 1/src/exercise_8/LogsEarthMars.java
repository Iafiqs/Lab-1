package exercise_8;

import java.util.ArrayList;
import java.util.Scanner;

import exercise_7.HumanEarthMars;

public class LogsEarthMars {

	public static void main(String[] args) 
	{
		//Enter weight on Earth
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter the weight on Earth: ");
		double EarthWeight= sc.nextDouble();
		
		//Call method to calculate weight on Mars
		HumanEarthMars Human = new HumanEarthMars();
		double MarsWeight = Human.weight(EarthWeight);
		
		//Place the weights in an array
		ArrayList<Double> Earth = new ArrayList<>();
		Earth.add(EarthWeight);
		ArrayList<Double> Mars = new ArrayList<>();
		Mars.add(MarsWeight);
		
		//Print array
		System.out.print("\nWeight on Earth");
		System.out.println("\t\tWeight on Mars");
		System.out.print(Earth);
		System.out.println("\t\t\t" +Mars);

	}

}
