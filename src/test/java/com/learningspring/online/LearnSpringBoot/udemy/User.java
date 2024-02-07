package com.learningspring.online.LearnSpringBoot.udemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    private Address address;
    @Autowired
    private Salary salary;

   /* public User(Address address, Salary salary) {
        this.address = address;
        this.salary = salary;
    }

    public User(){
        this.address = new Address("Walker Street");
        this.salary = new Salary();
    }*/

    public Address getAddress() {
        return address;
    }
   /* @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }*/

    public Salary getSalary() {
        return salary;
    }
   /* @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }*/

    public void printDetails(){
        System.out.println("Address:- "+this.address.getStreet());
        System.out.println("Salary info:- "+this.salary.getAmount());

    }
}
