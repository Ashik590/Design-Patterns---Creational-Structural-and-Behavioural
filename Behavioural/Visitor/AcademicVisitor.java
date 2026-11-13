interface AcademicVisitor {
    void visit(Course course);
    void visit(LaboratoryCourse laboratoryCourse);
    void visit(Project project);
    void visit(Thesis thesis);
}
