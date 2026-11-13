package pack;
public class Resource {
    private String title;
    private String author;
    private String category;
    private String format;
    private boolean isAvailable;
    private User borrowedBy;

    Resource(String title, String author, String category, String format) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.format = format;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    void setBorrowedBy(User user) {
        this.borrowedBy = user;
        this.isAvailable = false;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getCategory() {
        return category;
    }

    public String getFormat() {
        return format;
    }

    public String getAuthor() {
        return author;
    }

    public User getBorrowedBy() {
        return borrowedBy;
    }
}
