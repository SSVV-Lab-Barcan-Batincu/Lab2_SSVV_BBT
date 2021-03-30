package ssvv.barcanbatincu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import ssvv.barcanbatincu.controller.StudentController;
import ssvv.barcanbatincu.domain.Student;
import ssvv.barcanbatincu.exceptions.ValidatorException;
import ssvv.barcanbatincu.repository.StudentRepo;
import ssvv.barcanbatincu.validator.StudentValidator;

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
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent("1234","abc", 333, "loranz@loranz", "loranz");
            assert studentController.getStudentRepo().size() == 1;
        } catch (ValidatorException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addStudentTest2() {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent("", "", -1, "", "");
            assert studentController.getStudentRepo().size() == 0;
        } catch (ValidatorException e) {
            assert e.toString().equals("Id invalid\n" +
                    "Nume invalid\n" +
                    "Grupa invalid\n" +
                    "Email invalid\n" +
                    "Professor invalid");
            e.printStackTrace();
        }

    }

    @Test
    public void addStudentTest3() {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent("1234", null, 0, null, null);
            assert studentController.getStudentRepo().size() == 0;
        } catch (ValidatorException e) {
            assert e.toString().equals("Nume invalid\n" +
                    "Grupa invalid\n" +
                    "Email invalid\n" +
                    "Professor invalid");
            e.printStackTrace();
        }
    }

    @Test
    public void addStudentTest4() {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent("1234", "null", Integer.MAX_VALUE - 1, "null", "null");
            assert studentController.getStudentRepo().size() == 1;
        } catch (ValidatorException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void addStudentTest5() {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent("1234", "null", Integer.MAX_VALUE, "null", "null");
            assert studentController.getStudentRepo().size() == 1;
        } catch (ValidatorException e) {
            e.printStackTrace();
        }
    }
}
