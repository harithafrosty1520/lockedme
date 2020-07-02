import java.io.*;
public class example
{  
public static void main(String[] args )throws IOException  
{     File haritha=new File("folder");
      File text=new File("folder/haritha.txt");
      haritha.mkdir();
      text.createNewFile();
      System.out.println("successfully created");
  }
}
