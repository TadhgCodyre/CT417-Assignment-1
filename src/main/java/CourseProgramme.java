import org.joda.time.DateTime;

import java.util.ArrayList;

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

    public String toString() {
        String output = "Course: " +getCourseName()+ ", Start Date: "+getStartDate()+ ", End date: "
                + getEndDate() + "\n"
                + "Students: "+printStudentIds()+"\n"
                + "Modules: "+printModuleNames()+"\n"
                + "----------------------------------------------------\n";
        return output;
    }

    private StringBuffer printStudentIds() {
        StringBuffer courseNames = new StringBuffer();
        for (int i = 0; i < studentList.size(); i++) {
            courseNames.append(studentList.get(i).getId()+", ");
        }
        return courseNames;
    }

    private StringBuffer printModuleNames() {
        StringBuffer moduleNames = new StringBuffer();
        for (int j = 0; j < moduleList.size(); j++) {
            moduleNames.append(moduleList.get(j).getModuleName()+", ");
        }
        return moduleNames;
    }
}
