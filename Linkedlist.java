import java.util.*;
public class Linkedlist
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        do
        {
            System.out.println();
            System.out.println("1.ADD ELEMENTS 2.DISPLAY ELEMENTS IN SECOND LINKED LIST 3.REMOVE 4.REPLACE 5.GET LAST 6.ADD FIRST 7.ADD LAST 8.REMOVE FIRST 9.REMOVE LAST ");
            System.out.println("10.CLEAR 11.SIZE 12.EXIT");
            System.out.println();
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element to add : ");
                    int n1 = sc.nextInt();
                    l1.add(n1);
                    System.out.println(l1);
                    break;
                }
                case 2:
                {
                    l2.addAll(l1);
                    System.out.println("The elements in the linked list are : ");
                    System.out.println(l2);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the index of the element to be removed : ");
                    int n2 = sc.nextInt();
                    if(n2>=l1.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {
                        l1.remove(n2);
                        System.out.println("The elements in the linked list are : ");
                        System.out.println(l1);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the index of the element to be replaced : ");
                    int n3 = sc.nextInt();
                    System.out.println("Enter the new element to be replaced with : ");
                    int n4 = sc.nextInt();
                    if(n3>=l1.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {
                        l1.set(n3,n4);
                        System.out.println("The elements in the linked list are : ");
                        System.out.println(l1);
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("The last element in the list is : ");
                    System.out.println(l1.getLast());
                    break;
                }
                case 6:
                {
                    System.out.println("Enter the element to be added first : ");
                    int n5 = sc.nextInt();
                    l1.addFirst(n5);
                    System.out.println("The elements in the linked list are : ");
                    System.out.println(l1);
                    break;
                }
                case 7:
                {
                    System.out.println("Enter the element to be added last : ");
                    int n6 = sc.nextInt();
                    l1.addLast(n6);
                    System.out.println("The elements in the linked list are : ");
                    System.out.println(l1);
                    break;
                }
                case 8:
                {
                    l1.removeFirst();
                    System.out.println("The elements in the linked list are : ");
                    System.out.println(l1);
                    break;
                }
                case 9:
                {
                    l1.removeLast();
                    System.out.println("The elements in the linked list are : ");
                    System.out.println(l1);
                    break;
                }
                case 10:
                {
                    l1.clear();
                    System.out.println("The linked list is empty .");
                    break;
                }
                case 11:
                {
                    System.out.println("The size of the linked list is : ");
                    System.out.println(l1.size());
                    break;
                }
                case 12:
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
        while(choice!=12);
    }
}