import java.util.ArrayList;

public class LabExamPaper extends ExamPaper {
    private ArrayList<String> labQueList;

    public LabExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName, String examDate, ArrayList<String> quesList) {
        super(title, departmentName, instructions, marksDistribution, sectionName, examDate, quesList);
        labQueList = new ArrayList<>();
    }

    public LabExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName, String examDate) {
        super(title, departmentName, instructions, marksDistribution, sectionName, examDate);
        labQueList = new ArrayList<>();
    }

    public LabExamPaper(LabExamPaper template) {
        super(template);
        labQueList = new ArrayList<>(template.labQueList);
    }

    public void addLabQuestion(String que) {
        labQueList.add(que);
    }

    public void rmLabQuestion(String que) {
        labQueList.remove(que);
    }

    @Override
    public LabExamPaper clone() {
        return new LabExamPaper(this);
    }

    @Override
    public void displayPaper() {
        super.displayPaper();
        System.out.println("Number of Lab ques = " + labQueList.size());
    }
}
