package Assignment1;

class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    // Getters and setters
    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Getters and setters
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Getters and setters
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    // Getters and setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

public class Question1 {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        CommissionEmployee employee6 = new CommissionEmployee("Mike", "Davenport", "666-66-6666", 0.10, 95000);
        BaseEmployee employee7 = new BaseEmployee("Mahnaz", "Vaziri", "777-77-7777", 40000);


        System.out.println("Employee Information:");
        System.out.println("---------------------");
        displayEmployeeInfo(employee1);
        displayEmployeeInfo(employee2);
        displayEmployeeInfo(employee3);
        displayEmployeeInfo(employee4);
        displayEmployeeInfo(employee5);
        displayEmployeeInfo(employee6);
        displayEmployeeInfo(employee7);
    }

    public static void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Social Security Number: " + employee.getSocialSecurityNumber());

        if (employee instanceof SalariedEmployee) {
            SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
            System.out.println("Weekly Salary: $" + salariedEmployee.getWeeklySalary());
        } else if (employee instanceof HourlyEmployee) {
            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
            System.out.println("Wage: $" + hourlyEmployee.getWage());
            System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
        } else if (employee instanceof CommissionEmployee) {
            CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
            System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate() * 100 + "%");
            System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
        } else if (employee instanceof BaseEmployee) {
            BaseEmployee baseEmployee = (BaseEmployee) employee;
            System.out.println("Base Salary: $" + baseEmployee.getBaseSalary());
        }

        System.out.println();
    }
}

