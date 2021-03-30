package ssvv.barcanbatincu.controller;

import ssvv.barcanbatincu.domain.Student;
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

    public void addStudent(long id, String name, String group) {
        studentRepo.addStudent(new Student(id, name, group));
    }

    public String getStudents() {
        return studentRepo.getStudents();
    }
}
