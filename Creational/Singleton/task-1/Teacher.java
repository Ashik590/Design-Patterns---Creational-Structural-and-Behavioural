public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void updateAttendance() {
        Logger.getInstance().logActivity("Teacher " +name + " updated Attendance");
    }

    public void approveRequest() {
        Logger.getInstance().logActivity("Teacher " +name + " approved request");
    }
}