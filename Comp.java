import java.util.*;
public class Comp implements Comparator<Integer>
{
 public int compare(Integer a,Integer b)
 {
   return a%10>b%10?1:-1;
 }
}