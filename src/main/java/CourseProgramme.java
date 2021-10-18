public class CourseProgramme {
    private String courseName;
    private Module[] moduleList;
    private Student[] studentList;
    private String startDate;
    private String endDate;

    public CourseProgramme(String name, Module[] modules, Student[] students, String sDate, String eDate) {
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

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
