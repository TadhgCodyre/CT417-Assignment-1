import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test_Student {
    @Test
    public void testGetUserName() {
        String[] testCourses1 = new String[1];
        testCourses1[0] = "Computer Science";

        String[] testModules1 = new String[1];
        testModules1[0] = "Software Engineering 3";
        Student testStudent = new Student("Jimmy", 21, "01/01/00", 12345, testCourses1, testModules1);

        String testUserName = testStudent.getUserName();
        int testAge = testStudent.getGlobalAge();
        String testDate = testStudent.getDOB();
        int testId = testStudent.getId();
        String[] testCourses2 = testStudent.getCourses();
        String[] testModules2 = testStudent.getModulesReg();


        //System.out.println(testUserName);
        assertEquals(testUserName, "Jimmy21");
        assertEquals(testAge, 21);
        assertEquals(testDate, "01/01/00");
        assertEquals(testId, 12345);
        assertEquals(testCourses2, testCourses1);
        assertEquals(testModules2, testModules2);
    }
}
