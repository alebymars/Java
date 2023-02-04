public class Employee extends Human {
    String division;
    String post;
    float salary;

    public Employee(String name, String surname, String patronymic, int age, String division, String post,
            float salary) {
        super();
        this.division = "Podrazdelenie";
        this.post = "Doljnost";
        this.salary = 1000;
    }

    public Employee() {
        super();
        this.division = "Podrazdelenie";
        this.post = "Doljnost";
        this.salary = 1000;
    }

    public void setDivision(String division) {
        this.division = division;
        System.out.println("Podrazdelenie: " + division);
    }
}
