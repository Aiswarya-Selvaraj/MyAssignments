package week1.homeassignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		int[] data= {1,4,3,2,8,6,7};
		Arrays.sort(data);

		for (int i= 0; i < data.length-1; i++) 
		{
			if(data[i]+1!=data[i+1]) {
				System.out.println("Missing number is: " +(data[i]+1));
			}
			
		}
	}
}
