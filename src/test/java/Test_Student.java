import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Student {
    @Test
    public void testGetUserName() {
        DateTime testDate1 = new DateTime();

        //Get proper date object

        Student testStudent = new Student("Jimmy", 21, testDate1, 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

        String testUserName = testStudent.getUserName();
        int testAge = testStudent.getGlobalAge();
        DateTime testDate2 = testStudent.getDOB();
        int testId = testStudent.getId();
        ArrayList<CourseProgramme> testCourses = testStudent.getCourses();
        ArrayList<Module> testModules = testStudent.getModulesReg();

        assertEquals(testUserName, "Jimmy21");
        System.out.println("username passed");
        assertEquals(testAge, 21);
        System.out.println("age passed");
        assertEquals(testDate2, testDate1);
        System.out.println("date passed");
        assertEquals(testId, 12345);
        System.out.println("Id passed");
        assertEquals(testCourses, new ArrayList<CourseProgramme>());
        System.out.println("courses passed");
        assertEquals(testModules, new ArrayList<Module>());
        System.out.println("modules passed");
    }
}
