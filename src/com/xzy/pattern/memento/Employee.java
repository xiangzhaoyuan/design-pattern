package com.xzy.pattern.memento;

/**
 * 源发器类
 * Created by Administrator on 2018/1/4.
 */
public class Employee {

    private String name;

    private int age;

    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //进行备忘操作，并返回备忘录对象
    public EmployeeMemento memento() {
        return new EmployeeMemento(this);
    }

    //进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmployeeMemento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.salary = memento.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
