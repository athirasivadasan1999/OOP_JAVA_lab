import java.util.*;
class thread1 implements Runnable
{
    int N;
    thread1(int N1)
    {
        N = N1;
    }
    public void run()
    {
        
        int n1=0,n2=0,n3=1;
        int i;
        for(i=1;i<=N;i++)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            System.out.println("fibonacci number :"+n1 + " ");
        }       
    }
}
class thread2 implements Runnable
{
    int s,e;
    thread2(int start,int end)
    {
        s = start;
        e = end;
    }
   public void run()
   {
        int i;
        for(i=s;i<=e;i++)
        {
            if(i%2==0)
            {
                System.out.println("even number: " + i);
            }
        }  
   }
}

public class Program_17
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---FIBONACCI NUMBERS---");
        System.out.println("Enter the range: ");
        int N1 = sc.nextInt();
        thread1 t1 = new thread1(N1);
        Thread T1 = new Thread(t1);
        
        System.out.println("---EVEN NUMBERS---");
        System.out.println("Enter the starting and ending range of even numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();     
        thread2 t2 = new thread2(start,end);
        Thread T2 = new Thread(t2);
        
        T1.start();
        T2.start();
    }
}