import org.joda.time.DateTime;

import java.util.Date;

public class CourseProgramme {
    private String courseName;
    private Module[] moduleList;
    private Student[] studentList;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String name, Module[] modules, Student[] students, DateTime sDate, DateTime eDate) {
        this.courseName = name;
        this.moduleList = modules;
        this.studentList = students;
        this.startDate = sDate;
        this.endDate = eDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public Module[] getModuleList() {
        return moduleList;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
}
