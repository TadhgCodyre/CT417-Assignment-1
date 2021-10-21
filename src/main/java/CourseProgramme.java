import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;

public class CourseProgramme {
    private String courseName;
    private ArrayList<Module> moduleList;
    private ArrayList<Student> studentList;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime sDate, DateTime eDate) {
        this.courseName = name;
        this.moduleList = modules;
        this.studentList = students;
        this.startDate = sDate;
        this.endDate = eDate;
    }

    public void addModule(Module module) {
        if (module != null && !moduleList.contains(module)) {
            moduleList.add(module);
            module.addCourse(this);
        }
    }

    public void addStudent(Student student) {
        if (student != null && !studentList.contains(student)) {
            studentList.add(student);
            student.addCourse(this);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Module> getModuleList() {
        return moduleList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
}
