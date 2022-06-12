package exercise_7;

public class HumanEarthMars 
{
	
	//Calculate the weight of humans on Mars
	public double weight(double EarthWeight) 
	{
		
		double MarsWeight= (EarthWeight/9.81)*3.711;
		System.out.println("\nWeight on Earth: " +EarthWeight +" kg/m^2");
		System.out.println("Weight on Mars: " +MarsWeight +" kg/m^2");
		return MarsWeight;
		
	}

}
