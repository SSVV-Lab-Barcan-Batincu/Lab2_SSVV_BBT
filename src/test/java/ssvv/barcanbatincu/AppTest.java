package ssvv.barcanbatincu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
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
}
