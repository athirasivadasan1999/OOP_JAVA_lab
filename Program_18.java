import java.util.*;
public class Program_18
{
    public static void main(String[] args) 
    {
        ArrayList<String> arr = new ArrayList<String>();
        int choice,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the array :");
        n = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.next());
        } 
        do
        {
            System.out.println();
            System.out.println("Enter your choice : ");
            System.out.println("1.ADD AT THE END 2.ADD AT POSITION 3.RETRIEVE 4.REPLACE 5.REMOVE 6.SIZE  7.SORT IN ASCENDING 8.SORT IN DESCENDING 9.TRAVERSAL 10.EXIT");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the string to add:");
                    String n1 = sc.next();
                    arr.add(n1);
                    System.out.println("The resultant array is : ");
                    for(String s : arr)
                    {
                        System.out.println(s);
                    }  
                    break; 
                }

                case 2:
                {
                    System.out.println("Enter the position to add the element : ");
                    int n8 = sc.nextInt();
                    if(n8>arr.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {
                        System.out.println("Enter the string to add:");
                        String n9 = sc.next();
                        arr.add(n8,n9);
                        System.out.println("The resultant array is : ");
                        for(String s : arr)
                        {
                            System.out.println(s);
                        }  
                    
                    }
                    break; 
                }

                case 3:
                {
                    System.out.println("Enter the index of the string  to retrieve :");
                    int n2 = sc.nextInt();
                    if(n2>=arr.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {
                        String n3 = arr.get(n2);  
                        System.out.println("The element at index " + n2 + " is : "); 
                        System.out.println(n3);
                    }
                    break;
                }

                case 4:
                {
                    System.out.println("Enter the index of the string to replace :");
                    int n4 = sc.nextInt();
                    if(n4>=arr.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {                   
                        System.out.println("Enter the  string to replace with :");
                        String n5 =  sc.next();
                        arr.set(n4,n5);
                        System.out.println("The resultant array is : ");
                        for(String s : arr)
                        {
                            System.out.println(s);
                        }  
                    }
                    break;
                }

                case 5:
                {
                    System.out.println("Enter the index of the string to be removed : ");
                    int n7 = sc.nextInt();
                    if(n7>=arr.size())
                    {
                        System.out.println("Index out of range!!");
                    }
                    else
                    {
                        arr.remove(n7);
                        System.out.println("The array after removing is : ");
                        for(String s : arr)
                        {
                            System.out.println(s);
                        }  
                    }
                    break;
                }

                case 6:
                {
                    System.out.println("The size of the array is : " + arr.size());
                    break;
                }

                case 7:
                {
                    System.out.println("Array after Sorting is : " );
                    Collections.sort(arr);
                    System.out.println(arr);
                    break;
                }

                case 8:
                {
                    System.out.println("Array after Sorting  in reverse order is : " );
                    Collections.sort(arr,Collections.reverseOrder());
                    System.out.println(arr);
                    break;
                }

                case 9:
                {
                    System.out.println("The elements in the array are : ");
                    for(String s : arr)
                    {
                        System.out.println(s);
                    }  
                    break;
                }

                case 10:
                {
                    System.out.println("Exit point");
                    break;
                }

                default:
                {
                    System.out.println("Enter a valid choice 1/2/3/4/5/6/7/8/9/10");
                    break;
                }
            }
        }
        while(choice!=10);
    }
}