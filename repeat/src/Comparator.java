import java.lang.Comparable;

public class Comparator extends Employee implements Comparable<Employee> {
    public Comparator(String division, String post, float salary) {
        super();
        this.salary = salary;
        this.division = division;
        this.post = post;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("division='").append(division).append('\'');
        sb.append(", post='").append(post).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (salary > anotherEmployee.salary) {
            return 1;
        } else if (salary < anotherEmployee.salary) {
            return -1;
        } else {
            return 0;
        }
    }
}
