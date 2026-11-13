public class Main {
    public static void main(String[] args) {
        // Create instances of employees and officers
        Employee employee = new Employee("John Doe", "Finance");
        ApprovingOfficer approvingOfficer = new ApprovingOfficer("Jane Smith");
        VerifyingOfficer verifyingOfficer = new VerifyingOfficer("Mike Johnson");
        OfficeAdministrator officeAdministrator = new OfficeAdministrator("Emily Davis");

        // Employee creates a document
        Document document = employee.createDocument("DOC001", "Financial Report", "2024-06-01", "Initial submission");

        document.displayStatus();
        // Employee submits the document
        employee.submitDocument(document);
        document.displayStatus();

        // Verifying officer verifies the document
        verifyingOfficer.verifyDocument(document);
        document.displayStatus();

        verifyingOfficer.returnDocumentForCorrection(document);
        document.displayStatus();

        // Employee edits the document after correction
        employee.editDocument(document);
        document.displayStatus();
        employee.submitDocument(document);

        // Verifiying officer verifies the document again
        verifyingOfficer.verifyDocument(document);
        document.displayStatus();

        verifyingOfficer.approveDocument(document);
        document.displayStatus();

        // Approving Officer approves the document
        approvingOfficer.approveDocument(document);
        document.displayStatus();

        // Office Administrator archives the document
        officeAdministrator.archiveDocument(document);
        document.displayStatus();

        // Method invoking in archive state is illegal
        // employee.editDocument(document);
    }
}
