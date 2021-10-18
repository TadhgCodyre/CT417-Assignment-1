public class Student {
    private String globalName;
    private int globalAge;
    private String DOB;
    private int id;
    private String userName;
    private String[] courses;
    private String[] modulesReg;

    //constructor
    public Student(String name, int age, String date, int Id, String[] courses, String[] modules) {
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

    public int getGlobalAge() {
        return globalAge;
    }

    public String getDOB() {
        return DOB;
    }

    public int getId() {
        return id;
    }

    public String[] getCourses() {
        return courses;
    }

    public String[] getModulesReg() {
        return modulesReg;
    }
}
