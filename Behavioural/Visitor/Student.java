import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<AcademicComponent> academicComponents;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.academicComponents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addAcademicComponent(AcademicComponent component) {
        academicComponents.add(component);
    }

    public List<AcademicComponent> getAcademicComponents() {
        return academicComponents;
    }

    public void removeAcademicComponent(AcademicComponent component) {
        academicComponents.remove(component);
    }

    public void processRecords(AcademicVisitor visitor) {
        for (AcademicComponent component : academicComponents) {
            component.accept(visitor);
        }
    }
}
