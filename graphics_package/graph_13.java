import graphics_13.*;
import java.util.*;

public class graph_13 implements graphics_13.square,graphics_13.triangle
{
    public void square_area(float s)
    {
        System.out.println(s*s);
    }

    public void triangle_area(float base,float height)
    {
        System.out.println(0.5*base*height);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1.Square 2.Rectangle 3.Triangle 4.Circle 5.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the side : ");
                    float s = sc.nextFloat();
                    graph_13 sq = new graph_13();
                    System.out.println("The Area of the Square is : ");
                    sq.square_area(s);
                    break;
                }

                case 2:
                { 
                    System.out.println("Enter the length of the Rectangle : ");
                    float l = sc.nextFloat();
                    System.out.println("Enter the breadth of the Rectangle : ");                   
                    float b = sc.nextFloat();
                    rectangle rect = new rectangle();
                    System.out.println("The Area of the Rectangle is : ");
                    System.out.println(rect.rect_area(l,b));
                    break;
                }

                case 3:
                {
                    System.out.println("Enter the base of the triangle : ");
                    float base = sc.nextFloat();
                    System.out.println("Enter the height of the triangle : ");
                    float height = sc.nextFloat();
                    graph_13 tri = new graph_13();
                    System.out.println("The Area of the Triangle is : ");
                    tri.triangle_area(base,height);
                    break;
                }

                case 4:
                {
                    System.out.println("Enter the radius of the circle : ");
                    double r = sc.nextDouble();
                    circle cir = new circle();
                    System.out.println("The Area of the Circle is : ");
                    System.out.println(cir.cir_area(r));
                    break;
                }

                case 5:
                {
                    System.out.println("Exit point");
                    break;
                }

                default:
                {
                    System.out.println("Enter valid choice 1/2/3/4/5");
                    break;
                }

            }
        }
        while(choice!=5); 
    }
}