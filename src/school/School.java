/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

import Model.Student;
import Model.Subject;
import Model.Teacher;
import View.StudentView;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author London
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Subject subject = new Subject();
        Teacher teacher = new Teacher();
        Student student = new Student();
        
        StudentView studentView = new StudentView();

        int main, Mstudent, Mteacher, Msubject;

        do {
            System.out.println("---main menu---");
            System.out.println("[1] teacher's menu");
            System.out.println("[2] student's menu");
            System.out.println("[3] subject's menu");
            System.out.println("[0] exit");
            System.out.println("input menu :");
            main = scanner.nextInt();
            switch (main) {
                case 1:
                    do {
                        System.out.println("---teacher menu---");
                        System.out.println("[1] add teacher's data");
                        System.out.println("[2] show teacher's data");
                        System.out.println("[3] add teacher's subject");
                        System.out.println("[4] show teacher's subject");
                        System.out.println("[0] back");
                        System.out.println("input menu :");
                        Mstudent = scanner.nextInt();
                        switch (Mstudent) {
                            case 1:
                                teacher.addTeachers(
                                        teacher.addTeacher(
                                                scanner,
                                                teacher.getTeachers().size() + 1
                                        )
                                );
                                break;
                            case 2:
                                teacher.showTeacher(teacher.getTeachers());
                                break;
                            case 3:
                                teacher.showTeacher(teacher.getTeachers());
                                subject.showSubjects(subject.getSubjects());
                                System.out.println("chose teacher's id : ");
                                int id = scanner.nextInt()-1;
                                System.out.println("chose subject's id : ");
                                teacher.getTeachers()
                                        .get(id)
                                        .addSubjects(subject.getSubjects()
                                                .get(scanner.nextInt()-1));
                                break;
                            case 4:
                                teacher.showSubject(teacher.getTeachers());
                                break;
                        }

                    } while (Mstudent != 0);
                    break;
                case 2:
                     studentView.menu(scanner,subject);
                    break;
                case 3:
                    do {
                        System.out.println("---subject menu---");
                        System.out.println("[1] add subject's data");
                        System.out.println("[2] show subject's data");
                        System.out.println("[0] back");
                        System.out.println("input menu :");
                        Msubject = scanner.nextInt();
                        switch (Msubject) {
                            case 1:
                                break;
                            case 2:
                                subject.showSubjects(subject.getSubjects());
                                break;
                        }

                    } while (Msubject != 0);
                    break;
                case 0:
                    break;
            }

        } while (main != 0);

    }

}
