public class LaboratoryCourse implements AcademicComponent {
    private String course_code;
    private int credits;
    private String title;
    private double grade;
    private double marks;

    public LaboratoryCourse(String course_code, int credits, String title, double marks) {
        this.course_code = course_code;
        this.credits = credits;
        this.title = title;
        this.marks = marks;
    }

    public String getCourseCode() {
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

    @Override
    public void accept(AcademicVisitor visitor) {
        visitor.visit(this);
    }

    void setGrade(double grade) {
        this.grade = grade;
    }
}
