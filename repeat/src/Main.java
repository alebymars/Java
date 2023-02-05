import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Employee> myEmployeeArrayList = new TreeSet<Employee>();

        Employee firstRab = new Employee("IT", "Manager", 1000.0f);
        Employee secondRab = new Employee("IT", "Director", 3000.0f);
        Employee thirdRab = new Employee("IT", "Developer", 2000.0f);

        myEmployeeArrayList.add(firstRab);
        myEmployeeArrayList.add(secondRab);
        myEmployeeArrayList.add(thirdRab);

        for (Employee rab : myEmployeeArrayList) {
            System.out.println(rab.toString());
        }
    }
}
