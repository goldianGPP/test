/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Student {

    private String name, dateBirth;
    private int studentID;
    private List<Subject> subjects = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Student(int studentID, String name, String dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.studentID = studentID;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubjects(Subject subject) {
        this.subjects.add(subject);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public Student addStudent(Scanner scanner, int id) {
        System.out.println("student id : " + id);
        System.out.println("student name : ");
        name = scanner.next();
        System.out.println("student birth date : ");
        dateBirth = scanner.next();

        return new Student(id, name, dateBirth);
    }

    public void showStudent(List<Student> students) {
        if (students.size() == 0) {
            System.out.println("there are no student on the list");
        } else {
            System.out.println("===---STUDENTS---===");
            for (Student student : students) {
                System.out.println("id :" + student.getStudentID() + " | name :" + student.getName() + " | birth date :" + student.getDateBirth());
            }
        }
    }

    public void showSubject(List<Student> students) {
        if (students.size() == 0) {
            System.out.println("there are no teacher on the list");
        } else {
            System.out.println("===---TEACHERS---===");
            for (Student student : students) {
                System.out.println("id :" + student.getStudentID() + " | name :" + student.getName() + " | birth date :" + student.getDateBirth());
                if (student.getSubjects().size() != 0) {
                    System.out.println("     ===---SEUBJECTS---===");
                    for (Subject subject : student.getSubjects()) {
                        System.out.println("     id :" + subject.getSubjectID() + " | name :" + subject.getName());
                    }
                }
            }
        }
    }

}
