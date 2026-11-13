public class UnderVerificationState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Under Verification state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Under Verification state.");
    }

    @Override
    public void verify(Document document) {
        System.out.println("Verifying the document in Under Verification state.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Approving the document in Under Verification state.");
        document.setState(new PendingApprovalState());
    }

    @Override
    public void reject(Document document) {
        throw new IllegalStateException("Cannot reject the document in Under Verification state.");
    }
    
    @Override
    public void returnForCorrection(Document document) {
        System.out.println("Returning the document for correction in Under Verification state.");
        document.setState(new DraftState());
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Cannot archive the document in Under Verification state.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Under Verification state.");
    }
    
}
