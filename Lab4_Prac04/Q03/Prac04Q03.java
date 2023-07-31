
package com.mycompany.prac04q03;

public class Prac04Q03
{

    public static void main(String[] args) 
    {
        Student student=new Student();
        student.setID(25);
        student.setName("Ayodhya");
        student.setCourse("MIS");
        
        Lecturer lecturer=new Lecturer();
        lecturer.setID(455);
        lecturer.setName("Dr.Rasika Ranaweera");
        lecturer.setProgramme("Module3 - Database Management System");
        
        System.out.println("Student ID: "+student.getID());
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student Course: "+student.getCourse());
        
        System.out.println("");
        
        System.out.println("Lecturer ID: "+lecturer.getID());
        System.out.println("Lecturer Name: "+lecturer.getName());
        System.out.println("Lecturer Programme: "+lecturer.getProgram());
    }
}
