public class CreditCalculationVisitor implements AcademicVisitor {
    private double totalCredits;

    public CreditCalculationVisitor() {
        this.totalCredits = 0;
    }

    @Override
    public void visit(Course course) {
        if(course.getMarks() >= 40) {
            totalCredits += course.getCredits();
        }
    }

    @Override
    public void visit(LaboratoryCourse laboratoryCourse) {
        if(laboratoryCourse.getMarks() >= 40) {
            totalCredits += laboratoryCourse.getCredits();
        }
    }

    @Override
    public void visit(Project project) {
        if(project.getMarks() >= 40) {
            totalCredits += project.getCredits();
        }
    }

    @Override
    public void visit(Thesis thesis) {
        if(thesis.getMarks() >= 40) {
            totalCredits += thesis.getCredits();
        }
    }

    public double getTotalCredits() {
        return totalCredits;
    }
    
}
