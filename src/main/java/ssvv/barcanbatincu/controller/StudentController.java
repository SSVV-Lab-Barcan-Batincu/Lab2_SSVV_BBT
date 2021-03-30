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
        Student student = new Student(id, name, group);
        if (!studentRepo.checkIfStudentExist(student))
            studentRepo.addStudent(student);
        else System.out.println("Student already exists");
    }

    public String getStudents() {
        return studentRepo.getStudents();
    }
}
