package pack;

public class PreviewService {
    PreviewService() {
    }

    public void previewResource(Resource resource) {
        System.out.println("Previewing resource: " + resource.getTitle());
        System.out.println("Author: " + resource.getAuthor());
        System.out.println("Category: " + resource.getCategory());
        System.out.println("Format: " + resource.getFormat());
        System.out.println("Available: " + resource.isAvailable());
        if (resource.getBorrowedBy() != null) {
            System.out.println("Borrowed by: " + resource.getBorrowedBy().getUsername());
        }
    }
}
