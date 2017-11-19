package structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class Font {
    private final FontName name;
    private final Integer size;
    private final Color color;

    private Font(FontName name, Integer size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public FontName getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Font font = (Font) o;
        return name == font.name &&
                Objects.equals(size, font.size) &&
                color == font.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, color);
    }

    /**
     * Created by mtumilowicz on 2017-11-14.
     */
    public static final class FlyweightFactory {
        private static final Map<String, Font> fontCache = new HashMap<>();
        
        public static Font getFont(FontName name, Integer size, Color color) {
            String key = name + ", " + size + ", " + color;
            if (!fontCache.containsKey(key)) {
                fontCache.put(key, new Font(name, size, color));
            }
            
            return fontCache.get(key);
        }
        
        private static String getKey(FontName name, Integer size, Color color) {
            String keyName = "";
            String keySize = "";
            String keyColor = "";
            
            if (name != null) {
                keyName = name.name();
            }
            
            if (size != null) {
                keySize = String.valueOf(size);
            }
            
            if (color != null) {
                keyColor = color.name();
            }
            
            return keyName + ", " + keySize + ", " + keyColor;
        }
    }
}
