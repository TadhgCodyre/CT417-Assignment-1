public class Student {
    private String globalName;
    private int globalAge;
    private String DOB;
    private int id;
    private String userName;
    private String courses;
    private String modulesReg;

    //constructor
    public Student(String name, int age) {
        this.globalName = name;
        this.globalAge = age;

        this.userName = getUserName(globalName, globalAge);
    }

    public String getUserName(String localName, int localAge) {
        String userName = localName+localAge;
        return userName;
    }
}
