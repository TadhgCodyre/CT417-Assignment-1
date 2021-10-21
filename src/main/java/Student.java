import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {
    private String globalName;
    private int globalAge;
    private DateTime DOB;
    private int id;
    private String userName;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modulesReg;

    //constructor
    public Student(String name, int age, DateTime date, int Id, ArrayList<CourseProgramme> courses, ArrayList<Module> modules) {
        this.globalName = name;
        this.globalAge = age;
        this.DOB = date;
        this.id = Id;
        this.courses = courses;
        this.modulesReg = modules;
        this.userName = globalName+globalAge;
    }

    public String getUserName() {
        return userName;
    }

    public void addCourse(CourseProgramme course) {
        if (course != null && !courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void addModule(Module module) {
        if (module != null && !modulesReg.contains(module)){
            modulesReg.add(module);
            module.addStudent(this);
        }
    }

    public int getGlobalAge() { return globalAge; }

    public DateTime getDOB() {
        return DOB;
    }

    public int getId() {
        return id;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModulesReg() {
        return modulesReg;
    }
}
