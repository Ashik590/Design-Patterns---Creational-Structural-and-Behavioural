public class TranscriptGenerationVisitor implements AcademicVisitor {
    private StringBuilder transcript;
    public TranscriptGenerationVisitor() {
        this.transcript = new StringBuilder();
    }
    @Override
    public void visit(Course course) {
        transcript.append("Course: ").append(course.getCourseCode()).append(", Marks: ").append(course.getMarks()).append(", Grade: ").append(course.getGrade()).append("\n");
    }

    @Override
    public void visit(LaboratoryCourse laboratoryCourse) {
        transcript.append("Laboratory Course: ").append(laboratoryCourse.getCourseCode()).append(", Marks: ").append(laboratoryCourse.getMarks()).append(", Grade: ").append(laboratoryCourse.getGrade()).append("\n");
    }

    @Override
    public void visit(Project project) {
        transcript.append("Project: ").append(project.getProjectCode()).append(", Marks: ").append(project.getMarks()).append(", Grade: ").append(project.getGrade()).append("\n");
    }

    @Override
    public void visit(Thesis thesis) {
        transcript.append("Thesis: ").append(thesis.getThesisCode()).append(", Marks: ").append(thesis.getMarks()).append(", Grade: ").append(thesis.getGrade()).append("\n");
    }

    public String getTranscript() {
        return transcript.toString();
    }
}
