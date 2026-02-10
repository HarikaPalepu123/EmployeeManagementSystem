import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Harika", 45000));
        list.add(new Employee(101, "Anu", 55000));
        list.add(new Employee(102, "Sri", 40000));

        System.out.println("Sorted by ID:");
        Collections.sort(list, new IdComparator());
        print(list);

        System.out.println("\nSorted by Name:");
        Collections.sort(list, new NameComparator());
        print(list);

        System.out.println("\nSorted by Salary:");
        Collections.sort(list, new SalaryComparator());
        print(list);
    }

    static void print(ArrayList<Employee> list) {
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}