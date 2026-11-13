import java.util.ArrayList;

public class ExamPaper implements Prototype {
    private String title;
    private String departmentName;
    private String instructions;
    private String marksDistribution;
    private String examDate;
    private String sectionName;
    private ArrayList<String> quesList;

    public void addQue(String que) {
        this.quesList.add(que);
    }

    public void rmQue(String que) {
        this.quesList.remove(que);
    }

    public void displayPaper() {
        System.out.println("Title = " + title);
        System.out.println("Dept = " + departmentName);
        System.out.println("Instruction = " + instructions);
        System.out.println("Mark Dist = " + marksDistribution);
        System.out.println("Exam Date = " + examDate);
        System.out.println("Sec Name = " + sectionName);
        System.out.println("Number of que = " + quesList.size());
    }

    public ExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName, String examDate) {

        this.title = title;
        this.departmentName = departmentName;
        this.instructions = instructions;
        this.examDate = examDate;
        this.marksDistribution = marksDistribution;
        this.sectionName = sectionName;
        this.quesList = new ArrayList<>();
    }

    public ExamPaper(String title, String departmentName,
            String instructions,
            String marksDistribution,
            String sectionName,String examDate, ArrayList<String> quesList) {

        this(title, departmentName, instructions, marksDistribution, sectionName, examDate);
        this.quesList = new ArrayList<>(quesList);
    }

    public ExamPaper(ExamPaper template) {
        if (template == null)
            throw new NullPointerException();

        this.title = template.title;
        this.departmentName = template.departmentName;
        this.instructions = template.instructions;
        this.examDate = template.examDate;
        this.marksDistribution = template.marksDistribution;
        this.sectionName = template.sectionName;
        this.quesList = new ArrayList<>(template.quesList);
    }

    public ExamPaper clone() {
        return new ExamPaper(this);
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}
