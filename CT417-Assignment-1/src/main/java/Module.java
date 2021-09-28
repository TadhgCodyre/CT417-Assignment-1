public class Module {
    private String moduleName;
    private int moduleId;
    private String[] relatedModules;

    public Module(String name, int id, String[] modules) {
        this.moduleName = name;
        this.moduleId = id;
        this.relatedModules = modules;
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
}
