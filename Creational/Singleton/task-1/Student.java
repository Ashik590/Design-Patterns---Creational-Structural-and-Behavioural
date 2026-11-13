public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void submitAttendance() {
        Logger.getInstance().logActivity("Student " + name + " submitted Attendance");
    }

    public void login() {
        Logger.getInstance().logActivity("Student "+name + " logged in");
    }
}
