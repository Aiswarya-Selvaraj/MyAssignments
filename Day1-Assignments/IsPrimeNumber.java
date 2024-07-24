package week1day1.homeassignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		
			for(int i=2;i<n-1;i++) 
			{
				if(n%2==0) 
				{
					System.out.println("It is Not a prime number");
					return;
				}
			}
			System.out.println("It is a Prime number");
	}
	
}