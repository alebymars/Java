import java.util.TreeSet;
import java.io.*;

public class Main {
    public static TreeSet<Employee> myEmployeeArrayList = new TreeSet<Employee>();

    public static void main(String[] args) throws IOException {

        addOrderClient();
        // addEmployee();
        // addOrder();
    }

    public static void addOrderClient() {
        Client firstClient = new Client();
        firstClient.firstName = "Ivan";
        firstClient.lastName = "Ivanov";
        firstClient.sex = "Man";
        firstClient.setListOrders(new Order[2]);
        firstClient.getListOrders()[0] = new Order();
        firstClient.getListOrders()[0].items = new Product[2];
        firstClient.getListOrders()[0].items[0] = new Product("Bread", "15.02.2022", 1);
        firstClient.getListOrders()[0].items[1] = new Product("Milk", "15.02.2022", 2);
        firstClient.getListOrders()[1] = new Order();
        firstClient.getListOrders()[1].items = new Product[1];
        firstClient.getListOrders()[1].items[0] = new Product("Milk", "15.02.2022", 1);

        Client secondClient = new Client();
        secondClient.firstName = "Petr";
        secondClient.lastName = "Petrov";
        secondClient.sex = "Man";
        secondClient.setListOrders(new Order[1]);
        secondClient.getListOrders()[0] = new Order();
        secondClient.getListOrders()[0].items = new Product[1];
        secondClient.getListOrders()[0].items[0] = new Product("Milk", "15.02.2022", 1);


        for (int i = 0; i < firstClient.getListOrders().length; i++) {
            for (int j = 0; j < firstClient.getListOrders()[i].items.length; j++) {
                System.out.println(firstClient.getListOrders()[i].items[j].name.toString());
            }
        }
    }

    public static void addEmployee() {
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

            // write to .txt file
            // FileOutputStream fos = new FileOutputStream("order.txt");
            // fos.write(myEmployeeArrayList.toString().getBytes());
            // fos.close();
            // write to .txt file
        }
        numberOfEmployees();
        averagySalary();
        totalSalary();
    }

    public static void addOrder() {
        Order orderOne = new Order();
        orderOne.items = new Product[2];
        orderOne.items[0] = new Product("Bread", "15.02.2022", 1);
        orderOne.items[1] = new Product("Milk", "15.02.2022", 2);

        Order orderTwo = new Order();
        orderTwo.items = new Product[1];
        orderTwo.items[0] = new Product("Milk", "15.02.2022", 1);

        for (int i = 0; i < orderOne.items.length; i++) {
            System.out.println(orderOne.items[i].name.toString());
            System.out.println(orderTwo.items[i].name.toString());
        }
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

    // public static void writeToTxt() {
    // try (FileWriter writer = new FileWriter("order.txt", false)) {
    // // запись всей строки
    // String text = "Hello Gold!";
    // writer.write(text);
    // // запись по символам
    // writer.append('\n');
    // writer.append('E');

    // writer.flush();
    // } catch (IOException ex) {

    // System.out.println(ex.getMessage());
    // }
    // }
}
