package ssvv.barcanbatincu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ssvv.barcanbatincu.controller.StudentController;
import ssvv.barcanbatincu.domain.Student;
import ssvv.barcanbatincu.repository.StudentRepo;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addStudentTest1() {
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.addStudent(new Student(1234,"abc", "333"));
        assert !studentRepo.getStudentList().isEmpty();
        assert studentRepo.getStudentList().get(0).getId() == 1234;
        assert studentRepo.getStudentList().get(0).getName().equals("abc");
        assert !studentRepo.getStudentList().get(0).getName().equals("333");
    }

    @Test
    public void addStudentTest2() {
        StudentController studentController = new StudentController();
        studentController.addStudent(1234,"abc", "333");
        studentController.addStudent(1234,"abcd", "3334");
        assert studentController.getStudentRepo().getStudentList().size() == 1;
    }
}
