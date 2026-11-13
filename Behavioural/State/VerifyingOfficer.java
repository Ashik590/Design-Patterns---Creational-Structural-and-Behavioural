public class VerifyingOfficer {
    private String name;

    public VerifyingOfficer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void verifyDocument(Document document) {
        document.verify(document);
    }

    public void approveDocument(Document document) {
        document.approve(document);
    }

    public void returnDocumentForCorrection(Document document) {
        document.returnForCorrection(document);
    }
}
