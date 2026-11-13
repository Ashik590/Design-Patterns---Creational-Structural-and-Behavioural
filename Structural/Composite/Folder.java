import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display_info() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.display_info();
        }
    }

    @Override
    public int size() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.size();
        }
        return totalSize;
    }
    
}
