package assignments2.week1day2;

public class Calculator 
{

	public int add() 
	{
		int a = 1; 
		int b= 2; 
		int c=3;
		int sum = a + b + c;
		return sum;
	}
	
	public int sub(int d, int e) 
	{		
		return d-e;
	}

	public double mul(double f,double g) 
	{
		
		return f*g;
	}
	
	public float divide() 
	{
		float h = 15.5f;
		float i = 3.5f;
		float division = h/i;
		return division;
	}
	
	public static void main(String[] args) 
	{
		Calculator differentMethods = new Calculator();
		int sum = differentMethods.add();
		System.out.println("Sum of a,b,c: " + sum);
		int diff = differentMethods.sub(10, 3);
		System.out.println("Difference of d,e: " + diff);
		double product = differentMethods.mul(4.5, 5.5);
		System.out.println("Product of f,g: " + product);
		float division = differentMethods.divide();
		System.out.println("Division of h,i: " + division);
	}
}
class MyCalculator
{
	public static void name() 
	{
		Calculator differentMethodsA = new Calculator();
		int sum = differentMethodsA.add();
		System.out.println("Sum of a,b,c: " + sum);
		int diff = differentMethodsA.sub(10, 3);
		System.out.println("Difference of d,e: " + diff);
		double product = differentMethodsA.mul(4.5, 5.5);
		System.out.println("Product of f,g: " + product);
		float division = differentMethodsA.divide();
		System.out.println("Division of h,i: " + division);
	}
}