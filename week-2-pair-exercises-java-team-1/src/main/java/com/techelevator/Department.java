package com.techelevator;

public class Department {
    private int departmentId;
    private String name;
    public int getDepartmentId() {
        return departmentId;
    }
    public String getName() {
        return name;
    }
    public void setDepartmentId (int departmentld) {
        this.departmentId = departmentld;
    }

    public void setName (String name) {
        this.name = name;
    }
    public Department(int departmentId, String name) {
        setDepartmentId(departmentId);
        setName(name);
    }

}
