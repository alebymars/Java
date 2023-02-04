public class Main {
    public static void main(String[] args) {
        // Human ivan = new Human("Ivanov", "Ivan", "Ivanovich", "12.02.1975", "Man");
        Employee rabochiy = new Employee();
        rabochiy.setDivision("IT");

        rabochiy.lastName = "Ivanov";
        System.out.println(rabochiy.lastName);
    }
}
