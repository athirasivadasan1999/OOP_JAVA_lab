import java.io.*;
import java.util.*;
public class file_21
{
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("hi.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        
        FileWriter fw = new FileWriter("hello.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
            while((s=br.readLine())!=null)
            {
                bw.write(s);
                bw.newLine();
                bw.flush();
            }
            fr.close();
            br.close();
        }
        catch(Exception e)
        {

        }
    }
}