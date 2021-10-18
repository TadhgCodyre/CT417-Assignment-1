import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test_Student {
    @Test
    public void testGetUserName() {
        CourseProgramme[] testCourses1 = new CourseProgramme[0];
        Module[] testModules1 = new Module[0];

        //Get proper date object

        Student testStudent = new Student("Jimmy", 21, "01/01/00", 12345, testCourses1, testModules1);

        String testUserName = testStudent.getUserName();
        int testAge = testStudent.getGlobalAge();
        String testDate = testStudent.getDOB();
        int testId = testStudent.getId();
        CourseProgramme[] testCourses2 = testStudent.getCourses();
        Module[] testModules2 = testStudent.getModulesReg();


        //System.out.println(testUserName);
        assertEquals(testUserName, "Jimmy21");
        System.out.println("username passed");
        assertEquals(testAge, 21);
        System.out.println("age passed");
        assertEquals(testDate, "01/01/00");
        System.out.println("date passed");
        assertEquals(testId, 12345);
        System.out.println("Id passed");
        assertEquals(testCourses2, testCourses1);
        System.out.println("courses passed");
        assertEquals(testModules2, testModules2);
        System.out.println("modules passed");
    }
}
