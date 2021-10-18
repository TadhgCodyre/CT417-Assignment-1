import org.joda.time.DateTime;

public class Student {
    private String globalName;
    private int globalAge;
    private DateTime DOB;
    private int id;
    private String userName;
    private CourseProgramme[] courses;
    private Module[] modulesReg;

    //constructor
    public Student(String name, int age, DateTime date, int Id, CourseProgramme[] courses, Module[] modules) {
        this.globalName = name;
        this.globalAge = age;
        this.DOB = date;
        this.id = Id;
        this.courses = courses;
        this.modulesReg = modules;

        this.userName = getUserName();
    }

    public String getUserName() {
        String userName = globalName+globalAge;
        return userName;
    }

    public int getGlobalAge() { return globalAge; }

    public DateTime getDOB() {
        return DOB;
    }

    public int getId() {
        return id;
    }

    public CourseProgramme[] getCourses() {
        return courses;
    }

    public Module[] getModulesReg() {
        return modulesReg;
    }
}
