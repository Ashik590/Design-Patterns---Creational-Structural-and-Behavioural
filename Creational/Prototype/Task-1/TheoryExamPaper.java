import java.util.ArrayList;

public class TheoryExamPaper extends ExamPaper {
    private ArrayList<String> theoryQueList;

    public TheoryExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName, String examDate, ArrayList<String> quesList) {
        super(title, departmentName, instructions, marksDistribution, sectionName, examDate, quesList);
        theoryQueList = new ArrayList<>();
    }

    public TheoryExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName, String examDate) {
        super(title, departmentName, instructions, marksDistribution, sectionName, examDate);
        theoryQueList = new ArrayList<>();
    }

    public TheoryExamPaper(TheoryExamPaper template) {
        super(template);
        theoryQueList = new ArrayList<>(template.theoryQueList);
    }

    public void addEssayQuestion(String que) {
        theoryQueList.add(que);
    }

    public void rmEssayQuestion(String que) {
        theoryQueList.remove(que);
    }

    @Override
    public TheoryExamPaper clone() {
        return new TheoryExamPaper(this);
    }

    @Override
    public void displayPaper() {
        super.displayPaper();
        System.out.println("Number of theory ques = " + theoryQueList.size());
    }
}
