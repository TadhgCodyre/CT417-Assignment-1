public class CourseProgramme {
    private String courseName;
    private String[] moduleList;
    private String[] studentList;
    private String startDate;
    private String endDate;

    public CourseProgramme(String name, String[] modules, String[] students, String sDate, String eDate) {
        this.courseName = name;
        this.moduleList = modules;
        this.studentList = students;
        this.startDate = sDate;
        this.endDate = eDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getModuleList() {
        return moduleList;
    }

    public String[] getStudentList() {
        return studentList;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
