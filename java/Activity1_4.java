package JavaActivity4;
import java.util.Arrays;

public class Activity1_4 
{

	public static void main(String[] args) 
	{
		int[] data = {5, 0, 10, -5, -30, -2, 0, 25, 100, 32, 32, 6, 8, 9};
		sorter(data);
		System.out.println("Your Array is sorted now.  Enjoy");
		System.out.println(Arrays.toString(data));
	}

	public static void sorter(int array[])
	{
		int size = array.length;
		int i;
		
		for (i=1;i < size; i++)
		{
			int key = array[i];
			int j = i - 1;
			
			while (j >=0 && key < array[j])
			{
				array[j + 1] = array[j];
                --j;
			}
			array[j + 1] = key;
		}
	}
}
