public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345);

        Course course1 = new Course("CS101", 3, "Introduction to Computer Science", 85.0);
        Course course2 = new Course("MATH201", 4, "Calculus II", 78.0);
        LaboratoryCourse labCourse = new LaboratoryCourse("PHY101L", 1, "Physics Lab", 92.0);
        Project project = new Project("CS301P", 2, "Software Engineering Project", 88.0, "Alice Smith");
        Thesis thesis = new Thesis("CS401T", 5, "Master's Thesis", 95.0, "Dr. Bob Johnson");

        student.addAcademicComponent(course1);
        student.addAcademicComponent(course2);
        student.addAcademicComponent(labCourse);
        student.addAcademicComponent(project);
        student.addAcademicComponent(thesis);

        GradeCalculationVisitor gradeVisitor = new GradeCalculationVisitor();
        student.processRecords(gradeVisitor);

        CreditCalculationVisitor creditVisitor = new CreditCalculationVisitor();
        student.processRecords(creditVisitor);

        StatisticsVisitor statisticsVisitor = new StatisticsVisitor();
        student.processRecords(statisticsVisitor);

        System.out.println("Total Credits Earned: " + creditVisitor.getTotalCredits());
        System.out.println("Total Pass : " + statisticsVisitor.getTotalPass());
        System.out.println("Total Fail : " + statisticsVisitor.getTotalFail());
        System.out.println("Total Marks : " + statisticsVisitor.getTotalMarks());
        System.out.println("Highest Grade : " + statisticsVisitor.getHighestGrade());
        
        TranscriptGenerationVisitor visitor = new TranscriptGenerationVisitor();
        student.processRecords(visitor);
        System.out.println("Transcript :");
        System.out.println(visitor.getTranscript());

    }
}
