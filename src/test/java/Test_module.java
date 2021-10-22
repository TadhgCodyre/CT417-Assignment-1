import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_module {
    //Create mock module
    Module testModule = new Module("Software Engineering", 123, new ArrayList<Student>(), new ArrayList<CourseProgramme>());

    @Test
    public void testModule() {
        //Get student information for testing
        String testName = testModule.getModuleName();
        int testId = testModule.getModuleId();
        ArrayList<CourseProgramme> testCourses = testModule.getRelatedCourses();
        ArrayList<Student> testStudents = testModule.getRelatedStudent();

        //Testing to see if they are correct
        assertEquals(testName, "Software Engineering");
        System.out.println("module name passed");
        assertEquals(testId, 123);
        System.out.println("module id passed");
        assertEquals(testCourses, new ArrayList<CourseProgramme>());
        System.out.println("module courses passed");
        assertEquals(testStudents, new ArrayList<Student>());
        System.out.println("module students passed");
        System.out.println("=============================================\n");
    }

    @Test
    public void testAdd() {
        CourseProgramme testCourse = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1900-01-23"), DateTime.parse("2000-12-25"));
        Student testStudent = new Student("Jimmy", 21, DateTime.parse("1955-1-1"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

        testModule.addCourse(testCourse);
        testModule.addStudent(testStudent);

        assertEquals(testCourse, testModule.getRelatedCourses().get(0));
        System.out.println("Add course passed");
        assertEquals(testStudent, testModule.getRelatedStudent().get(0));
        System.out.println("Add course passed");
        System.out.println("=============================================\n");
    }
}
