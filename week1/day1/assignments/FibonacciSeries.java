package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
int range = 8 ,firstNumber = 0,secondNumber = 1,sum;
		System.out.println(firstNumber);
		system.out.println(secondNumber);
		for(int i=2;i<range;i++)
		{
			sum = firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			system.out.println(sum);
		}
		
			
