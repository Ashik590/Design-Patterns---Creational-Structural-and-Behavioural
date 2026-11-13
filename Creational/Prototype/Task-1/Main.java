public class Main {
    public static void main(String[] args) {
        TheoryExamPaper exam1 = new TheoryExamPaper("CSE101", "IIT", "Nothing special", "10", "Sec A", "May 23");

        LabExamPaper exam2 = new LabExamPaper("CSE201", "IIT", "Nothing special", "20", "Sec B", "May 25");
        ExamPaper exam3 = new ExamPaper("CSE301", "IIT", "Nothing special", "30", "Sec A", "May 30");

        ExamGenerator examGenerator = new ExamGenerator(exam3);

        ExamPaper newExam = examGenerator.generateSectionA();

        // exam2.displayPaper();
        newExam.displayPaper();
    }
}
