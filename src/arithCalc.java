import java.util.Scanner;

public class arithCalc 
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice;
		Scanner S=new Scanner(System.in);
		System.out.println("...... Welcome To Calculator .......");
		
		do
		{
			// prepare menu for the user to see multiple operations.
			System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Modulus\n6.Exit\n");
			
			// enter the choice
			System.out.print("Enter your choice : ");
			
			// read the input choice value.
			choice=S.next().charAt(0);
			
			// this loop calculates different arithmetic operations..
			switch(choice)
			{ 
			    case '1':System.out.print("Enter First Number : ");
			    a = S.nextFloat();
			    System.out.print("Enter Second Number : ");
			    b = S.nextFloat();	
			    res = a+b;
			    System.out.print("Result : " +res);
			    break;
			     
			     case '2':System.out.print("Enter First Number : ");
				 a = S.nextFloat();
				 System.out.print("Enter Second Number : ");
				 b = S.nextFloat();	
				 res = a-b;
				 System.out.print("Result : " +res);
				 break;
				    
			     case '3':System.out.print("Enter First Number : ");
				 a = S.nextFloat();
				 System.out.print("Enter Second Number : ");
				 b = S.nextFloat();	
				 res = a/b;
				 System.out.print("Result : " +res);
				 break;
				    
			     case '4':System.out.print("Enter First Number : ");
				 a = S.nextFloat();
				 System.out.print("Enter Second Number : ");
				 b = S.nextFloat();	
				 res = a*b;
				 System.out.print("Result : " +res);
				 break;
				 
			     case '5':System.out.print("Enter First Number : ");
				 a = S.nextFloat();
				 System.out.print("Enter Second Number : ");
				 b = S.nextFloat();	
				 res = a%b;
				 System.out.print("Result : " +res);
				 break;
				   
			     case '6':
			     System.out.println("\n.....Thanks for using our Arithmetic Calculator.....");
				 System.exit(0);
				 break;
				 default : System.out.print("\nWrong Choice, Please Choose a Correct Choice\n");
				 break;
			}
	    }
		// loop works till the number 6 not selected.
	  while(choice!=6);
	}
}
