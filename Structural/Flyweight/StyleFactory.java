import java.util.Map;
import java.util.HashMap;

public class StyleFactory {
    private Map<String, CharacterStyle> styleMap;

    public StyleFactory() {
        this.styleMap = new HashMap<>();
    }

    public CharacterStyle getStyle(String fontFamily, int fontSize, boolean bold, boolean italic, boolean underline, String color) {
        if(this.styleMap.containsKey(fontFamily+'-'+fontSize+'-'+bold+'-'+italic+'-'+underline+'-'+color)) {
            return this.styleMap.get(fontFamily+'-'+fontSize+'-'+bold+'-'+italic+'-'+underline+'-'+color);
        } else {
            CharacterStyle newStyle = new CharacterStyle(fontFamily, fontSize, bold, italic, underline, color);
            this.styleMap.put(fontFamily+'-'+fontSize+'-'+bold+'-'+italic+'-'+underline+'-'+color, newStyle);
            return newStyle;
        }
    }

    public int getStyleCount() {
        return this.styleMap.size();
    }
}