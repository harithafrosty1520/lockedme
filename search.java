import java.io.File;

public class search {
   public static void main(String[] argv) throws Exception {
      File dir = new File("directoryName");
      String[] file1 = dir.list();
      
      if (file1 == null) {
         System.out.println("does not exist or is not a directory ");
      }
      else {
         for (int i = 0; i < file1.length; i++) {
            String filename = file1[i];
            System.out.println(filename);
         }
      }
   }
}