public class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void display_info() {
        System.out.println("File: " + name + ", Size: " + size + " bytes");
    }

    @Override
    public int size() {
        return size;
    }
    
}
