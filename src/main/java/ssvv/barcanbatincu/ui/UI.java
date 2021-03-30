package ssvv.barcanbatincu.ui;

import ssvv.barcanbatincu.controller.StudentController;

import java.util.Scanner;

public class UI {
    private StudentController studentController;

    public UI(StudentController studentController) {
        this.studentController = studentController;
    }

    private String showMenu() {
        String res = "1. Add a student\n";
        res = res + "2. Show students\n";
        res = res + "0. Exit\n";
        return res;
    }

    private void addStudent() throws Exception {
        Scanner input = new Scanner(System.in);
        long id = input.nextLong();
        input.nextLine();
        String name = input.nextLine();
        String group = input.nextLine();
        studentController.addStudent(id, name, group);
    }

    private String getStudents() throws Exception {
        return studentController.getStudents();
    }

    public void menu() {
        boolean ok = true;
        int choice;

        while (ok) {
            System.out.println(this.showMenu());
            Scanner input = new Scanner(System.in);
            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        this.addStudent();
                        break;
                    case 2:
                        System.out.println(this.getStudents());
                        break;
                    case 0:
                        ok = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
