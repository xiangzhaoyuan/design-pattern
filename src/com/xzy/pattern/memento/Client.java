package com.xzy.pattern.memento;

/**
 * 测试备忘录模式
 * Created by Administrator on 2018/1/5.
 */
public class Client {

    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Employee employee = new Employee("zhangsan", 18, 30000);
        System.out.println("第一次创建对象：" + employee.getName() + "---" +
                employee.getAge() + "---" + employee.getSalary());

        taker.setMemento(employee.memento());//备忘一次

        employee.setName("lisi");
        employee.setAge(38);
        employee.setSalary(10000);

        System.out.println("第二次创建对象：" + employee.getName() + "---" +
                employee.getAge() + "---" + employee.getSalary());

        employee.recovery(taker.getMemento());

        System.out.println("第三次创建对象：" + employee.getName() + "---" +
                employee.getAge() + "---" + employee.getSalary());

    }

}
