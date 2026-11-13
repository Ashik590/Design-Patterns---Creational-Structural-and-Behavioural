public class Thesis implements AcademicComponent {
    private String course_code;
    private int credits;
    private String title;
    private Double grade;
    private Double marks;
    private String supervisor;

    public Thesis(String course_code, int credits, String title, Double marks, String supervisor) {
        this.course_code = course_code;
        this.credits = credits;
        this.title = title;
        this.marks = marks;
        this.supervisor = supervisor;
    }

    public String getThesisCode() {
        return course_code;
    }

    public int getCredits() {
        return credits;
    }

    public String getTitle() {
        return title;
    }

    public Double getGrade() {
        return grade;
    }

    public Double getMarks() {
        return marks;
    }

    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public void accept(AcademicVisitor visitor) {
        visitor.visit(this);
    }

    void setGrade(Double grade) {
        this.grade = grade;
    }
}
