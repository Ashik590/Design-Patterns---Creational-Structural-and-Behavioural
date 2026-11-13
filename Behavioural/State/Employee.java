public class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Document createDocument(String docId, String title, String date, String remarks) {
        return new Document(docId, title, name, department, date, remarks);
    }

    public void editDocument(Document document) {
        document.edit(document);
    }

    public void submitDocument(Document document) {
        document.submit(document);
    }
}
