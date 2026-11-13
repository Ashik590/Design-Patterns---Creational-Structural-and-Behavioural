public class OfficeAdministrator {
    private String name;

    public OfficeAdministrator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void archiveDocument(Document document) {
        document.archive(document);
    }
}
