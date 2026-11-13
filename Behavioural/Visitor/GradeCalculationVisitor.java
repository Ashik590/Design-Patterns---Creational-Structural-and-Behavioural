public class GradeCalculationVisitor implements AcademicVisitor {
    @Override
    public void visit(Course course) {
        double marks = course.getMarks();
        if (marks >= 90) {
            course.setGrade(4.0);
        } else if (marks >= 80) {
            course.setGrade(3.5);
        } else if (marks >= 70) {
            course.setGrade(3.0);
        } else if (marks >= 60) {
            course.setGrade(2.5);
        } else if (marks >= 50) {
            course.setGrade(2.0);
        } else if (marks >= 40) {
            course.setGrade(1.5);
        } else {
            course.setGrade(0.0);
        }
    }

    @Override
    public void visit(LaboratoryCourse laboratoryCourse) {
        double marks = laboratoryCourse.getMarks();
        if (marks >= 90) {
            laboratoryCourse.setGrade(4.0);
        } else if (marks >= 80) {
            laboratoryCourse.setGrade(3.5);
        } else if (marks >= 70) {
            laboratoryCourse.setGrade(3.0);
        } else if (marks >= 60) {
            laboratoryCourse.setGrade(2.5);
        } else if (marks >= 50) {
            laboratoryCourse.setGrade(2.0);
        } else if (marks >= 40) {
            laboratoryCourse.setGrade(1.5);
        } else {
            laboratoryCourse.setGrade(0.0);
        }
    }

    @Override
    public void visit(Project project) {
        double marks = project.getMarks();
        if (marks >= 90) {
            project.setGrade(4.0);
        } else if (marks >= 80) {
            project.setGrade(3.5);
        } else if (marks >= 70) {
            project.setGrade(3.0);
        } else if (marks >= 60) {
            project.setGrade(2.5);
        } else if (marks >= 50) {
            project.setGrade(2.0);
        } else if (marks >= 40) {
            project.setGrade(1.5);
        } else {
            project.setGrade(0.0);
        }
    }

    @Override
    public void visit(Thesis thesis) {
        double marks = thesis.getMarks();
        if (marks >= 90) {
            thesis.setGrade(4.0);
        } else if (marks >= 80) {
            thesis.setGrade(3.5);
        } else if (marks >= 70) {
            thesis.setGrade(3.0);
        } else if (marks >= 60) {
            thesis.setGrade(2.5);
        } else if (marks >= 50) {
            thesis.setGrade(2.0);
        } else if (marks >= 40) {
            thesis.setGrade(1.5);
        } else {
            thesis.setGrade(0.0);
        }
    }

}
