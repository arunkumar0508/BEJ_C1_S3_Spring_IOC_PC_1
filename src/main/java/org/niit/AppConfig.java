package org.niit;

import org.springframework.context.annotation.Bean;

import java.util.Date;

public class AppConfig {

    @Bean
    public Employee getEmp1(){
        Employee emp=new Employee();
        emp.employeeName="Manik Basha";
        emp.employeeId=100;
        emp.employeeDCB= new Date(1997,8,5);
        return emp;
    }

    @Bean
    public Department getdept(){
        Department dept=new Department(1,"IT");
        return dept;
    }
}
