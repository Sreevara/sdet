package JavaActivity1;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car()
	{
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics()
	{
		System.out.println("Color of the Car is : " + color);
		System.out.println("Transmission of the Car is : " + transmission);
		System.out.println("Make of the Car is : " + make);
		System.out.println("Number of tyers in the cars are : " + tyres);
		System.out.println("Number of doors in the cars are : " + doors);
	}
	
	public void accelerate ()
	{
		System.out.println("Car is moving forward.");
	}
	
	public void brake()
	{
		System.out.println("Car has stopped.");
	}

}
