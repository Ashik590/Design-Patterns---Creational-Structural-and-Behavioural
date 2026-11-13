public class Project implements AcademicComponent {
    private String course_code;
    private int credits;
    private String title;
    private double grade;
    private double marks;
    private String supervisor;

    public Project(String course_code, int credits, String title, double marks, String supervisor) {
        this.course_code = course_code;
        this.credits = credits;
        this.title = title;
        this.marks = marks;
        this.supervisor = supervisor;
    }

    public String getProjectCode() {
        return course_code;
    }

    public int getCredits() {
        return credits;
    }

    public String getTitle() {
        return title;
    }

    public double getGrade() {
        return grade;
    }

    public double getMarks() {
        return marks;
    }
    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public void accept(AcademicVisitor visitor) {
        visitor.visit(this);
    }
    
    void setGrade(double grade) {
        this.grade = grade;
    }
}
