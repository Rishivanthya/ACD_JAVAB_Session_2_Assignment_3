package pattern;
import java.util.Scanner;    //Importing Scanner class in java
// util :-contains utility classes
//Scanner:-predefined class taking input from user.
/**
 * @author Rishivanthya
 *  class Pattern makes X pattern using "*"
 *  X pattern using *  by getting input from users
 */
public class Pattern
{
	public static void main(String args[]) //main method declaration
	{
		
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in); //Scanner class invoke constructor with argument System.in
		System.out.println("Enter number of rows==colums"); // printing 
		int n = num.nextInt(); // user input will get stored in value n ,nextInt --for getting input as integer.
		num.close();   // invoking close method to avoid resource leak
		for (int rows=1; rows<=n; rows++)  // outer loop initializing rows and check whether rows is equal or less than n value ,incrementing rows 
			
		{
			for(int colums=1;colums<=n;colums++) //inner loop initializing colums ,check whether colums is equal or less than n value ,incrementing colums 
			{
				if(colums == rows)  // nested if loop to check colums is equal to rows
				{
					System.out.print("*");  //printing "*"  
				}
				else if(colums == n-(rows-1)) // again checking alternate condition using else if 
				{
					System.out.print("*");  //printing *  if condition is true
				}
				else
				{
				System.out.print("_");  // or else printing "_"
				}
				
			}
				
	System.out.println(); // this method helps to prints a new line.
		
	}
}
}

