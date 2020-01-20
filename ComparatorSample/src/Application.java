import java.util.*;

public class Application {

    public static void main(String[] args) {
//        Comparator<Employee> comparator = (e1, e2) ->(e1.getAge() > e2.getAge()?+1:(e1.getAge() < e2.getAge())?-1:0);

        List<Employee> employees = getEmployees();

        System.out.println("Without Sort");
        System.out.println(employees+"\n");

        Collections.sort(employees, (e1, e2) -> (e1.getAge() > e2.getAge() ? +1 : (e1.getAge() < e2.getAge()) ? -1 : 0));
        System.out.println("Sort by Age");
        System.out.println(employees+"\n");

        Collections.sort(employees, (e1, e2) -> (e1.getAge() > e2.getAge() ? -1 : (e1.getAge() < e2.getAge()) ? +1 : 0));
        System.out.println("Reverse Sort by Age");
        System.out.println(employees+"\n");

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Sort by Name");
        System.out.println(employees+"\n");

        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        System.out.println("Reverse Sort by Name");
        System.out.println(employees+"\n");
    }

    public static List<Employee> getEmployees() {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Amila", 22));
        employeeList.add(new Employee("Dishan", 19));
        employeeList.add(new Employee("Kusal", 24));
        employeeList.add(new Employee("Sampath", 32));
        employeeList.add(new Employee("Ashan", 38));
        employeeList.add(new Employee("Nimalka", 20));
        employeeList.add(new Employee("Jagath", 42));
        employeeList.add(new Employee("Nilanga", 51));

        return employeeList;
    }

}
