public class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void generateReport() {
        Logger.getInstance().logActivity("Admin "+name + " generated Report");
    }
}
