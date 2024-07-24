package week1day1.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3=1;
		System.out.println(num1);
		for(int i=1;i<=8;i++)
		{
			System.out.println(num3);
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}

	}

}
