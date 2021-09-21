import java.util.*;
import java.io.*;
public class file_22
{
    public static void main(String[] args) {
        
        try
        {
            FileReader fr = new FileReader("nums.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            
            FileWriter fw1 = new FileWriter("even.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);

            FileWriter fw2 = new FileWriter("odd.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);

            int i=0;
            while((s=br.readLine())!=null)
            {
                i = Integer.parseInt(s);
                if(i%2==0)
                {
                    
                    bw1.write(Integer.toString(i));
                    bw1.newLine();
                }
                else
                {
                    bw2.write(Integer.toString(i));
                    bw2.newLine();
                }
            }
            bw1.flush();
            bw2.flush();
        }
        catch(Exception e)
        {}
    }
}