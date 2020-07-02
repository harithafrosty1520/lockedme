import java.io.*;
import java.util.*;

public class FileSorter
{
   public static void main(String[] args)
   {  new FileSorter("F:\folder"); }
   
   public FileSorter(String fileName)
   {
      String[] list = new String[1000];
      int count = 0;
      
      try
      {
         BufferedReader info =
            new BufferedReader(new FileReader(fileName));
         
         while (info.ready())
         {
            String item = info.readLine();
            list[count] = item;
            count = count + 1;
         }
         info.close();           
         
         sort(list,count);

         PrintWriter outfo =
            new PrintWriter(new FileWriter(fileName));
         for (int x = 0; x < count; x = x+1)
         {
            outfo.println(list[x]);
         }
         outfo.close();
      }
      catch (IOException ex)
      {  System.out.println(ex.toString()); }
   }
   
   public void sort(String[] list,int count)
   {
      for (int pass = 0; pass < count; pass = pass+1)
      {
         for (int p = 0; p < count-1; p = p + 1)
         {
            if (list[p].compareTo(list[p+1])>0)
            {
               String temp = list[p];
               list[p] = list[p+1];
               list[p+1] = temp;
            }
         }
      }
   }
}