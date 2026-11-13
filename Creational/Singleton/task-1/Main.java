public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ashik");
        Teacher teacher = new Teacher("Aziz");

        Admin admin = new Admin("Admin vai");

        student.login();
        student.submitAttendance();
        teacher.approveRequest();
        teacher.updateAttendance();
        admin.generateReport();


        for (String string : Logger.getInstance().getLogs()) {
            System.out.println(string);
        }
    }
}
