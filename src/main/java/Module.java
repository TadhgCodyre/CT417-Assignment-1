public class Module {
    private String moduleName;
    private int moduleId;
    private String[] relatedModules;
    private String[] relatedCourses;

    public Module(String name, int id, String[] modules, String[] courses) {
        this.moduleName = name;
        this.moduleId = id;
        this.relatedModules = modules;
        this.relatedCourses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public String[] getRelatedModules() {
        return relatedModules;
    }

    public String[] getRelatedCourses() { return relatedCourses; }
}
