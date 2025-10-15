package tutorial_7;

public class Employee {
    // Private fields - hidden from outside access
    private String name;
    private double salary;

    // Public getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // We can add validation here if needed
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
    }

    // Public getter and setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Add business rule: salary cannot be negative
        if (salary < 0) {
            System.out.println("Invalid salary amount!");
        } else {
            this.salary = salary;
        }
    }
}




















/*
 * Access Modifiers in Java
 *
 * +-------------+--------+----------+-----------+----------------+
 * | Modifier    | Class  | Package  | Subclass  | World (anywhere) |
 * +-------------+--------+----------+-----------+----------------+
 * | private     | Yes    | No       | No        | No              |
 * | default (*) | Yes    | Yes      | No        | No              |
 * | protected   | Yes    | Yes      | Yes       | No              |
 * | public      | Yes    | Yes      | Yes       | Yes             |
 * +-------------+--------+----------+-----------+----------------+
 *

 Encapsulation - by controlling access, you can hide the internal implementation details
 of a class and expose only what’s necessary

 */




















