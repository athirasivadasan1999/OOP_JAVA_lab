import java.util.*;
interface A
{
    void area();
    void perimeter();
}
class Circle implements A
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    public void area()
    {
        System.out.println("The area of the circle is : " + 3.14*radius*radius);
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the circle is : " + 2*3.14*radius);
    }
}
class Rectangle implements A
{
    double length;
    double breadth;

    Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    public void area()
    {
        System.out.println("The area of the rectangle is : " + length * breadth);
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the rectangle is : " +2*(length + breadth));
    }
}
public class pgm_17
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,a1,a2;
        do
        {
            System.out.println("Enter your choice : ");
            System.out.println("1.Circle 2.Rectangle 3.exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the radius of the circle : ");
                    double r = sc.nextDouble();
                    Circle C = new Circle(r);
                    do
                    {
                        System.out.println("Enter your choice : ");
                        System.out.println("1.area 2.perimeter 3.exit");
                        a1 = sc.nextInt();
                        switch(a1)
                        {
                            case 1:
                            {
                                C.area();
                                break;
                            }
                            case 2:
                            {
                                C.perimeter();
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Exit pont");
                                break;
                            }
                            default:
                            {
                                System.out.println("Enter a valid choice : 1/2/3");
                                break;
                            }
                        }
                    }
                    while(a1!=3);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the length of the rectangle : ");
                    double l = sc.nextDouble();
                    System.out.println("Enter the breadth of the rectangle : ");
                    double b = sc.nextDouble();
                    Rectangle R = new Rectangle(l,b);
                    do
                    {
                        System.out.println("Enter your choice : ");
                        System.out.println("1.area 2.perimeter 3.exit");
                        a2 = sc.nextInt();
                        switch(a2)
                        {
                            case 1:
                            {
                                R.area();
                                break;
                            }
                            case 2:
                            {
                                R.perimeter();
                                break;
                            }
                            case 3:
                            {
                                System.out.println("Exit point");
                                break;
                            }
                            default:
                            {
                                System.out.println("Enter a valid choice : 1/2/3");
                                break;
                            }
                        }
                    }
                    while(a2!=3);
                    break;
                }
                case 3:
                {
                    System.out.println("Exit point");
                    break;            
                }
                default:
                {
                    System.out.println("Enter a valid choice : 1/2/3");
                    break;
                }     
            }
        }while(choice!=3);
    }
}