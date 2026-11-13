public class PendingApprovalState implements State {
    @Override
    public void edit(Document document) {
        throw new IllegalStateException("Cannot edit the document in Pending Approval state.");
    }

    @Override
    public void submit(Document document) {
        throw new IllegalStateException("Cannot submit the document in Pending Approval state.");
    }

    @Override
    public void verify(Document document) {
        throw new IllegalStateException("Cannot verify the document in Pending Approval state.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Approving the document in Pending Approval state.");
        document.setState(new ApprovedState());
    }

    @Override
    public void reject(Document document) {
        System.out.println("Rejecting the document in Pending Approval state.");
        document.setState(new RejectedState());
    }

    @Override
    public void returnForCorrection(Document document) {
        throw new IllegalStateException("Cannot return the document for correction in Pending Approval state.");
    }

    @Override
    public void archive(Document document) {
        throw new IllegalStateException("Cannot archive the document in Pending Approval state.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Document is currently in Pending Approval state.");
    }
    
}
