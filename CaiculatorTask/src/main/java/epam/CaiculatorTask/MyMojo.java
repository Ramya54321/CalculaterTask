package epam.CaiculatorTask;

import java.util.*;
class arithmeticOp
{
	double answer;
	void addition(double a,double b)
	{
		answer = a + b;
		System.out.println(a+" + "+b+" = "+answer);
	}
	void substraction(double a,double b)
	{
		answer = a - b;
		System.out.println(a+" - "+b+" = "+answer);
	}
	void multiplication(double a,double b)
	{
		answer = a * b;
		System.out.println(a+" * "+b+" = "+answer);
	}
	void division(double a,double b)
	{
		answer = a / b;
		System.out.println(a+" / "+b+" = "+answer);
	}
}
class SimpleCalc
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double a= input.nextDouble();
		double b= input.nextDouble();
		double answer=0;
		System.out.println("Enter an operator (+, -, *, /): ");
		char op = input.next().charAt(0);
		arithmeticOp obj = new arithmeticOp();
		switch(op)
		{
			 case '+': obj.addition(a,b);
				break;
			 case '-': obj.substraction(a,b);
				break;
			 case '*': obj.multiplication(a,b);
				break;
			 case '/': 
					try
					 {
					     if(b==0)
					        throw new ArithmeticException();
						 obj.division(a,b);
					 }
					 catch(ArithmeticException obj1)
					 {
						 System.out.println("Division by '0' is not possible");
						 //return;
					 }
					 
				break;
			default: System.out.println("Error!");
				return;
				
		}
	}
}