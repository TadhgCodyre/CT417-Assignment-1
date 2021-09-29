import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Student {
    @Test
    public void testGetUserName() {
        Student testStudent = new Student("Jimmy", 21);

        String testUserName = testStudent.getUserName();

        System.out.println(testUserName);
        //assertEquals(testUserName, "Jimmy21");
    }
}
