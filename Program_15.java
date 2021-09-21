import java.util.*;
class Programexc extends Exception
{
    public Programexc(String s)
    {
        super(s);
    }
}
public class Program_15
{
    public static void main(String[] args) 
    {
        int i;
        double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number:");
        int no = sc.nextInt();
        int num=no;
        for(i=0;i<no;i++)
        {
            System.out.println("Enter the number to add:");
            int arr = sc.nextInt();
            try 
            {
                if(arr<0)
            {
                no++;
                throw new Programexc("negative numbers not allowed!!!!");
            }
            else
            {
                sum+=arr;
            }
            } 
            catch (Programexc e) 
            {
               System.out.println(e); 
            }
        }
        System.out.println("The sum is:");
        System.out.println(sum);
        double b=sum/num;
        System.out.println("The average is:");
        System.out.println(b);
    }
    
}
