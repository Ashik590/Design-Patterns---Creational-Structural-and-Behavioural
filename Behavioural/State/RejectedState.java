public class RejectedState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Rejected state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Rejected state.");
    }

    @Override
    public void verify(Document document) {
        throw new IllegalStateException("Cannot verify the document in Rejected state.");
    }

    @Override
    public void approve(Document document) {
        throw new IllegalStateException("Cannot approve the document in Rejected state.");
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Rejected state.");
    }

    @Override
    public void returnForCorrection(Document document) {
        System.out.println("Returning the document for correction in Rejected state.");
        document.setState(new DraftState());
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Cannot archive the document in Rejected state.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Rejected state.");
    }
    
}
