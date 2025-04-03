import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder family = new StringBuilder(15);
        StringBuilder estimation = new StringBuilder(3);
        StringBuilder discipline = new StringBuilder(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Фамилия вашего студента: ");
        String f = family.append(sc.nextLine()).toString();
        System.out.print(" по дисциплине ");
        String d = discipline.append(sc.nextLine()).toString();
        System.out.print("он получил ");
        String e = estimation.append(sc.nextLine()).toString();
        formating(f, e, d);
    }

    public static void formating (String fam, String est, String dis) {
        Formatter form = new Formatter();
        form.format("Студент %s получил %s по %s.",fam, est, dis);
        System.out.println(form);
    }
}