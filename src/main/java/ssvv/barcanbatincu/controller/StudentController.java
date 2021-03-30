package ssvv.barcanbatincu.controller;

import ssvv.barcanbatincu.repository.StudentRepo;

public class StudentController {
    private StudentRepo studentRepo;

    public StudentController() {
        studentRepo = new StudentRepo();
    }

    public StudentController(StudentRepo newRepo) {
        studentRepo = new StudentRepo(newRepo.getStudentList());
    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    public void addStudent() {

    }
}
