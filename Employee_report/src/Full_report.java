public class Full_report {
    public static void generateReport(Employee[] empl) {
        for (Employee persons : empl) {
            if (persons.full_name.length()<6) System.out.format("Сотрудник %s получает % .2f в день %s%n", persons.full_name, persons.salary, persons.salaryDate);
            else System.out.format("Сотрудник %s получает %.2f в день %s%n", persons.full_name, persons.salary, persons.salaryDate);
        }
    }
}
