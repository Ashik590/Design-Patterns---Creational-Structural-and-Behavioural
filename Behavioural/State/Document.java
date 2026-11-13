public class Document {
    private State state;

    private String id;
    private String title;
    private String creator;
    private String department;
    private String date;
    private String remarks;

    public Document(String id, String title, String creator, String department, String date, String remarks) {
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.department = department;
        this.date = date;
        this.remarks = remarks;
        this.state = new DraftState();
    }

    public void edit(Document document) {
        state.edit(document);
    }

    public void submit(Document document) {
        state.submit(document);
    }

    public void verify(Document document) {
        state.verify(document);
    }

    public void approve(Document document) {
        state.approve(document);
    }

    public void reject(Document document) {
        state.reject(document);
    }

    public void returnForCorrection(Document document) {
        state.returnForCorrection(document);
    }

    public void archive(Document document) {
        state.archive(document);
    }

    public void displayStatus() {
        state.displayStatus();
    }

    public void setState(State state) {
        this.state = state;
    }
}