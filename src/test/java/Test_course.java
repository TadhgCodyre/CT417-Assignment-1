import org.joda.time.DateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_course {
    //Create mock module
    CourseProgramme testCourse = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1900-01-23"), DateTime.parse("2000-12-25"));

    @Test
    public void testCourse() {
        //Get student information for testing
        String testName = testCourse.getCourseName();
        ArrayList<Module> testCourses = testCourse.getModuleList();
        ArrayList<Student> testStudents = testCourse.getStudentList();
        DateTime testStartDate = testCourse.getStartDate();
        DateTime testEndDate = testCourse.getEndDate();

        //Testing to see if they are correct
        assertEquals(testName, "Computer Science");
        System.out.println("course name passed");
        assertEquals(testCourses, new ArrayList<CourseProgramme>());
        System.out.println("course modules passed");
        assertEquals(testStudents, new ArrayList<Student>());
        System.out.println("course students passed");
        assertEquals(testStartDate, DateTime.parse("1900-01-23"));
        System.out.println("course start date passed");
        assertEquals(testEndDate, DateTime.parse("2000-12-25"));
        System.out.println("course end date passed");
        System.out.println("=============================================\n");
    }

    @Test
    public void testAdd() {
        Module testModule = new Module("Software Engineering", 123, new ArrayList<Student>(), new ArrayList<CourseProgramme>());
        Student testStudent = new Student("Jimmy", 21, DateTime.parse("1955-1-1"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

        testCourse.addModule(testModule);
        testCourse.addStudent(testStudent);

        assertEquals(testModule, testCourse.getModuleList().get(0));
        System.out.println("Add Module passed");
        assertEquals(testStudent, testCourse.getStudentList().get(0));
        System.out.println("Add student passed");
        System.out.println("=============================================\n");
    }
}
