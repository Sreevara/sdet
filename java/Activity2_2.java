package JavaActivity6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
    
    public Plane(int maxPassengers)
    {
    	this.maxPassengers = maxPassengers;
    	this.passengers = new ArrayList<>();
    }
    
    public void onboard(String Passengers)
    {
    	this.passengers.add(Passengers);
    }
    
    public Date takeOff()
    {
    	this.lastTimeTookOf  = new Date();
    	return lastTimeTookOf;
    }
    
    public void land()
    {
    	this.lastTimeLanded = new Date();
    	this.passengers.clear();
    }
    
   public Date getLastLannded()
   {
	   return lastTimeLanded;
	   
   }
   public List<String> getPassengers()
   {
	   return passengers;
	   
   }
}



public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException
	{
		Plane aeroplane = new Plane(11);
		aeroplane.onboard("Tendulkar");
		aeroplane.onboard("Sehwag");
		aeroplane.onboard("Virat Kohli");
		aeroplane.onboard("Rohith Sharma");
		aeroplane.onboard("Ravindra Jadeja");
		aeroplane.onboard("M S Dhoni");
		aeroplane.onboard("Anil Kumble");
		aeroplane.onboard("Jasprit Bumrah");
		aeroplane.onboard("Kapil Dev");
		aeroplane.onboard("Javgal Srinath");
		aeroplane.onboard("Ravichandran Ashwin");
		System.out.println("The plane took off at: \n" + aeroplane.takeOff());
		System.out.println("People on plane      : \n" + aeroplane.getPassengers());
		Thread.sleep(5000);
		aeroplane.land();
		System.out.println("The plane landed at  : \n" + aeroplane.getLastLannded());
		System.out.println("People on plane after landing: \n" + aeroplane.getPassengers());
		
		
		
		

	}

}
