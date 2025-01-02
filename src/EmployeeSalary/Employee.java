package EmployeeSalary;
public class Employee {
    // instance Variables
    String first_name,last_name;
    
    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    Double monthly_salary;

    public Double getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(Double monthly_salary) {
        if (monthly_salary < 0) {
            System.out.println("Monthly salary is not positive");
        }
        else 
        {
            this.monthly_salary = monthly_salary;
        }
    }

    // Constructor
    public Employee(String fName, String lName, Double mSalary){
        this.first_name = fName;
        this.last_name = lName;
        this.monthly_salary = mSalary;
    }
}
