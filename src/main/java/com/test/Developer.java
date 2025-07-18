package com.test;

public class Developer {

    private Computer computer;

    public Developer(){
        System.out.println("Developer Constructor");
    }
    public Computer getComputer(){
        return computer;
    }
    public void setComputer(Computer computer){
        this.computer = computer;
    }

    public void build(){
        System.out.println("working on a project....");
        computer.compile();
    }
}
