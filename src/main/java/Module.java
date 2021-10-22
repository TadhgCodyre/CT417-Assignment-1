import java.util.ArrayList;

public class Module {
    private String moduleName;
    private int moduleId;
    private ArrayList<Student> relatedStudents;
    private ArrayList<CourseProgramme> relatedCourses;

    public Module(String name, int id, ArrayList<Student> students, ArrayList<CourseProgramme> courses) {
        this.moduleName = name;
        this.moduleId = id;
        this.relatedStudents = students;
        this.relatedCourses = courses;
    }

    public void addCourse(CourseProgramme course) {
        if (course != null && !relatedCourses.contains(course)){
            relatedCourses.add(course);
            course.addModule(this);
        }
    }

    public void addStudent(Student student) {
        if (student != null && !relatedStudents.contains(student)){
            relatedStudents.add(student);
            student.addModule(this);
        }
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public ArrayList<Student> getRelatedStudent() {
        return relatedStudents;
    }

    public ArrayList<CourseProgramme> getRelatedCourses() { return relatedCourses; }

    public String toString() {
        String output = "Module: " +getModuleName()+ ", Module ID: "+getModuleId()+ "\n"
                + "Students: "+printStudentIds()+"\n"
                + "Courses: "+printCourseNames()+"\n"
                + "----------------------------------------------------\n";
        return output;
    }

    private StringBuffer printStudentIds() {
        StringBuffer courseNames = new StringBuffer();
        for (int i = 0; i < relatedStudents.size(); i++) {
            courseNames.append(relatedStudents.get(i).getId()+", ");
        }
        return courseNames;
    }

    private StringBuffer printCourseNames() {
        StringBuffer moduleNames = new StringBuffer();
        for (int j = 0; j < relatedCourses.size(); j++) {
            moduleNames.append(relatedCourses.get(j).getCourseName()+", ");
        }
        return moduleNames;
    }
}
