public class SubmittedState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Submitted state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Submitted state.");
    }

    @Override
    public void verify(Document document) {
        System.out.println("Verifying the document in Submitted state.");
        document.setState(new UnderVerificationState());
    }

    @Override
    public void approve(Document document) {
        throw new IllegalStateException("Cannot approve the document in Submitted state.");
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Submitted state.");
    }

    @Override
    public void returnForCorrection(Document document) {
        throw new IllegalStateException("Cannot return the document for correction in Submitted state.");
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Cannot archive the document in Submitted state.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Submitted state.");
    }
    
}
