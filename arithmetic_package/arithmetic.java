import arithmetic_14.*;
import java.util.*;

public class arithmetic implements arithmetic_14.subtraction,arithmetic_14.division
{
    public void sub(float a,float b)
    {
        System.out.println(a-b);
    }

    public void divide(float a,float b)
    {
        System.out.println(a/b);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number : ");
        float b = sc.nextFloat();
        do
        {
            System.out.println("1.ADD 2.DIFFERENCE 3.MULTIPLY 4.DIVISION 5.EXIT");
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    addition ob1 = new addition();
                    System.out.println("The Sum of the numbers is : ");
                    System.out.println(ob1.add(a,b));
                    break;
                }

                case 2:
                {
                    arithmetic ob2 = new arithmetic();
                    System.out.println("The Difference of the numbers is : ");
                    ob2.sub(a,b);
                    break;
                }

                case 3:
                {
                    multiplication ob3 = new multiplication();
                    System.out.println("The Product of the numbers is : ");
                    System.out.println(ob3.multiply(a,b));
                    break;
                }

                case 4:
                {
                    arithmetic ob4 = new arithmetic();
                    System.out.println("The Division of the numbers is : ");
                    ob4.divide(a,b);
                    break;
                }

                case 5:
                {
                    System.out.println("Exit point");
                    break;
                }
                
                default:
                {
                    System.out.println("Enter a valid choice :1/2/3/4/5");
                    break;
                }
            }
        }
        while(choice!=5);
    }
}