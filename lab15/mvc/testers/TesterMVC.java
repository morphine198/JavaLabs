package edu.lab15.mvc.testers;

import edu.lab15.mvc.*;

public class TesterMVC {
    public static void main(String[] args) {
        var controller = new StudentController(retriveStudentFromDatabase("Greg", "2"));
        controller.getView().printStudentDetails();
    }

    public static Model retriveStudentFromDatabase(String name, String rollNo){
        var m = new Model();
        m.setName(name);
        m.setRollNo(rollNo);
        return m;
    }
}