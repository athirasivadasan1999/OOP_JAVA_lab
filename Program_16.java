import java.util.*;

class thread1 extends Thread 
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 * " + i + " = "+(5*i));
        }
    }
}

class thread2 extends Thread
{
    public void run()
    {
        System.out.println("---PRIME NUMBERS---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int N = sc.nextInt();
        int x=2,i;
        System.out.println("The prime numbers are:");
        while(N>0)
        {
            for(i=2;i<x;i++)
            {
                if(x%i==0)
                {
                    break;
                }
            }
            if(i==x)
            {
                System.out.println(x+" ");
                N--;
            }
            x++;
        }
    }
}

public class Program_16
{
    public static void main(String[] args) 
    {
        thread1 t1 = new thread1();
        t1.start();
        thread2 t2 = new thread2();
        t2.start();
    }
}