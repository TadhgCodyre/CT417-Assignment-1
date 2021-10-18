public class Module {
    private String moduleName;
    private int moduleId;
    private Student[] relatedStudents;
    private CourseProgramme[] relatedCourses;

    public Module(String name, int id, Student[] students, CourseProgramme[] courses) {
        this.moduleName = name;
        this.moduleId = id;
        this.relatedStudents = students;
        this.relatedCourses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public Student[] getRelatedStudent() {
        return relatedStudents;
    }

    public CourseProgramme[] getRelatedCourses() { return relatedCourses; }
}
