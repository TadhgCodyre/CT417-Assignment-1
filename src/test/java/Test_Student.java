import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Student {
    //Create mock students
    Student testStudent = new Student("Jimmy", 21, DateTime.parse("1955-1-1"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

    @Test
    public void testGetUserName() {
        //Get student information for testing
        String testUserName = testStudent.getUserName();
        int testAge = testStudent.getGlobalAge();
        DateTime testDate2 = testStudent.getDOB();
        int testId = testStudent.getId();
        ArrayList<CourseProgramme> testCourses = testStudent.getCourses();
        ArrayList<Module> testModules = testStudent.getModulesReg();

        //Testing to see if they are correct
        assertEquals(testUserName, "Jimmy21");
        System.out.println("student username passed");
        assertEquals(testAge, 21);
        System.out.println("student age passed");
        assertEquals(testDate2, DateTime.parse("1955-1-1"));
        System.out.println("student date passed");
        assertEquals(testId, 12345);
        System.out.println("student Id passed");
        assertEquals(testCourses, new ArrayList<CourseProgramme>());
        System.out.println("student courses passed");
        assertEquals(testModules, new ArrayList<Module>());
        System.out.println("student modules passed");
        System.out.println("=============================================\n");
    }

    @Test
    public void testAdd() {
        CourseProgramme testCourse = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1900-01-23"), DateTime.parse("2000-12-25"));
        Module testModule = new Module("Software Engineering", 123, new ArrayList<Student>(), new ArrayList<CourseProgramme>());

        testStudent.addCourse(testCourse);
        testStudent.addModule(testModule);

        assertEquals(testCourse, testStudent.getCourses().get(0));
        System.out.println("Add course passed");
        assertEquals(testModule, testStudent.getModulesReg().get(0));
        System.out.println("Add module passed");
        System.out.println("=============================================\n");
    }
}
