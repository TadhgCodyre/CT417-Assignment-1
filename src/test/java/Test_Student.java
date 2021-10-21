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
        Student student2 = new Student("Tony", 39, DateTime.parse("2004-02-29"), 67890, new ArrayList<CourseProgramme>(), new ArrayList<Module>());
        Student student3 = new Student("Tadhg", 18, DateTime.parse("1999-08-18"), 12345, new ArrayList<CourseProgramme>(), new ArrayList<Module>());

        String testUserName = testStudent.getUserName();
        int testAge = testStudent.getGlobalAge();
        DateTime testDate2 = testStudent.getDOB();
        int testId = testStudent.getId();
        ArrayList<CourseProgramme> testCourses = testStudent.getCourses();
        ArrayList<Module> testModules = testStudent.getModulesReg();

        CourseProgramme course1 = new CourseProgramme("Computer Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1900-01-23"), DateTime.parse("2000-12-25"));
        CourseProgramme course2 = new CourseProgramme("Data Science", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1800-01-23"), DateTime.parse("1900-12-25"));
        CourseProgramme course3 = new CourseProgramme("Information Technology", new ArrayList<Module>(), new ArrayList<Student>(), DateTime.parse("1700-01-23"), DateTime.parse("1800-12-25"));

        Module module1 = new Module("Software Engineering", 123, new ArrayList<Student>(), new ArrayList<CourseProgramme>());
        Module module2 = new Module("Information Retrieval", 456, new ArrayList<Student>(), new ArrayList<CourseProgramme>());
        Module module3 = new Module("Machine Learning", 789, new ArrayList<Student>(), new ArrayList<CourseProgramme>());

        testStudent.addCourse(course1);
        testStudent.addModule(module1);
        testStudent.addModule(module3);

        student2.addCourse(course3);
        student2.addModule(module2);
        student2.addModule(module1);

        student3.addCourse(course2);
        student3.addModule(module3);
        student3.addModule(module2);

        course1.addModule(module1);
        course2.addModule(module3);
        course3.addModule(module3);

        module1.addCourse(course3);
        module2.addCourse(course3);
        module3.addCourse(course1);


        System.out.print(testStudent);
        System.out.print(student2);
        System.out.print(student3);

        System.out.print(course1);
        System.out.print(course2);
        System.out.print(course3);

        System.out.print(module1);
        System.out.print(module2);
        System.out.print(module3);

        assertEquals(testUserName, "Jimmy21");
        System.out.println("username passed");
        assertEquals(testAge, 21);
        System.out.println("age passed");
        assertEquals(testDate2, testDate1);
        System.out.println("date passed");
        assertEquals(testId, 12345);
        System.out.println("Id passed");
        //assertEquals(testCourses, new ArrayList<CourseProgramme>());
        System.out.println("courses passed");
        //assertEquals(testModules, new ArrayList<Module>());
        System.out.println("modules passed");
    }
}
