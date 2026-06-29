//using for each loop


import java.util.ArrayList;

class Employee {

    int empId;
    String name;
    String designation;

    // Constructor
    Employee(int empId, String name, String designation) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create ArrayList of Employee objects
        ArrayList<Employee> empList = new ArrayList<>();

        // Add Employee objects
        empList.add(new Employee(101, "Arun", "Software Engineer"));
        empList.add(new Employee(102, "Priya", "Tester"));
        empList.add(new Employee(103, "Rahul", "Manager"));

        // Print Employee Details
        System.out.println("Employee Details");
        System.out.println("-------------------------------");

        for (Employee emp : empList) {
            System.out.println("Employee ID : " + emp.empId);
            System.out.println("Name        : " + emp.name);
            System.out.println("Designation : " + emp.designation);
            System.out.println();
        }
    }
}




//using for loop

import java.util.ArrayList;

class Employee {

    int empId;
    String name;
    String designation;

    Employee(int empId, String name, String designation) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Arun", "Software Engineer"));
        empList.add(new Employee(102, "Priya", "Tester"));
        empList.add(new Employee(103, "Rahul", "Manager"));

        System.out.println("Employee Details");

        for (int i = 0; i < empList.size(); i++) {

            Employee emp = empList.get(i);

            System.out.println("Employee ID : " + emp.empId);
            System.out.println("Name        : " + emp.name);
            System.out.println("Designation : " + emp.designation);
            System.out.println();
        }
    }
}


//using for each loop

import java.util.ArrayList;

class Employee {

    int empid;
    String name;
    String designation;
    
    Employee(int empid, String name, String designation)
    {
        this.empid = empid;
        this.name = name;
        this.designation = designation;
    }
    
    void display()
    {
        System.out.println(empid);
        System.out.println(name);
        System.out.println(designation);
    }
}




class Main{
public static void main (String[] args) 
    {
       ArrayList <Employee> emp = new ArrayList<>();
       
       /*empList.add(new Employee(101, "Arun", "Software Engineer"));
        empList.add(new Employee(102, "Priya", "Tester"));
        empList.add(new Employee(103, "Rahul", "Manager"));*/
        
       Employee e = new Employee(1, "Shan", "hr");
       Employee e1 = new Employee(2, "Thulasi", "CEO");
       
       System.out.println("Employee details");
       emp.add(e);
       emp.add(e1);
       for(Employee a : emp)
       {
           
           a.display();
           /*System.out.println(a.empid);
           System.out.println(a.name);
           System.out.println(a.designation);*/
           
        /*empList.add(new Employee(101, "Arun", "Software Engineer"));
        empList.add(new Employee(102, "Priya", "Tester"));
        empList.add(new Employee(103, "Rahul", "Manager"));*/
       }
       
       
    }
}