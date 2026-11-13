public class ExamGenerator {
    private ExamPaper template;

    public ExamGenerator(ExamPaper template) {
        this.template = template;
    }

    public ExamPaper generateSectionA() {
        ExamPaper clone = template.clone();
        clone.setSectionName("Sec A");

        return clone;
    }

    public ExamPaper generateSectionB() {
        ExamPaper clone = template.clone();
        clone.setSectionName("Sec B");

        return clone;
    }

    public ExamPaper generateRatakeExam() {
        ExamPaper clone = template.clone();

        return clone;
    }
}
