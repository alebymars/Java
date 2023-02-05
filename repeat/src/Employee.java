// import java.lang.Comparable;

public class Employee extends Human {
    String division;
    String post;
    float salary;

    public Employee(String division, String post, float salary) {
        super();
        this.division = division;
        this.post = post;
        this.salary = salary;
    }

    public Employee() {
    }

    // @Override
    // public String toString() {
    //     final StringBuilder sb = new StringBuilder("Employee{");
    //     sb.append("division='").append(division).append('\'');
    //     sb.append(", post='").append(post).append('\'');
    //     sb.append(", salary=").append(salary);
    //     sb.append('}');
    //     return sb.toString();
    // }

    // public int compareTo(Employee anotherEmployee) {
    //     if (this.salary > anotherEmployee.salary) {
    //         return 1;
    //     } else if (this.salary < anotherEmployee.salary) {
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }

}
