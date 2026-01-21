import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet_07 {
    public static void main(String[] args) {

        Set<String> employees = new TreeSet<>();

        employees.add("Charitha");
        employees.add("Anil");
        employees.add("Ravi");
        employees.add("Bhavya");
        employees.add("Anil");

        System.out.println("Employee names in sorted order:");
        for (String name : employees) {
            System.out.println(name);
        }
    }
}
