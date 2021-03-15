package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    private List<Department> departments = new ArrayList <>();
    private List<Employees> employees = new ArrayList <>();
    private Map<String, Project> projects = new HashMap<>();


    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        private void createEmployees() {
            Employees employees1 = new Employees();

        }

        // give Angie a 10% raise, she is doing a great job!
        employees.get(1).raiseSalary( 10);

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1,"Marketing");
        departments.add(marketing);
        Department sales = new Department(2,"Sales");
        departments.add(sales);
        Department engineering = new Department(3,"Engineering");
        departments.add(engineering);

    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            System.out.println(department.getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {




    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employees employTemp : employees) {
            System.out.println(employTemp.getFullName() + " (" + employTemp.getSalary() + employTemp.getDepartmentID().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project projectone = new Project( "TEams", "Project Management", "10/10/2020", "11/10/2020" );

        for(Employees employeeVar : employees) {
            if(departments.get(2).equals(employeeVar.getDepartmentID())) {
                projectone.setTeamMembers(employeeVar)
            }
        }
        projects.put(projectone.getName(), projectone);

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project projectTwo = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", " 10/10/2020", "11/10/2020");
        {

        }
    }


    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for(Map.Entry<String,Project> entryVar : projects.entrySet()){
            System.out.println(entryVar.getKey() + ": " +entryVar.getValue().getTeamMembers().size());
        }

    }

}
