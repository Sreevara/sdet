package JavaActivity2;

public class Actiivty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carMake = new String[2];
		carMake[0] = "BMW";
		carMake[1] = "AUDI";
		int sree; 
		int iterator=0;
		int sum=0;
		int[] numbersArray = new int[6];
		
		numbersArray[0] = 10;
		numbersArray[1] = 77;
		numbersArray[2] = 10;
		numbersArray[3] = 54;
		numbersArray[4] = -11;
		numbersArray[5] = 30;
		
		sree = numbersArray.length;
		System.out.println(sree);
		System.out.println(iterator);
		
		for (iterator=0;iterator<=sree-1;iterator++)
		{
			System.out.println("Inside for loop");
			System.out.println(numbersArray[iterator]);
			if (numbersArray[iterator] == 10)
					{
						sum=sum+numbersArray[iterator];
					}
		}
		if (sum == 30)
		{
			System.out.println("Sum is 30 Boss");
		}
		else
		{
			System.out.println("Sum is not 30 Boss" + ", and the sum is : " + sum);
			
		}
	}

}
