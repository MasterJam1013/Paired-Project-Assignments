package com.techelevator;

public class Employees {

    private  long ID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private double salary;
    private Department departmentID;
    private String hireDate;

    private static final double STARTING_SALARY = 60000;

    public Employees( long employeeID, String employeefirstName, String employeelastName, String employeeEmail, double employeesalary, Department employeedepartmentID, String employeehireDate ) {
      employeeID = (int) ID;
      employeefirstName = firstName;
      employeelastName = lastName;
      employeeEmail = emailAddress;
      employeesalary = salary;
      employeedepartmentID= departmentID;
    }


    public Employees() {this.salary = STARTING_SALARY; }

    public String setFullName(String lastNameGiven, String firstNameGiven) {
        lastName = lastNameGiven;
        firstName = firstNameGiven;
        return lastNameGiven + firstNameGiven;
    }
    public void raiseSalary(double percent){ salary+= salary* (percent/100);}

    public String getFullName() {
        return lastName + firstName;
    }
    public void setEmailAddress(String emailAddressGiven) {
        emailAddress = emailAddressGiven;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setSalary(double salaryGiven) {
        salary = salaryGiven;
    }

    public double getSalary() {
        return salary;
    }
    public void setDepartmentID(Department departmentGiven) {
        departmentID = departmentGiven;
    }
    public Department getDepartmentID() {
        return departmentID;
    }
    public void setHireDate( String hireDateGiven) {
        hireDate = hireDateGiven;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void setID( int IdGiven) {
        ID = IdGiven;
    }
    public void getID( String IdGiven) {
        ID = Integer.parseInt(IdGiven);
    }
}
