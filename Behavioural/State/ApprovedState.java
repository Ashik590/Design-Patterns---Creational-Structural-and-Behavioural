public class ApprovedState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Approved state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Approved state.");
    }

    @Override
    public void verify(Document document) {
        throw new IllegalStateException("Cannot verify the document in Approved state.");
    }

    @Override
    public void approve(Document document) {
        throw new IllegalStateException("Cannot approve the document in Approved state.");
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Approved state.");
    }

    @Override
    public void returnForCorrection(Document document) {
        throw new IllegalStateException("Cannot return the document for correction in Approved state.");
    }

    @Override
    public void archive(Document document) {
        System.out.println("Archiving the document in Approved state.");
        document.setState(new ArchivedState());
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Approved state.");
    }
    
}
