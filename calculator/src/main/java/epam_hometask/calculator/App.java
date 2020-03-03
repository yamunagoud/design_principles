package epam_hometask.calculator;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Calculation c=new Calculation();
    	Scanner sc=new Scanner(System.in);
    	int choice;
    	do
    	{
    	System.out.println("Enter 1st number");
    	int x=sc.nextInt();
    	System.out.println("Enter 2nd number");
    	int y=sc.nextInt();
    	System.out.println("Menu");
    	System.out.println("1.Addition");
    	System.out.println("2.Multiplication");
    	System.out.println("3.Division");
    	System.out.println("4.Substraction");
    	System.out.println("Enter the index number of the operation which you want to perform : ");
    	int index=sc.nextInt();
    	switch(index)
    	{
    	case 1:System.out.println("Addition:"+c.add(x,y));
    	break;
    	case 2:System.out.println("Multiplication:"+c.mul(x,y));
    	break;
    	case 3:System.out.println("Division:"+c.div(x,y));
    	break;
    	case 4:System.out.println("Substraction:"+c.sub(x,y));
    	break;
    	default:System.out.println("invalid option");
    	System.exit(0);
    	}
    	System.out.println("Enter 1 to continue and 0 to exit");
    	choice=sc.nextInt();
    	}while(choice==1);
    }
}
