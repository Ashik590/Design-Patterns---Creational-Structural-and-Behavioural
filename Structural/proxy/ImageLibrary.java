import java.util.HashMap;
import java.util.Map;

public class ImageLibrary {
    private Map<String, ImageMetaData> imageMap;

    public ImageLibrary() {
        this.imageMap = new HashMap<>();
    }

    public void addImage(String name, ImageMetaData metaData) {
        imageMap.put(name, metaData);
    }

    public Image getImage(String name) {
        ImageMetaData metaData = imageMap.get(name);
        if (metaData != null) {
            return new ProxyImage(metaData);
        }
        return null;
    }
}
