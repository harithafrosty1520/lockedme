import java.io.*; 
  
public class delete
{ 
    public static void main(String[] args) 
    { 
        File file = new File("C:\\Users\\Desktop\\1.txt"); 
          
        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
    } 
} 