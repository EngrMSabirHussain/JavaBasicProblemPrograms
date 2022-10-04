import java.util.Scanner;

public class FibonacciSeries {

	
	/**
	 * Fibonacci series, next number is the sum of previous two numbers
	 *  for example
	 *        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
	 * The first two numbers of Fibonacci series are 0 and 1.
	 * */
	
	
//Fibonacci Series using recursion	
	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci1(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci1(count-1);    
	     }
	 }
	
	
	
//Fibonacci Series without using recursion	
	public void FibonacciWithoutRecursion(int n) {
		
		int n1=0,n2=1,n3,i,count=n;    
		 System.out.print("\n\n"+n1+" "+n2); //printing 0 and 1    
		    
		 for(i=2;i<count;++i) //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		
	}
	
	



	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter nth value of Fibonacci Series: ");
		int n=scanner.nextInt();
		
		
		FibonacciSeries fb=new FibonacciSeries();
		
		System.out.println("\n\n1- Fibonacci with Recursion");
		System.out.println("2- Fibonacci without Recursion");
		System.out.print("Select choice: ");
		int choice=scanner.nextInt();
		
		
		switch(choice) {
		case 1:
			System.out.print("\n\n"+n1+" "+n2);
			printFibonacci1(n-2);
			break;
			
		case 2:
			fb.FibonacciWithoutRecursion(n);
			break;
		default:
			System.out.println("You Enter Wrong Choice!");
			
		}
		
		
		
		
		scanner.close();
	}
}
