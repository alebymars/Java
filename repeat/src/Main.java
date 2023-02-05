import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSet<Employee> myEmployeeArrayList = new TreeSet<Employee>();

        // Employee firstRab = new Employee("IT", "Manager", 1000.0f);
        // Employee secondRab = new Employee("IT", "Director", 3000.0f);
        // Employee thirdRab = new Employee("IT", "Developer", 2000.0f);
        // Employee fourthRab = new Employee("IT", "Manager (low)", 500.0f);

        // myEmployeeArrayList.add(firstRab);
        // myEmployeeArrayList.add(secondRab);
        // myEmployeeArrayList.add(thirdRab);
        // myEmployeeArrayList.add(fourthRab);

        // for (Employee rab : myEmployeeArrayList) {
        // System.out.println(rab.toString());
        // }

        TreeSet<Comparator> myComparatorArrayList = new TreeSet<Comparator>();

        Comparator firstComparator = new Comparator("IT", "Manager", 1000.0f);
        Comparator secondComparator = new Comparator("IT", "Director", 3000.0f);
        Comparator thirdComparator = new Comparator("IT", "Developer", 2000.0f);
        Comparator fourthComparator = new Comparator("IT", "Manager (low)", 500.0f);

        myComparatorArrayList.add(firstComparator);
        myComparatorArrayList.add(secondComparator);
        myComparatorArrayList.add(thirdComparator);
        myComparatorArrayList.add(fourthComparator);

        for (Comparator comparator : myComparatorArrayList) {
            System.out.println(comparator.toString());
        }
    }
}
