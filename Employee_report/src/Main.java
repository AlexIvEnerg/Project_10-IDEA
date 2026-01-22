import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[4];
        for (int i=0; i<4; i++) { arr[i] = new Employee(); }
        arr[0].full_name = "Джейн"; arr[0].salary = 400;
        arr[1].full_name = "Палмер"; arr[1].salary = 430;
        arr[2].full_name = "Кларк"; arr[2].salary = 470;
        arr[3].full_name = "Уотсон"; arr[3].salary = 450;
        Report.generateReport(arr); Full_report.generateReport(arr);
        for (Employee pers : arr) {
            pers.printToFile(pers.full_name, pers.salary);
        }

        try (FileReader file = new FileReader("src\\file.txt")){
            int c;
            while ((c = file.read())!= -1 ) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

    }
}