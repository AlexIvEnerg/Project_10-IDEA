import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Employee {
     String full_name; double salary;
     LocalDate salaryDate = LocalDate.of(2025, 8, 15);

     public void printToFile(String f_name, double s) {
          try (FileOutputStream os = new FileOutputStream("src\\file.txt", true);
               PrintWriter pw = new PrintWriter(os)){
               pw.print(f_name + " , ");
               pw.println(s);
          } catch (IOException e) {
               System.out.print("Exception");
          }
     }

}
