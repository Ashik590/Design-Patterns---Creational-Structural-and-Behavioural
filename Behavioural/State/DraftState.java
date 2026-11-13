public class DraftState implements State {
    @Override
    public void edit(Document document) {
        System.out.println("Editing the document in Draft state.");
    }

    @Override
    public void submit(Document document) {
        System.out.println("Submitting the document for verification.");

        document.setState(new SubmittedState());
    }

    @Override
    public void verify(Document document) {
        throw new IllegalStateException("Cannot verify the document in Draft state.");
    }

    @Override
    public void approve(Document document) {
        throw new IllegalStateException("Cannot approve the document in Draft state.");
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Draft state.");
    }

    @Override
    public void returnForCorrection(Document document) {
        throw new IllegalStateException("Cannot return the document for correction in Draft state.");
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Cannot archive the document in Draft state.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Draft state.");
    }

}
