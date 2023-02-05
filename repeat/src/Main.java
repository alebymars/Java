import java.util.TreeSet;

public class Main {
    public static TreeSet<Employee> myEmployeeArrayList = new TreeSet<Employee>();

    public static void main(String[] args) {

        Employee firstRab = new Employee("IT", "Manager", 1000.0f);
        Employee secondRab = new Employee("IT", "Director", 3000.0f);
        Employee thirdRab = new Employee("IT", "Developer", 2000.0f);
        Employee fourthRab = new Employee("IT", "Manager(low)", 500.0f);

        myEmployeeArrayList.add(firstRab);
        myEmployeeArrayList.add(secondRab);
        myEmployeeArrayList.add(thirdRab);
        myEmployeeArrayList.add(fourthRab);

        for (Employee rab : myEmployeeArrayList) {
            System.out.println(rab.toString());
        }

        numberOfEmployees();
        averagySalary();
        totalSalary();
    }

    public static void numberOfEmployees() {
        System.out.println("Number of employees: " + myEmployeeArrayList.size());
    }

    public static void averagySalary() {
        float sum = 0;
        for (Employee rab : myEmployeeArrayList) {
            sum += rab.getSalary();
        }
        System.out.println("Average salary: " + sum / myEmployeeArrayList.size());
    }

    public static void totalSalary() {
        float sum = 0;
        for (Employee rab : myEmployeeArrayList) {
            sum += rab.getSalary();
        }
        System.out.println("Total salary: " + sum);
    }
}
