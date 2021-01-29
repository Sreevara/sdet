package JavaActivity1;

public class Activity1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car AStar = new Car();
		AStar.make = 2010;
		AStar.color = "White";
		AStar.transmission = "Automatic";
		
		AStar.displayCharacteristics();
		AStar.accelerate();
		AStar.brake();
	}

}
