package EmployeeSalary;
public class EmployeeTest {
    public static void main(String[] args) {
        // Create an instance
        Employee Employee1 = new Employee("Cindy", "Ballady", 2500000.00);
        Employee Employee2 = new Employee("Enzo", "Lemana", 500000.00);

        // Display Yearly Salary
        System.out.println(
            "Before %raise"+"\n"+
            
            " > Yearly Salary 1: "+
            12*Employee1.getMonthly_salary()+"\n"+
            " > Yearly Salary 2: "+
            12*Employee2.getMonthly_salary()+"\n"+

            "After %raise"+"\n"+

            " > Yearly Salary 1: "+
            12*(Employee1.getMonthly_salary() + 0.1*Employee1.getMonthly_salary())+"\n"+
            " > Yearly Salary 2: "+
            12*(Employee2.getMonthly_salary() + 0.1*Employee2.getMonthly_salary())+"\n"


        );
    }
}
