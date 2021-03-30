package ssvv.barcanbatincu.repository;

import ssvv.barcanbatincu.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private List<Student> studentList;

    public StudentRepo() {
        studentList = new ArrayList<>();
    }

    public StudentRepo(List<Student> newList) {
        studentList = newList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}
