public class ApprovingOfficer {
    private String name;

    public ApprovingOfficer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void approveDocument(Document document) {
        document.approve(document);
    }

    public void rejectDocument(Document document) {
        document.reject(document);
    }
}
