public class Course implements AcademicComponent {
    private String course_code;
    private int credits;
    private String title;
    private double grade;
    private double marks;

    public Course(String course_code, int credits, String title, double marks) {
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

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
