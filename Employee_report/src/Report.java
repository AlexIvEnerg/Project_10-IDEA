public class Report {
    public static void generateReport(Employee[] empl) {
        for (Employee persons : empl) {
            if (persons.full_name.length()<6) System.out.format("Сотрудник %s получает % .2f%n", persons.full_name, persons.salary);
            else System.out.format("Сотрудник %s получает %.2f%n", persons.full_name, persons.salary);
        }
    }    
}
