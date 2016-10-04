package com.github.ekeane21;


import java.util.Date;
import org.joda.time.DateTime;

public class CourseProgramme {
private String courseName;
private final Module[] module;
private DateTime start= new DateTime();
private DateTime end= new DateTime();

public CourseProgramme(String courseName, Module[] module, DateTime start, DateTime end){
    this.courseName= courseName;
    this.module = module;
    this.start = start;
    this.end = end;
    
}
    public String getCourseName() {
        return courseName;
    }

    public Module[] getModule() {
        return module;
    }
    
        public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }


}
