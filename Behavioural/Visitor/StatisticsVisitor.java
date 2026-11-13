public class StatisticsVisitor implements AcademicVisitor {
    private int totalPass;
    private int totalFail;
    private int totalMarks;
    private double highestGrade;

    public StatisticsVisitor() {
        this.totalPass = 0;
        this.totalFail = 0;
        this.totalMarks = 0;
        this.highestGrade = 0.0;
    }

    public double getHighestGrade() {
        return highestGrade;
    }

    public int getTotalPass() {
        return totalPass;
    }

    public int getTotalFail() {
        return totalFail;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public void visit(Course course) {
        totalMarks += course.getMarks();
        if (course.getGrade() >= 2.0) {
            totalPass++;
        } else {
            totalFail++;
        }
        if (course.getGrade() > highestGrade) {
            highestGrade = course.getGrade();
        }
    }

    @Override
    public void visit(LaboratoryCourse laboratoryCourse) {
        totalMarks += laboratoryCourse.getMarks();
        if (laboratoryCourse.getGrade() >= 2.0) {
            totalPass++;
        } else {
            totalFail++;
        }
        if (laboratoryCourse.getGrade() > highestGrade) {
            highestGrade = laboratoryCourse.getGrade();
        }
    }

    @Override
    public void visit(Project project) {
        totalMarks += project.getMarks();
        if (project.getGrade() >= 2.0) {
            totalPass++;
        } else {
            totalFail++;
        }
        if (project.getGrade() > highestGrade) {
            highestGrade = project.getGrade();
        }
    }

    @Override
    public void visit(Thesis thesis) {
        totalMarks += thesis.getMarks();
        if (thesis.getGrade() >= 2.0) {
            totalPass++;
        } else {
            totalFail++;
        }
        if (thesis.getGrade() > highestGrade) {
            highestGrade = thesis.getGrade();
        }
    }
}
