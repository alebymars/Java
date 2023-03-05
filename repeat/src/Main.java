
// import java.util.stream.Collectors;
// import java.util.stream.Stream;
import java.io.*;
// import java.lang.*;
import java.util.*;

public class Main {
    public static TreeSet<Employee> myEmployeeArrayList = new TreeSet<Employee>();
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        addOrderClient();
        writeToTxt();
        // addEmployee();
        // addOrder();
    }

    public static void addOrderClient() {
        List popular = new ArrayList();

        Client firstClient = new Client();
        firstClient.firstName = "Ivan";
        firstClient.lastName = "Ivanov";
        firstClient.sex = "Man";
        firstClient.setListOrders(new Order[2]);
        firstClient.getListOrders()[0] = new Order();
        firstClient.getListOrders()[0].items = new Product[4];
        firstClient.getListOrders()[0].items[0] = new Product("Lemon", "15.02.2022", 1);
        firstClient.getListOrders()[0].items[1] = new Product("Butter", "15.02.2022", 2);
        firstClient.getListOrders()[0].items[2] = new Product("Bread", "15.02.2022", 3);
        firstClient.getListOrders()[0].items[3] = new Product("Milk", "15.02.2022", 4);
        firstClient.getListOrders()[1] = new Order();
        firstClient.getListOrders()[1].items = new Product[1];
        firstClient.getListOrders()[1].items[0] = new Product("Butter", "15.02.2022", 1);

        Client secondClient = new Client();
        secondClient.firstName = "Petr";
        secondClient.lastName = "Petrov";
        secondClient.sex = "Man";
        secondClient.setListOrders(new Order[1]);
        secondClient.getListOrders()[0] = new Order();
        secondClient.getListOrders()[0].items = new Product[1];
        secondClient.getListOrders()[0].items[0] = new Product("Butter", "15.02.2022", 1);

        String[] popularProduct = new String[firstClient.getListOrders().length];

        System.out.println("First client: " + firstClient.firstName + " " + firstClient.lastName + ", Orders:");
        for (int i = 0; i < firstClient.getListOrders().length; i++) {
            String[] arrOrder = new String[firstClient.getListOrders().length];
            for (int j = 0; j < firstClient.getListOrders()[i].items.length; j++) {
                arrOrder[i] = firstClient.getListOrders()[i].items[j].name;
                System.out.println("order #" + (i + 1) + " " + arrOrder[i]);
                popularProduct[i] = arrOrder[i];
                popular.add(arrOrder[i]);
                if (map.containsKey(i)) {
                } else {
                    map.put(i, arrOrder[i]);
                    // System.out.println("map: " + map);
                }
            }
            map.put(i, arrOrder[i]);
        }
        // System.out.println("Popular Item: " + map);
        // System.out.println("All Item: " + popular);

        System.out.println("\nSecond client: " + secondClient.firstName + " " + secondClient.lastName + ", Orders:");
        for (int i = 0; i < secondClient.getListOrders().length; i++) {
            String[] arrOrder = new String[secondClient.getListOrders().length];
            for (int j = 0; j < secondClient.getListOrders()[i].items.length; j++) {
                // String[] arrOrder = new String[secondClient.getListOrders().length];
                arrOrder[i] = secondClient.getListOrders()[i].items[j].name;
                System.out.println("order #" + (i + 1) + " " + arrOrder[i]);
                popularProduct[i] = arrOrder[i];
                popular.add(arrOrder[i]);
                if (map.containsKey(i)) {
                } else {
                    map.put(i, arrOrder[i]);
                    // System.out.println("map: " + map);
                }
            }
            map.put(i, arrOrder[i]);
        }

        System.out.println(
                "\nNumber of all orders: "
                        + (firstClient.getListOrders().length + secondClient.getListOrders().length));

        System.out.println("Number of all products: " + (firstClient.getListOrders()[0].items.length
                + firstClient.getListOrders()[1].items.length + secondClient.getListOrders()[0].items.length));

        System.out.println("\nAll products: " + popular);
        System.out.println("Popular: " + getPopularElement(popular));
    }

    private static String getPopularElement(List popular) {
        String popularElement = null;
        int count = 0;
        for (int i = 0; i < popular.size(); i++) {
            String temp = (String) popular.get(i);
            int tempCount = 0;
            for (int j = 0; j < popular.size(); j++) {
                if (temp.equals(popular.get(j))) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                popularElement = temp;
                count = tempCount;
            }
        }
        return popularElement;
    }

    public int getPopularElement(int[] a) {
        int count = 1, tempCount;
        int popular = a[0];
        int temp = 0;
        for (int i = 0; i < (a.length - 1); i++) {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < a.length; j++) {
                if (temp == a[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
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

    public static void writeToTxt() {
        try (FileWriter writer = new FileWriter("order.txt", true)) {
            // add all orders to .txt file
            writer.write(myEmployeeArrayList.toString());
            // запись всей строки
            // String text = "Hello Gold!";
            // writer.write(text);
            // // запись по символам
            // writer.append('\n');
            // writer.append('E');

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
