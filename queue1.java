import java.util.*;
public class queue1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Queue<Integer> q = new PriorityQueue<Integer>(new Comp());
        do
        {
            System.out.println();
            System.out.println("1.ADD ELEMENTS 2.PEEK 3.IS QUEUE EMPTY 4.SIZE 5.POLL 6.DISPLAY 7.EXITPOINT ");
            System.out.println();
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element to add : ");
                    int n1 = sc.nextInt();
                    q.add(n1);
                    System.out.println(q);
                    break;
                }
                case 2:
                {
                    System.out.println("The top most element of the queue is : ");
                    System.out.println(q.peek());
                    break;
                }
                case 3:
                {
                    System.out.println("is queue empty ?? " + q.isEmpty());
                    break;
                }
                case 4:
                {
                    System.out.println("The size of the Queue is : ");
                    System.out.println(q.size());
                    break;
                }
                case 5:
                {
                    System.out.println("The removed element is : ");
                    System.out.println(q.poll());
                    break;
                }
                case 6:
                {
                    System.out.println(q);
                    break;
                }
                case 7:
                {
                    System.out.println("Exit point");
                    break;
                }
                default:
                {
                    System.out.println("Enter a valid choice");
                    break;
                }
            }
        }
        while(choice!=7);
    }
}