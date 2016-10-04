package com.github.ekeane21;

public class Module {
private Student[] student;
private String module;
private String ID;

public Module(String module, String ID, Student[] student){
    this.module = module;
    this.ID = ID;
    this.student = student;
    }

    public Student[] getStudent() {
        return student;
    }

    public String getModule() {
        return module;
    }

    public String getID() {
        return ID;
    }



}