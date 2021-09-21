import java.util.*;
class Shape
{
    float area(float side)
    {
        return(side*side);
    }

    float area(float length,float breadth)
    {
        return(length*breadth);
    }

    double area(double radius)
    {
        return(3.14*radius*radius);
    }
}

public class Area_9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shape s = new Shape();
        do
        {
            System.out.println("1.SQUARE 2.RECTANGLE 3.CIRCLE 4.EXIT");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the side of the square : ");
                    float side = sc.nextFloat();
                    System.out.println("The area of the square is : ");
                    System.out.println(s.area(side));
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the length of the rectangle: ");
                    float length = sc.nextFloat();
                    System.out.println("Enter the breadth of the rectangle: ");
                    float breadth = sc.nextFloat();                    
                    System.out.println("The area of the rectangle is : ");
                    System.out.println(s.area(length,breadth));
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the radius of the circle : ");
                    double radius = sc.nextDouble();
                    System.out.println("The area of the circle is : ");
                    System.out.println(s.area(radius));
                    break;  
                }
                case 4:
                {
                    System.out.println("Exit point");
                    break;
                }
                default:
                {
                    System.out.println("Enter a valid choice 1/2/3/4");
                    break;
                }
            }
        } 
        while(choice!=4);   
    }
}