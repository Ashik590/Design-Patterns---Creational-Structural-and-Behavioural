public class ArchivedState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Archived state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Archived state.");
    }

    @Override
    public void verify(Document document) {
        throw new IllegalStateException("Cannot verify the document in Archived state.");
    }

    @Override
    public void approve(Document document) {
        throw new IllegalStateException("Cannot approve the document in Archived state.");
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Archived state.");
    }

    @Override
    public void returnForCorrection(Document document) {
        throw new IllegalStateException("Cannot return the document for correction in Archived state.");
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Document is already archived.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Archived state.");
    }
    
}
