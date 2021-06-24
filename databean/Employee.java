package databean;

import java.util.Objects;

public class Employee {
    private String name;
    private Integer empid;
    private Double Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Employee() {
    Salary=0.0;
    empid=0;
    name="";}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(empid, employee.empid) &&
                Objects.equals(Salary, employee.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empid, Salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", Salary=" + Salary +
                '}';
    }
}
