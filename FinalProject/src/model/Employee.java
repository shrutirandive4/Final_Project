/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Davleen kaur
 */
public class Employee {
    public String name;
    public int employeeId;
    public String address ;
    public String role;
    public int salary;
    public long cellphoneNo;
    public String emailAddress;   
    
    public static List<Employee> employeeList= new ArrayList<Employee>();
    public static List<Employee> employeeEachList= new ArrayList<Employee>();
    static public List<String> driverName= new ArrayList<>();
    
    
    public Employee(String name, String emailAddress, long cellphoneNo, String address, int salary, String role) {
        this.name=name;
        this.emailAddress= emailAddress;
        this.cellphoneNo=cellphoneNo;
        this.address=address;
        this.salary=salary;
        this.role= role;
    }

    @Override
    public String toString() {
        return name;
    }

    public Employee() {
         
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getCellphoneNo() {
        return cellphoneNo;
    }

    public void setCellphoneNo(long cellphoneNo) {
        this.cellphoneNo = cellphoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        Employee.employeeList = employeeList;
    }

    public static List<String> getDriverName() {
        return driverName;
    }

    public static void setDriverName(List<String> driverName) {
        Employee.driverName = driverName;
    }

    public static List<Employee> getEmployeeEachList() {
        return employeeEachList;
    }

    public static void setEmployeeEachList(List<Employee> employeeEachList) {
        Employee.employeeEachList = employeeEachList;
    }
    
    public void updateEmployee(Employee emp, int empIndex){
        employeeList.set(empIndex, emp);
    }
    public void deleteEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
